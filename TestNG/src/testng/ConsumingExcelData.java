package testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import testng.ExcelUtilis;

public class ConsumingExcelData {

@Test(dataProvider="Authentication")
public void Registration_data(String sUserName,String sPassword)throws  Exception{
System.out.println("The UID from Excel : " + sUserName);
System.out.println("The PWD from Excel : " + sPassword);
}

@DataProvider
public Object[][] Authentication() throws Exception{
 Object[][] testObjArray = ExcelUtilis.getTableArray("/Users/kayal/Project/TestData/uids.xlsx","Sheet1");
 return (testObjArray);

}
}