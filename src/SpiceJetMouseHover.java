import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class SpiceJetMouseHover {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C://Selenium_Class//geckodriver-v0.18.0-win32//geckodriver.exe");
		driver=new FirefoxDriver();
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.spicejet.com");
	WebElement addon=	driver.findElement(By.xpath("//li[@id='header-addons']"));
		
		Actions action= new Actions(driver);
		action.moveToElement(addon).build().perform();
		Thread.sleep(3000);
	WebElement submenu=driver.findElement(By.xpath("//a[text()='Hot Meals ']"));
	action.moveToElement(submenu).build().perform();
	submenu.click();
	
		
		

	}

}
