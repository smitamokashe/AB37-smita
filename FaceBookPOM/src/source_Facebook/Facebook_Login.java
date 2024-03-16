package source_Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_Login {
	//Step 1:
	WebDriver driver;
	@FindBy(xpath="//input[@name='email']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='pass']")
	WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	WebElement login_button;
	
	//step2
	
	public void userNameMethod() {
		username.sendKeys("apatil814@gmail.com");
	}
	
	public void passwordMethod() {
		password.sendKeys("Anvi@123");
	}
	
	public void WrongpasswordMethod() {
		password.sendKeys("Anvi@1234");
	}
	
	public void submitMethod() {
		login_button.click();
	}
	
	//step 3:
	
	  public Facebook_Login(WebDriver driver) 
	  {
		  PageFactory.initElements(driver, this);
	  }
	 
}