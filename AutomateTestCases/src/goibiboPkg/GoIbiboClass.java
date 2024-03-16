package goibiboPkg;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoIbiboClass {
	
	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		
		//login frame
		WebElement First_frame = driver.findElement(By.name("destination_publishing_iframe_ibibo_0_name"));
		
		//close loginpop up
		WebElement closeBtn = driver.findElement(By.xpath("//span[@class='logSprite icClose']"));
		closeBtn.click();
		
		//close QR popup
		WebElement QRcloseBtn = driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 ewETUe']"));
		QRcloseBtn.click();
	
		//source
		WebElement from=driver.findElement(By.xpath("(//p[.='Enter city or airport'])[1]"));
		from.click();
		WebElement from1=driver.findElement(By.xpath("//input[@type='text']"));
		from1.sendKeys("blr");

		WebElement source=driver.findElement(By.xpath("(//div[@class='sc-12foipm-45 gfqMUQ'])[1]"));
		source.click();
		
		//destination
		WebElement to1=driver.findElement(By.xpath("//input[@type='text']"));
		to1.sendKeys("maa");
		
		WebElement dest=driver.findElement(By.xpath("(//div[@class='sc-12foipm-45 gfqMUQ'])[1]"));
		dest.click();
		
		//date selection
		WebElement journeyDate=driver.findElement(By.xpath("(//p[@class='fsw__date'])[11]"));
		journeyDate.click();
		
		//date submit
		WebElement DtSubmit=driver.findElement(By.xpath("//span[@class='fswTrvl__done']"));
		DtSubmit.click();
		
		//select adult count
		WebElement adult=driver.findElement(By.xpath("(//span[@class='sc-12foipm-64 dGRyPm'])[2]"));
		adult.click();
		
		//select premium class
		WebElement premiumClass =driver.findElement(By.xpath("(//li[@class='sc-12foipm-59 jfdntO'])[1]"));
		premiumClass.click();
		
		//submit details adult,class
		WebElement doneDetails =driver.findElement(By.xpath("//a[@class='sc-12foipm-77 jYnAuG']"));
		doneDetails.click();
		
		//select radio button
		WebElement radioBtn =driver.findElement(By.xpath("//span[.='armed forces']"));
		radioBtn.click();
		
		//search flight
		WebElement searchFlight =driver.findElement(By.xpath("//span[.='SEARCH FLIGHTS']"));
		searchFlight.click();	
	}
}