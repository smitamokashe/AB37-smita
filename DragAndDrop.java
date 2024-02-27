package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Assignment133: Launch growtechminds drag and drop page,do drag a image and drop it in target place,do the reverse of it.");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		
		WebElement drag=driver.findElement(By.id("drag7"));
		
		WebElement drop=driver.findElement(By.id("div2"));
		
		Actions a1=new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();
		
		Thread.sleep(2000);
		
		//revert
		WebElement drag1=driver.findElement(By.id("drag7"));
		
		WebElement drop1=driver.findElement(By.xpath("(//div[@id='div1'])[7]"));
		
		Actions a2=new Actions(driver);
		a2.dragAndDrop(drag1, drop1).perform();
		
	}

}
