import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ScreenShot {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "C://Selenium_Class//geckodriver-v0.18.0-win32//geckodriver.exe");
		 driver=new FirefoxDriver();
		 driver.get("https://www.google.com/");
		 
		 
		 File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	//FileUtils.copyFile(src,new File(System.getProperty("usr.dir")+"/Selenium_02_12/26_11_Selenium/src/google.png"));
		 
		 
	FileUtils.copyFile(src,new File("C:/Users/Shilpa/Desktop/google.png"));
	 
	 
		 
	}

}
