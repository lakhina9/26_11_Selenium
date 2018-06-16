import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AltersPopUPs {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.gecko.driver", "C://Selenium_Class//geckodriver-v0.18.0-win32//geckodriver.exe");
driver=new FirefoxDriver(); 

driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

driver.findElement(By.xpath("//input[@value='Go']")).click();

Alert alert=driver.switchTo().alert();

String text=alert.getText();
	
System.out.println(text);
//alert.accept();

driver.quit();
	}

}
