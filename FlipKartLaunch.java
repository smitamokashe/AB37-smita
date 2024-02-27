package selenium.program;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartLaunch {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Assignment 111: Get the title of flipkart.com and save each word in an array");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		char c[]=title.toCharArray();
		
			System.out.print(Arrays.toString(c));
		
	}
}
