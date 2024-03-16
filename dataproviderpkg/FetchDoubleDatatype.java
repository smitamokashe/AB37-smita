package dataproviderpkg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FetchDoubleDatatype {

	@Test(dataProvider="doubleData")
	public void method1_for_doubleDT(double d1) 
	{
		System.out.println("Assignment 150: write a testng code to fetch double datatype values from a method using dataprovider annotation");
		System.out.println(d1 +" is of double datatype");
	}
	@DataProvider(name="doubleData")
	public Object[][] method2()
	{
		return new Object[][] {{100.123},{200.456},{300.09}};
		
	}

}
