package testNG01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f1() {
	  System.out.println("method f1 is running");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Beforemethod is running");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("Aftermethod is running");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Beforeclass is running");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Afterclass is running");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Beforetest is running");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Aftertest is running");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Beforesuite is running");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Aftersuite is running");
  }
  @BeforeGroups
  public void beforeGroups() {
	  System.out.println();  
  }
  @AfterGroups
  public void afterGroups() {
	  System.out.println();
  }
}
