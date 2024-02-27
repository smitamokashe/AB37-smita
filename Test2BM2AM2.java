package testNGAnnotations;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2BM2AM2 {
	
	@Test
	public void testCase1() {
		System.out.println("Testcase 1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("Testcase 2");
	}
	
	@BeforeMethod
	public void bm() {
		System.out.println("Before method 1");
	}
	
	@BeforeMethod
	public void bm2() {
		System.out.println("Before method 2");
	}

	@AfterMethod
	public void am() {
		System.out.println("After method 1");
	}
	
	@AfterMethod
	public void am2() {
		System.out.println("After method 2");
	}
}
