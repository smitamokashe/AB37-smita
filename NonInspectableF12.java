package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NonInspectableF12 {

	public static void main(String[] args) {
		System.out.println("Assignment 130: Launch online sbi link,click on login button, and inspect username,password and captcha");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		WebElement login=driver.findElement(By.xpath("(//a[.='CONTINUE TO LOGIN'])[1]"));
		login.click();
		
		WebElement user=driver.findElement(By.xpath("//input[@id='username']"));
		user.sendKeys("smita");
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("Dummy@123");
		
		WebElement captcha=driver.findElement(By.xpath("//input[@name='loginCaptchaValue']"));
		//captcha.sendKeys(driver.findElement(By.xpath("//img[@id='refreshImgCaptcha']"));
		captcha.sendKeys("SMitA12P");
		
	}

}
