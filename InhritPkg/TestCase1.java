package InhritPkg;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase1 extends LaunchQuit {

	@Test
	public void login_SearchShoe_Logout()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		WebElement element= driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("shoe");
		element.sendKeys(Keys.ENTER);
	}
}