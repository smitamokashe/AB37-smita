package test_Facebook;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchQuit {
	
	WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	public void preCondition(String name_of_browser) {
		if(name_of_browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		
		if(name_of_browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		
		if(name_of_browser.equals("edge")) {
			driver=new EdgeDriver();
		}
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
		  @AfterMethod public void quitMethod() {
	  System.out.println("Thanks, Test case is done"); 
	  driver.close(); 
	  }
}
