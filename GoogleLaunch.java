package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLaunch {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement googleSearch_tf=driver.findElement(By.name("q"));
		googleSearch_tf.sendKeys("India");
		googleSearch_tf.sendKeys(Keys.ENTER);
	}

}
