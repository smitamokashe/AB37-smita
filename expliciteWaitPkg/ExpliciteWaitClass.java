package expliciteWaitPkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExpliciteWaitClass {

	@Test
	public void Google() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleIs("Google"));
		//wait.until(ExpectedConditions.titleContains("Goog"));
		//wait.until(ExpectedConditions.alertIsPresent());
		
		WebElement search= driver.findElement(By.name("q"));
		search.sendKeys("Pune");
		Reporter.log("Test case successful");
		
	}
}
