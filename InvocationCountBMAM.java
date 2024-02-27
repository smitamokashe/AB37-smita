package testNGAssignment;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountBMAM {
	@Test(invocationCount = 11)
	public void testCase1() {
		System.out.println("Test case 1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("Test case 2");
	}
	
	@Test
	public void testCase3() {
		System.out.println("Test case 3");
	}
	
	@Test
	public void testCase4() {
		System.out.println("Test case 4");
	}
	
	@BeforeMethod
	public void bm() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void am() {
		System.out.println("After Method");
	}
}
