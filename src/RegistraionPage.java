import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RegistraionPage {
	
	public static void main(String[] args){
		
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","C:\\Selenium_Class\\chromedriver.exe");
	driver=new ChromeDriver();
	
	//signIn
	
	driver.navigate().to("http:\\automationpractice.com\\index.php");

	driver.findElement(By.xpath("//*[@class='login']")).click();
	//email
	
	driver.findElement(By.name("email_create")).sendKeys("Hello@gmail.com");
	driver.findElement(By.id("SubmitCreate")).click();
	
	
	}

}
