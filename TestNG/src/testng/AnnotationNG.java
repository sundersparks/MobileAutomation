package testng;

//Hierarchy of TestNG Annotation -> SUITE -> TEST -> CLASS -> METHOD -> TEST
//@BeforeMethod & @AfterMethod is executed Before and After Every Method 

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationNG {
  @Test
  public void f() {
 System.out.println("Inside @Test Annotation");
   }
  
  @Test
  public void f1() {
 System.out.println("Inside @Test F1 Annotation");
  }
  
//@BeforeMethod & @AfterMethod is executed Before and After Every Method  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Inside @beforeMethod Annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Inside @afterMethod Annotation");
  }
  
//@BeforeClass & @AfterClass is executed Before and After Class
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Inside @beforeClass Annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Inside @afterClass Annotation");
  }
//@BeforeTest & @AfterTest is executed Before the 1st Test & After the last Test
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Inside @BeforeTest Annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Inside @AfterTest Annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Inside @BeforeSuite Annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Inside @AfterSuite Annotation");
  }

}
