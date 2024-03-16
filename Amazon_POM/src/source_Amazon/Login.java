package source_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	//Step1: Locating each components using @FindBy annotation
	
	@FindBy(id="ap_email")
	WebElement user;
	
	@FindBy(id = "continue")
	WebElement continue_Button;// continueButton

	@FindBy(id = "ap_password")
	WebElement passwords;// password

	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement signIn_Button;// signInButton

	// Step-2:creating separate methods for each components for perfrom acction

		public void un() {
			user.sendKeys("patilanvi711@gmail.com");
		}

		public void continue_method() {
			continue_Button.click();
		}

		public void pwd() {
			passwords.sendKeys("Anvi@711");
		}
		
		public void wrongPwd() {
			passwords.sendKeys("Anvi@7112");
		}

		public void signIn_Button1() {
			signIn_Button.click();
		}

		// Step-3:initializing my components using PageFactory Class under constructor
		 public Login(WebDriver driver) {
			 PageFactory.initElements(driver,this);
		 }
}
