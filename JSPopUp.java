package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Assignment 129: Handle javascript popup of growtechminds application and get the title of the page");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("file:///D:/learningHTML1.html");
		//driver.manage().window().maximize();
		driver.get("https://grotechminds.com/javascript-popup/");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		/*driver.manage().window().maximize();
		//if u don't handle js popup and direct perform actionthen it will throw UnhandledAlertException .
		
		Thread.sleep(2000);
		WebElement first=driver.findElement(By.id("1"));
		first.sendKeys("Smita");
*/
	}

}
