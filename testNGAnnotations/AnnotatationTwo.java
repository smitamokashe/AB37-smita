package testNGAnnotations;


import org.testng.annotations.Test;

public class AnnotatationTwo {
	
	//it will take alphabetical order
	//no priority
	@Test
	public void abc() {
		System.out.println("Testcase 1");
	}
	
	@Test
	public void zxy() {
		System.out.println("Testcase 3");
	}
	
	@Test
	public void login() {
		System.out.println("Testcase 2");
	}
	

}
