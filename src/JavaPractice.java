import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaPractice {
	

  static WebDriver driver;
  
  public static void main(String[] args){
  
 /*System.setProperty("webdriver.chrome.driver", 
		 "C://Selenium_downloads/chromedriver_win32/chromedriver.exe");
 
driver=new ChromeDriver(); */

System.setProperty("webdriver.gecko.driver", "C://Selenium_Class//geckodriver-v0.18.0-win32//geckodriver.exe");
driver=new FirefoxDriver();

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
driver.get("http://www.spicejet.com/");


WebElement addOn=driver.findElement(By.xpath("//a[text()='Add-Ons']"));

Actions action= new Actions(driver);
action.moveToElement(addOn).build().perform();


WebElement Hotmeal=driver.findElement(By.xpath("//a[text()='Hot Meals ']"));

action.moveToElement(Hotmeal).build().perform();

Hotmeal.click();


		
 driver.quit();
 
 
	}
}

