package testNGAnnotations;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBMTestAM {
	
	
	@Test
	public void testCase1() {
		System.out.println("Testcase 1");
	}
	
	@BeforeMethod
	
	//2 test
	//2 bm
	//2 am
	public void bm() {
		System.out.println("Before Method");
	}

	@Test
	public void testCase2() {
		System.out.println("Testcase 2");
	}
	
	@AfterMethod
	public void am() {
		System.out.println("After method");
	}
}
