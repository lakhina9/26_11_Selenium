import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Navigation {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "C://Selenium_Class//geckodriver-v0.18.0-win32//geckodriver.exe");
		 driver=new FirefoxDriver();
		 driver.get("https://www.google.com/");
		 driver.navigate().to("https://facebook.com");
		 Thread.sleep(2000);
		 driver.navigate().back();
	}

}
