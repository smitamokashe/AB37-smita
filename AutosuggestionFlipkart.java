package selenium.program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestionFlipkart {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.name("q"));
		Thread.sleep(1000);
		search.sendKeys("Books");
		
		Thread.sleep(3000);

		List<WebElement> results = driver.findElements(By.xpath("(//div[@class='YGcVZO _2VHNef'])"));
		int countRes = results.size();
		Thread.sleep(3000);
		results.get(countRes - 7).click(); 


	}

}
