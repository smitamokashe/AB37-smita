package InhritPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestCase5 extends LaunchQuit {
	
	@Test
	public void login_DrodownBookSearch_Logout() throws InterruptedException
	{
		WebElement dd=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(dd);
		s1.selectByVisibleText("Books");
		
		Thread.sleep(2000);
		WebElement element= driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("software");
		element.sendKeys(Keys.ENTER);
		
	}
}
