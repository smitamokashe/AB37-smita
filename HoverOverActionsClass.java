package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOverActionsClass {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.id("nav-link-accountList"));

		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		
		WebElement login=driver.findElement(By.linkText("Sign in"));
		login.click();
		
		driver.findElement(By.id("ap_email")).sendKeys("");
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys("");
		driver.findElement(By.id("signInSubmit")).click();
		
		
	}

}
