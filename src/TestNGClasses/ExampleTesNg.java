package TestNGClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExampleTesNg {

	
@BeforeMethod
public void enterURL(){
	System.out.println("Before Method");
	
}
	
@Test
  public void f() {
	  System.out.println("test");
	  
  }
@Test
public void f1(){
	System.out.println("test1");
}

@AfterMethod
public void closeURL(){
	System.out.println("After test");
}



}
