package testNGAnnotations;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

class AnnotationTestNG {
	
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
	@AfterMethod
	public void am() {
		System.out.println("After method");
	}
	
	@AfterClass
	public void ac() {
		System.out.println("After class");
	}
	
	@AfterTest
	public void testcase2() {
		System.out.println("After Testcase2");
	}
	
	@AfterSuite
	public void as() {
		System.out.println("After suite");
	}
}