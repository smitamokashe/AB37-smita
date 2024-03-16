package test_Facebook;

import org.testng.annotations.Test;

import source_Facebook.Facebook_Login;

public class TestCase1 extends LaunchQuit{

	@Test
	public void login_with_valid_credentials() {
		Facebook_Login fb=new Facebook_Login(driver);
		fb.userNameMethod();
		fb.passwordMethod();
		fb.submitMethod();
		}
}
