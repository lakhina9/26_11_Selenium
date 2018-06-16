import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
System.setProperty("webdriver.gecko.driver", "C://Selenium_Class//geckodriver-v0.18.0-win32//geckodriver.exe");
driver=new FirefoxDriver(); 
driver.get("https://www.freecrm.com/");

driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

driver.findElement(By.name("username")).sendKeys("lakhina");
driver.findElement(By.name("password")).sendKeys("lakhina");
driver.findElement(By.xpath("//*[@value='Login']")).click();

Thread.sleep(2000);

driver.switchTo().frame("mainpanel");
//check for numbers of link available  where tagName is a
List<WebElement> list=driver.findElements(By.tagName("a"));
//take all the images 
list.add(driver.findElement(By.tagName("img")));

System.out.println("Size of total links presnt on the Page-->" +list.size());

//itrate over the linkedlist where property href and url does not starts with javascipt

List<WebElement> activeList= new ArrayList<WebElement>();

for(int i=0;i<list.size();i++){
	
	if(list.get(i).getAttribute("href")!=null && !(list.get(i).getAttribute("href").contains("javascript"))){
		activeList.add(list.get(i));		
	
	}
}
System.out.println("Size of actice links and images---->" +activeList.size());
for(int i=0;i<activeList.size();i++){
	System.out.println(activeList.get(i).getAttribute("href"));
	
}

for(int i=0;i<activeList.size();i++){
	
	HttpURLConnection connection= (HttpURLConnection) new URL(activeList.get(i).getAttribute("href")).openConnection();
	connection.connect();
	String resp=connection.getResponseMessage();
	System.out.println(activeList.get(i).getAttribute("href")+ "------------>" +resp);
	
}
		

	}

}
