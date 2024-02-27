package testNGAssignment;

import org.testng.annotations.Test;

public class InvocationCountPara {

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
}
