import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

import javax.swing.text.html.parser.Entity;


public class ReadPropertiyFile {

	public static void main(String[] args) throws IOException {
		/*
		 * Properties prop=new Properties();
	File file= new File("C://config.properties.txt");
	FileInputStream fis=new FileInputStream(file);
	prop.load(fis);
	
	System.out.println(prop.getProperty("TOPIC"));
		 */

		try {
			File file = new File("C:\\config.properties.txt");
			FileInputStream fileInput = new FileInputStream(file);
			Properties properties = new Properties();
			properties.load(fileInput);
			fileInput.close();

			Enumeration enuKeys = properties.keys();
			while (enuKeys.hasMoreElements()) {
				String key = (String) enuKeys.nextElement();
				String value = properties.getProperty(key);
				System.out.println(key + ": " + value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	}


