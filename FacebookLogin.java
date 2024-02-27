package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		System.out.println("Assignment 112: Login to Facebook using id,name locator");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("smita@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("smita12345");
		driver.findElement(By.name("login")).click();
	}

}
