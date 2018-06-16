import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HalfEbayLinksGet {

	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://Selenium_Class//geckodriver-v0.18.0-win32//geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

           driver.get("http://half.ebay.com/");
           
         List<WebElement> list=driver.findElements(By.tagName("a"));
        
         System.out.println(list.size());
         for(WebElement elemnets:list)
        System.out.println(elemnets.getText());
        	 
         
	} 

}
