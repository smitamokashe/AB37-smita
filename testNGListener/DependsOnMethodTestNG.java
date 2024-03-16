package testNGListener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodTestNG {
	@Test
	public void login() {
		Assert.assertTrue(false);
		
	}
	
	@Test(dependsOnMethods = "login")
	public void logout() {
		
	}

}
