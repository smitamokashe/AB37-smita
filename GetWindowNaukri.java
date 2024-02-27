package selenium.program;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetWindowNaukri {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		
		WebElement google_link=driver.findElement(By.xpath("//span[.='Google']"));
		google_link.click();
		String parentId = driver.getWindowHandle();
		Set<String> parentchildid= driver.getWindowHandles();
		System.out.println(parentId);
		System.out.println(parentchildid);
		
		Thread.sleep(2000);
		//driver.close();
		 Iterator <String> pcid =parentchildid.iterator();
		 String parentid1=pcid.next();		//parent id
		 String childid1=pcid.next();		//1st child id
		
		 System.out.println(parentid1);
		 System.out.println(childid1);
		 
		 driver.switchTo().window(childid1);
		 Thread.sleep(3000);
		// driver.close();
		 
		WebElement email=driver.findElement(By.id("identifierId"));
		email.sendKeys("s@mail.com");
	}

}
