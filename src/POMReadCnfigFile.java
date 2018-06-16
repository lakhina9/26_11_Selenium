import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class POMReadCnfigFile {
	
	public static Properties prop=new  Properties();
	
	
	public static void main(String[] args) throws IOException{
		init();
	}
		
public static void init() throws IOException{
	loadPropertiesFile();
	 System.out.println(prop.getProperty("URL"));
}

public static  void loadPropertiesFile() throws IOException{
	FileInputStream fis;
	File f;

	  f = new File("C:\\config.properties.txt");
	
     fis=new FileInputStream(f);
     prop.load(fis);
    


}


}
