package screenshotpkg;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrrenShotClass {

	@Test
	public void screen() throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		TakesScreenshot tss= driver;
		File source =tss.getScreenshotAs(OutputType.FILE);
		File destination=new File("D:\\Smita_MKT_Programs\\TestNGProject\\ScreenShotFolder\\smita.png");
		//object class .getclass
		//for multiple screenshots
		//File destination=new File("D:\\Smita_MKT_Programs\\TestNGProject\\ScreenShotFolder\\smita "+Math.random()+".png");
		//FileHandler.copy(source,destination);
		FileUtils.copyFile(source,destination);	
	}
}
