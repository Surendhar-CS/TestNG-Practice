package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XMLParameterisedTests {

	@Parameters({"URL"})
	@Test(enabled = false)
	public void getURL(String URL)
	{
		System.out.println(URL);
	}
	
	
	@Test(dataProvider = "getData")
	public void fetchData(String username,String password)
	{
		System.out.println(username+""+password);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
		
		//first set of data--> valid user,pass
		data[0][0]="validuser";
		data[0][1]="validpass";
		
		//second set of data -->invalid user,invalid pass
		data[1][0]="invaliduser";
		data[1][1]="invalidpass";
		
		//third set of data --> invalid pass
		data[2][0]="validuser";
		data[2][1]="invalidpass";
		
		return data;
	}
	
}
