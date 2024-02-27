package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledComponent {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Assignment 125: Perform any action on the disabled component and find out which exception we are getting");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///D:/learningHTML1.html");
		
		driver.switchTo().alert().accept();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement lname=driver.findElement(By.xpath("//input[@name='lname']"));
		lname.sendKeys("smita");
		
		//ElementNotInteractableEception
	}

}
