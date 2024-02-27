package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.xpath("//input[@id='Resume']"));
		e1.sendKeys("C:\\Users\\anjal\\Desktop\\18. Software Test Life Cycle (STLC).pdf");
		
		Thread.sleep(1000);
		WebElement e2=driver.findElement(By.xpath("(//input[@value='Submit'])[2]"));
		e2.click();

	}

}
