package selenium.program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElment121 {

	public static void main(String[] args) {
		System.out.println("Assignment 120 124 133: Launch GrowTechminds registration form,locate every element except Dropdowns and Upload file button and perform action on each element using WebElement");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration");
		driver.manage().window().maximize();
		
		WebElement firstName = driver.findElement(By.id("fname"));
		firstName.sendKeys("smita");
		
		WebElement lastName = driver.findElement(By.id("lname"));
		lastName.sendKeys("Patil");
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='Username']"));
		userName.sendKeys("spatil");
		
	   	WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("spatil");
		
		WebElement dropdown=driver.findElement(By.xpath("(//select[@id='Skills'])[1]"));
		Select s1=new Select(dropdown);
		s1.selectByVisibleText("Technical Skills");
		
		List<WebElement> op=s1.getOptions();
		for(int i=0;i<op.size();i++) {
			String options=op.get(i).getText();
			System.out.println(options);
		}
		
		WebElement dropdown2=driver.findElement(By.xpath("//select[@class='Country ss']"));
		Select s2=new Select(dropdown2);
		s2.selectByValue("Bangladesh");
		
		List<WebElement> op1=s2.getOptions();
		for(int i=0;i<op1.size();i++) {
			String options1=op1.get(i).getText();
			System.out.println(options1);
		}
		
		WebElement dropdown3=driver.findElement(By.xpath("(//select[@id='technicalskills'])[1]"));
		Select s3=new Select(dropdown3);
		s3.selectByIndex(2);
		
		List<WebElement> op2=s3.getOptions();
		for(int i=0;i<op2.size();i++) {
			String options2=op2.get(i).getText();
			System.out.println(options2);
		}
		
		WebElement submit=driver.findElement(By.xpath("//div/input[@value='Submit']"));
		submit.click();
	
	
	}

}
