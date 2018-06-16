import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BestbuySampleExample {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
				
		/* System.setProperty("WebDriver.chrome.driver", "C:\\Selenium_Class\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver(); */
		
		System.setProperty("webdriver.gecko.driver", "C://Selenium_Class//geckodriver-v0.18.0-win32//geckodriver.exe");
		driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.bestbuy.com/");
		driver.manage().window().maximize();
	
		//select the location 
		Select select =new Select(driver.findElement(By.name("select_locale")));
		select.selectByIndex(1);
		driver.findElement(By.xpath("//div[@class='go_button']")).click();
		
		//search for keyword
		
		WebElement et=driver.findElement(By.id("gh-search-input"));
	//	et.sendKeys("watches");
	//	et.sendKeys(Keys.ENTER);
		
		et.sendKeys("watches");
	//	et.click();
		
 	Thread.sleep(2000);
	
 	//click on the search button	
	driver.findElement(By.xpath("//span[@class='hf-icon-search']")).click();

	//selected product out of displayed products
	
driver.findElement(By.xpath("//a[text()='Samsung - Gear Fit2 Pro Fitness Watch (Large) - Black']")).click();
	//add to cart
WebElement el=driver.findElement(By.xpath("//*[@id='pdp-add-to-cart-button']/div/button]"));
WebDriverWait wait=new WebDriverWait(driver,10);
wait.until(ExpectedConditions.elementToBeClickable(el));
el.click();


driver.findElement(By.xpath("//a[@class='No, thanks. Go to cart ']")).click();
				
//open the order basket
driver.findElement(By.xpath("//a[@title='Cart']")).click();
		
		
		
	

}}
//search for a keyword -done

// select a product that is available online

//add the product to the cart

// open the order basket

// choose to continue the checkout as a not-logged in user

// specify the user address info

// specify the payment type

// specify invalid payment info

// submit the order*/ 