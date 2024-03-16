package assertionPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertClass {
	@Test
	public void testcase1() {

		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("India");
		element.sendKeys(Keys.ENTER);// ->infinite time
		
		//Assert.assertEquals(driver.getTitle(), "India - Google Search");
		
		//Assert.assertEquals(driver.getTitle(), "India - Google Search",  "Sorry actual behavior is not same as Expected behavior");
		
		// driver.quit();
		
			//Assert.assertEquals(Search.isDisplayed(), false);
			//Assert.assertEquals(Search.isDisplayed(), false, "Sorry! Element not Found.");
			//	Assert.assertTrue(Search.isDisplayed()==false);
			//	Assert.assertTrue(Search.isDisplayed()==false, "Sorry the given component was not found");
				
			//	Assert.assertFalse(false);
			// Assert.assertFalse(false, "Sorry ");
	}
}