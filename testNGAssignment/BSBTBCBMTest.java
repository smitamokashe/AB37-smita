package testNGAssignment;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BSBTBCBMTest {
	@BeforeSuite
	public void bs() {
		System.out.println("Before Suite");
	}

	@BeforeTest
	public void bt() {
		System.out.println("Before test");
	}
	
	@BeforeClass
	public void bc() {
		System.out.println("Before class");
	}
	
	@BeforeMethod
	public void bm() {
		
	}
	
	@Test
	public void testCase1() {
		System.out.println("Testcase 1");
	}

}
