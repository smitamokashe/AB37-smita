package seleniumTC.pkg;
 
/* 15.Reach till cart page without login in amazon application*/

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC15CartWithoutLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver(); // refVar= new

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search_tf = driver.findElement(By.id("twotabsearchtextbox"));
		search_tf.sendKeys("shoes");

		// click on enter button
		WebElement search_btn = driver
				.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[2]"));
		search_btn.click();

		// applying filters

		List<WebElement> results = driver
				.findElements(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])"));
		Thread.sleep(2000);
		int count = results.size();
		System.out.println(count);
		results.get(count - 36).click();

//		results.get(count_am_sug - 20).click();
		Set<String> pen_shoe = driver.getWindowHandles();

		Iterator<String> pcId = pen_shoe.iterator();

		String parendId = pcId.next();// parent id from parentandchild
		String childId = pcId.next();// 1st childid

		driver.switchTo().window(childId);// moved the control to child window
		Thread.sleep(3000);

		WebElement wishList_btn = driver.findElement(By.id("add-to-cart-button"));

		wishList_btn.click();

		WebElement gotoCart_btn = driver
				.findElement(By.xpath("//span[@class='a-button a-button-span11 a-button-base a-button-small']"));
		gotoCart_btn.click();

		// *[@class='*']
//		driver.quit();
//		Thread.sleep(5000);
	}

}