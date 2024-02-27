package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPasteWithKeys {

	public static void main(String[] args) {
		System.out.println("Assignment 122: Launch GrowTechminds registration form,Enter \"Manish Kumar Tiwari\" in the firstname and copy paste in all 4 text fields using keys");
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("fname")).sendKeys("Manish Kumar Tiwari");
		
		driver.findElement(By.id("fname")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.id("fname")).sendKeys(Keys.CONTROL+"c");
		
		driver.findElement(By.id("lname")).sendKeys(Keys.CONTROL+"v");
		
		driver.findElement(By.id("Username")).sendKeys(Keys.CONTROL+"v");
		
		driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"v");
		
		driver.findElement(By.id("Male")).click();
		
		driver.findElement(By.id("w3review")).sendKeys("Pune");
		driver.findElement(By.id("w3review")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.id("w3review")).sendKeys(Keys.CONTROL+"c");
		
		driver.findElement(By.id("Address")).sendKeys(Keys.CONTROL+"v");
		
		driver.findElement(By.id("Pincode")).sendKeys("412105");
		driver.findElement(By.id("Agree")).click();
		
		driver.findElement(By.xpath("//div[@class='f1'][8]")).click();
		
	}

}
