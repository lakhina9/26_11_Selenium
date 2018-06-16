package TestNGClasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class OrderOfExecution {
  @Test
  public void f() {
	  System.out.println("Fist test");
  }
  
  @BeforeMethod
  public void beforeMethod() {
  System.out.println("Oopen the Browser");

  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("close the browser");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after Test");
  }

  @BeforeSuite
  public void beforeSuite() {
  
  System.out.println("Before Suit");
  }

  @AfterSuite
  public void afterSuite() {
  System.out.println("Aftre Suit");
  }

}
