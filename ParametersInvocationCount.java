package pareametersPKG;

import org.testng.annotations.Test;

public class ParametersInvocationCount {

	@Test(invocationCount =11)
	public void testcase1() {
		System.out.println("Invocation count parameter");
	}
	
	@Test
	public void testcase2() {
		System.out.println("Invocation count parameter");
	}
	
	@Test
	public void testcase3() {
		System.out.println("Invocation count parameter");
	}
	@Test
	public void testcase4() {
		System.out.println("Invocation count parameter");
	}
}
