package testNGAssignment;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test(priority = 2)
	public void testCase1() {
		System.out.println("Test case 1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("Test case 2");
	}

}
