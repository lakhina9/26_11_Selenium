import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class HandlingUntrustedWebSite {
	static WebDriver driver;

	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver", "C://Selenium_Class//geckodriver-v0.18.0-win32//geckodriver.exe");
	
	DesiredCapabilities capability = DesiredCapabilities.chrome();
	// To Accept SSL certificate
	capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	System.setProperty("webdriver.chrome.driver", "C://Selenium_Class//chromedriver_win32//chromedriver.exe");
		
	driver = new ChromeDriver(capability);
	driver.manage().window().maximize();
	
	driver.get("https://cacert.org/");
	
	}
	
	
		
	
	}


