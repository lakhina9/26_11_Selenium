import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class AutomationPractice {

public static void main(String[] args) throws InterruptedException {
WebDriver driver;

//System.setProperty("WebDriver.chrome.driver", "C:\\Selenium_Class\\chromedriver_win32\\chromedriver.exe");
		//driver=new ChromeDriver();
System.setProperty("webdriver.gecko.driver", "C:\\Selenium_Class\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		
driver=new FirefoxDriver();
driver.navigate().to("http:\\automationpractice.com\\index.php");

//SignIN
driver.findElement(By.xpath("//*[@class='login']")).click();

/*WebElement ca=driver.findElement(By.xpath("//h3[contains(text(),'Create an account')]"));
if(ca.isDisplayed()){
	System.out.println("Elment got displayed");
	
}*/
//emailAddforNewregisterion
driver.findElement(By.id("email_create")).sendKeys("test86@gmail.com");
//clickSumbittocreateNewAccount
driver.findElement(By.id("SubmitCreate")).click();
                             
//selectMRS
Thread.sleep(30000);
//driver.findElement(By.xpath("//*[@id='account-creation_form']/div[1]/div[1]/div[2]/label]")).click();
//label:your personal information

/*WebElement et=driver.findElement(By.xpath("//*[contains(text(),'Your personal information')]"));
if(et.isDisplayed())
	System.out.println("Element found displayed");
	else
	
	System.out.println("Element not found");	 */

driver.findElement(By.xpath("//*[@id='id_gender2']")).click();

	//fist name for Unregistered user
driver.findElement(By.id("customer_firstname")).sendKeys("Shilpa");
driver.findElement(By.id("customer_lastname")).sendKeys("Pandey");
driver.findElement(By.id("passwd")).sendKeys("password");

//days dropdown printing all the elemnets
/*Select select=new Select(driver.findElement(By.id("days")));
List<WebElement>days=select.getOptions();
for(WebElement alltheDays:days){
	System.out.println(alltheDays.getAttribute("value"));
}*/

driver.findElement(By.xpath("//select[@id='days']/option[6]")).click();	
driver.findElement(By.xpath("//select[@id='months']/option[3]")).click();
driver.findElement(By.xpath("//select[@id='years']/option[3]")).click();

//Your Address Part

driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("shilpa");
driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("pandey");
driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("whistling plam");
driver.findElement(By.xpath("//*[@id='city']")).sendKeys("Pune");
//choose country
driver.findElement(By.xpath("//select[@id='id_state']/option[39]")).click();
driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("65678");
//Mobile

driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("8989887654");
driver.findElement(By.xpath("//input[@id='alias']")).clear();
driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("Mumbai");

//Submit
driver.findElement(By.id("submitAccount")).click();



}}