package testNGAssignment;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BSASBMBCACTest {

	@BeforeSuite
	public void bs() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void as() {
		System.out.println("After Suite");
	}
	
	@BeforeMethod
	public void bm() {
		System.out.println("Before Method");
	}
	
	@BeforeClass
	public void bc() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void ac() {
		System.out.println("After Class");
	}
	@Test
	public void testCase() {
		System.out.println("Test case");
	}
}
