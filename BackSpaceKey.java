package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackSpaceKey {

	public static void main(String[] args) {
		System.out.println("Assignment 120: Launch GrowTechminds registration form,for firstname textfield enter name as Manish Kumar Tiwari,remove Tiwari from it using Keys option");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration");
		driver.manage().window().maximize();
		
	/*	driver.findElement(By.id("fname")).sendKeys("Manish Kumar Tiwari");
		driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
		*/
		
		
	}

}