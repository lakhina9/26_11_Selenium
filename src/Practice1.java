import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practice1 {

	static WebDriver driver;
	public static void main(String[] args) {

	System.setProperty("WebDriver.chrome.driver", "C:\\Selenium_Class\\chromedriver_win32\\chromedriver.exe");
   driver=new ChromeDriver();
   driver.get("http://automationpractice.com/index.php");
	   
   driver.findElement(By.cssSelector("a[class='login']")).click();
   driver.findElement(By.cssSelector("input#email_create")).sendKeys("lakhina9@gmail.com");
   driver.findElement(By.name("SubmitCreate")).click();
   
   List<WebElement> element=driver.findElements(By.className("radio-inline"));

      for(int i=0;i<element.size();i++){
    	  element.get(i).getAttribute("id").equals("id_gender2");
    	  element.get(i).click();
      }
	
	}

}
