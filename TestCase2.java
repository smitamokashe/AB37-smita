package InhritPkg;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase2 extends LaunchQuit{

	@Test
	public void login_SearchPen_Open_Logout()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		WebElement element= driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("pen");
		element.sendKeys(Keys.ENTER);
		
		WebElement Openpen=driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
		Openpen.click();
}

}