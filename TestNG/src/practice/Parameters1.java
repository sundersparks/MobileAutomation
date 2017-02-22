package practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters1 {
	//Define the Parameter variable and valuye in the testng.xml file 
	//Test Consume the test data from the testng.xml using the @Parameters Annotation 
  @Test
  @Parameters({"uid", "pwd"})
  public void login(String uid, String pwd) {
	  
	  System.out.printf("This is User Id : " + uid + "\n");
	  System.out.printf("This is password : " + pwd+ "\n");
	  
	 	  
  }
}
