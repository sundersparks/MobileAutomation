package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters1 {
	//Define the Parameter variable and value in the testng.xml file  - SAMPLE .xml FILE
/*===============================================================================
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <parameter name="uid" value="uid1"></parameter>
  <parameter name="pwd" value="pwd1"></parameter>
  	<test name="Test">
  		<classes>
			<class name="testng.Parameters1.">
				<methods>
                    <include name="login" />
        		</methods>
  			</class>
  		</classes>
  	</test> <!-- Test -->
</suite> <!-- Suite -->
=================================================================================*/
	//Test Consume the test data from the testng.xml using the @Parameters Annotation 
  @Test
  @Parameters({"uid", "pwd"})
  public void login(String uid, String pwd) {	  
	  System.out.printf("This is User Id : " + uid + "\n");
	  System.out.printf("This is password : " + pwd+ "\n");
 }
}
