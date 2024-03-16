package testNGAssignment;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test3BM {
	
	@BeforeMethod
	public void bm() {
		System.out.println("Before Method");
	}
	
	@Test
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

}
