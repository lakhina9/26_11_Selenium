import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWait {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "C://Selenium_Class//geckodriver-v0.18.0-win32//geckodriver.exe");
		
		driver=new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		 driver.get("https://facebook.com");
		 
	WebElement element=	 driver.findElement(By.id("u_0_2"));
	
//	WebDriverWait wait=new WebDriverWait(driver,10);
//	 wait.until(ExpectedConditions.elementToBeClickable(element));
//	 element.click(); 
	//clickOn(driver,element,10);
	clickOn(driver,driver.findElement(By.xpath("//a[text()='Create a Page']")),20);
	 
	}		 
		 
	public static void clickOn(WebDriver driver,WebElement ele,int timeOut){
		WebDriverWait wait=new WebDriverWait(driver,timeOut);
	 wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
		
	}
	}


