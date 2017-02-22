package practice;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataproviderwithExcel {	

	// Read the Excel by calling ExcelUtils class and Return the Test Object array 
	@DataProvider
	public static Object[][] usercredentials() throws Exception {
		Object[][] Testobjectarry = ExcelUtils.getTableArray("C:\\CMS\\Automation\\TestData.xlsx", "Sheet1");
		return (Testobjectarry);
		}
	
	
//Consume test data from the ArrayObject from @DataProvider  
@Test(dataProvider = "usercredentials")
public void usercredentials(String Userid, String Password) { 
	  System.out.printf("This is User Id : " + Userid + "\n");
	  System.out.printf("This is password : " + Password+ "\n");
	
}
}