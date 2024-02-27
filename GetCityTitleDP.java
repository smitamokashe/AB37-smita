package dataproviderpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GetCityTitleDP {

	@Test(dataProvider = "searchCities")

	public void searchCity(String city) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		WebElement cityname = driver.findElement(By.name("q"));
		cityname.sendKeys(city);
		cityname.sendKeys(Keys.ENTER);

		System.out.println(driver.getTitle());
		driver.quit();
	}

	@DataProvider(name = "searchCities")
	public Object[][] cityMethod() {
		Object d1[][] = new Object[][] { { "Pune" }, { "Mumbai" }, { "Hyderabad" }, { "Chennai" }, { "Banglore" } };
		return d1;
	}
}
