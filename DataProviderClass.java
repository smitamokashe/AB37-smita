package dataproviderpkg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {

	/*@Test(dataProvider="data1")
	public void method1_for_addition(int number) 
	{
		System.out.println(number+100);
	}
	
	@DataProvider(name="data1")
	public Object[][] method1()
	{
		return new Object[][] {{100},{200},{300},{400},{500}};	
	}
*/	
	
	@Test(dataProvider="data2")
	public void method1_for_strings(String emailid) 
	{
		System.out.println(emailid.concat(" is email id"));
	}
	@DataProvider(name="data2")
	public Object[][] method2()
	{
		return new Object[][] {{"ram@gmail.com"},{"sita@gmail.com"},{"laxman@gmail.com"},{"shiva@gmail.com"},{"amol@gmail.com"}};
		
	}

}