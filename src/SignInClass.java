import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SignInClass {

	public static void main(String[] args){
		
		
System.setProperty("webdriver.gecko.driver", "C://Selenium_Class//geckodriver-v0.18.0-win32//geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("http://automationpractice.com/index.php?");
//All the elemnet to take for Sign In Page
//SignIn
driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();

//emailAddforNewregisterion
//driver.findElement(By.id("email_create")).sendKeys("test83@gmail.com");
//clickSumbittocreateNewAccount
//driver.findElement(By.id("SubmitCreate")).click();
                             

//email details for  to all ready registrer

driver.findElement(By.id("email")).sendKeys("test83@gmail.com");
driver.findElement(By.id("passwd")).sendKeys("password");
driver.findElement(By.id("SubmitLogin")).click();
		


	}

}
