package InhritPkg;

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
	
	@BeforeMethod
	@Parameters("browser")
	public void launch(String nameOfBrowser) {
		if(nameOfBrowser.equals("chrome")) {
			driver =new ChromeDriver();
		}
		
		if(nameOfBrowser.equals("firefox")) {
			driver =new FirefoxDriver();
		}
		
		if(nameOfBrowser.equals("edge")) {
			driver =new EdgeDriver();
		}
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}
	@AfterMethod
	public void quit() {
		driver.close();
	}
}
