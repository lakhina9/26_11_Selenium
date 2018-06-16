import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FileUploadPopups {

	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://Selenium_Class//geckodriver-v0.18.0-win32//geckodriver.exe");
	driver=new FirefoxDriver(); 
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://html.com/input-type-file/");

	driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("C://googledata.xls");
	
	
	}

}
