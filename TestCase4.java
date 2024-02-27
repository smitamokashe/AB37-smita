package InhritPkg;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase4 extends LaunchQuit{

	@Test
	public void login_SearchPenAddToCart_Logout()
	{
		
		WebElement element= driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("pen");
		element.sendKeys(Keys.ENTER);
		
		WebElement Openpen=driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
		Openpen.click();
		Set<String> handle =driver.getWindowHandles();
		Iterator<String> ite =handle.iterator();
		String parent =ite.next();
		String child =ite.next();
		driver.switchTo().window(child);
		//WebElement ele =driver.findElement(By.id("add-to-cart-button"));
		WebElement addToCart= driver.findElement(By.id("add-to-cart-button"));
		addToCart.click();
	}
	
}
