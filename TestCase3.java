package InhritPkg;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase3 extends LaunchQuit{
	
	@Test
	public void login_SearchPenWishlist_Logout()
	{
		
		WebElement element= driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("Shoes");
		element.sendKeys(Keys.ENTER);
		WebElement shoe=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-base a-text-center'])[1]"));
		shoe.click();
		//Thread.sleep(3000);
		Set<String> handle =driver.getWindowHandles();
		Iterator<String> ite =handle.iterator();
		String parent =ite.next();
		String child =ite.next();
		driver.switchTo().window(child);
		//WebElement ele =driver.findElement(By.id("add-to-cart-button"));
		WebElement addToWhislist= driver.findElement(By.xpath("//a[.=' Add to Wish List ']"));
		addToWhislist.click();
	}


}
