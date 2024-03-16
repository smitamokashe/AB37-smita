package expliciteWaitPkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PopUpExpliciteWait {

	@Test
	public void Google() {
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.titleIs("Google"));
		//wait.until(ExpectedConditions.titleContains("Goog"));

		WebElement e1=driver.findElement(By.xpath("//button[@class='btnjs']"));
		e1.click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}
}
