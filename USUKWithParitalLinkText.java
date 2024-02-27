package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class USUKWithParitalLinkText {

	public static void main(String[] args) {
		System.out.println("Assignment 116: Launch Amazon.in and Click on 1.UAE 2.UK 3.US,using partial link text.");
		
		String a[] = { "United Arab Emirates", "United Kingdom", "United States" };

		for (int i = 0; i < 3; i++) {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			driver.findElement(By.partialLinkText(a[i])).click();
		}

	}
}
