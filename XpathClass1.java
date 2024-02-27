package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathClass1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration");
		driver.manage().window().maximize();
		WebElement firstName=driver.findElement(By.xpath("//input[@id='fname']"));
		boolean check_first_name = firstName.isDisplayed();
		
		if(check_first_name==true) {
			firstName.sendKeys("Anvi Patil");
		}
		else {
			System.out.println("No display");
		}

	}

}
