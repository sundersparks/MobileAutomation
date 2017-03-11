package practice;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviders {	
	
// Create a method which provides an Array of object 
	@DataProvider
	public static Object[][] usercredentials() { 
		return new Object[][] {
			{"UID1", "PWD1"},
			{"UID2", "PWD2"},
		};
		
		}
	
//Create a test which consumes the Data provided by an object Array 
@Test(dataProvider = "usercredentials")
public void LoginTest(String Userid, String Password) { 
	  System.out.println("This update for git");
	  System.out.printf("This is User Id : " + Userid + "\n");
	  System.out.printf("This is password : " + Password+ "\n");
	  System.out.println("This update for git");
}
}
