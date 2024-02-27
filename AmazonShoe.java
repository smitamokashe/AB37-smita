package selenium.program;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonShoe {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement shoes=driver.findElement(By.id("twotabsearchtextbox"));
		shoes.sendKeys("shoe");
		shoes.sendKeys(Keys.ENTER);
		
		WebElement selectShoe=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[30]"));
		selectShoe.click();
		
		String parentId = driver.getWindowHandle();
		Set<String> parentchildid= driver.getWindowHandles();
		
		Thread.sleep(2000);
		 Iterator <String> pcid =parentchildid.iterator();
		 String parentid1=pcid.next();		//parent id
		 String childid1=pcid.next();		//1st child id
		
		 driver.switchTo().window(childid1);
		 Thread.sleep(3000);
		 
		 WebElement addToCart=driver.findElement(By.id("add-to-cart-button"));
		 addToCart.click();		 
	}

}
