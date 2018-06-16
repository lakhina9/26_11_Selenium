import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LinksOnPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;

System.setProperty("webdriver.gecko.driver", "C:\\Selenium_Class\\geckodriver-v0.18.0-win32\\geckodriver.exe");
driver=new FirefoxDriver();
driver.get("https://www.ebay.in/");

driver.findElement(By.id("gh-ac")).sendKeys("Apple Watches");
driver.findElement(By.id("gh-btn")).click();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//get all the products--

List<WebElement> list= driver.findElements(By.xpath("//*[@id='ListViewInner')/li/h3/a]"));
/*
 Iterator<WebElement> itr= list.iterator();
while(itr.hasNext()){
	System.out.println(itr.next().getText());
}
	*/
	
	}	}


