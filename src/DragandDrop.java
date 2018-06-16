import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class DragandDrop {

	static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C://Selenium_Class//geckodriver-v0.18.0-win32//geckodriver.exe");
		driver=new FirefoxDriver(); 
		
	/*System.setProperty("WebDriver.chrome.driver", "C:\\Selenium_Class\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver(); */
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/droppable/");
		
		Actions action=new Actions(driver);
		//driver.switchTo().frame(0);
driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
WebElement source=driver.findElement(By.xpath("//*[@id='draggable']"));
WebElement target=driver.findElement(By.xpath("//*[@id='droppable']"));

action.dragAndDrop(source, target);

		

//action.clickAndHold(source).moveToElement(target).release().build().perform();


		
	}

}
