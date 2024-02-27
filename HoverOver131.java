package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver131 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Assignment 131:  Launch Flipkart hover over fashion and click on men's T-shirt");

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement fashiondriver=	driver.findElement(By.xpath("(//span[.='Fashion'])[1]"));
		
		Thread.sleep(3000);
		Actions a1=new Actions(driver);
		a1.moveToElement(fashiondriver).perform();
		
		WebElement shirt=driver.findElement(By.linkText("Men's T-Shirts"));
		shirt.click();
	}

}
