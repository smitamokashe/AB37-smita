package testNGAssignment;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BMAM2Test {

	@BeforeMethod
	public void bm() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void am() {
		System.out.println("After Method");
	}
	
	@Test
	public void testCase1() {
		System.out.println("Test case 1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("Test case 2");
	}
}
