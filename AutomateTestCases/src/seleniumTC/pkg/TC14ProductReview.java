package seleniumTC.pkg;
/* 14.Go to order page and click on your last ordered product and give 5 start ratings*/
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

public class TC14ProductReview {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream f1 = new FileInputStream(
				"D:\\Smita_MKT_Programs\\AutomateTestCases\\ExcelSheet1\\amazonLogin.xlsx");// location of
		// excelsheet-format>>FileInputStream
		EdgeDriver driver = new EdgeDriver(); // refVar= new

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		Workbook wb = WorkbookFactory.create(f1);// open the excelsheet

		String mobNum = NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(0).getNumericCellValue());

		String psw = wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();

		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D150668181581%26hvpone%3D%26hvptwo%3D%26hvadid%3D678802104140%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D8366720646713754005%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062044%26hvtargid%3Dkwd-10544572015%26hydadcr%3D5621_2412643&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.manage().window().maximize();// maximizing the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("ap_email")).sendKeys(mobNum);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys(psw);// 1.find element 2.locate 3.perform
																// action-send text
		driver.findElement(By.id("signInSubmit")).click();

		// Test searching for products using its name like shoe
		WebElement hover_over_btn = driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]"));

		Actions a1 = new Actions(driver);
		a1.moveToElement(hover_over_btn).perform();

		WebElement orders_btn = driver.findElement(By.linkText("Your Orders"));
		orders_btn.click();

		List<WebElement> results = driver.findElements(By.linkText("Write a product review"));

		int count_sug = results.size();

		results.get(count_sug - 3).click();// keep chaining values 1-7

//		WebElement rvw_btn = driver.findElement(By.linkText("Write a product review"));
//		rvw_btn.click();

		WebElement fivestr_btn = driver.findElement(
				By.xpath("(// div[@class='a-section a-spacing-top-micro']//button[@class='ryp__star__button'])[5]"));
		fivestr_btn.click();

		WebElement headlines_btn = driver
				.findElement(By.xpath("// input[@class='a-input-text ryp__review-title__input']"));
		headlines_btn.sendKeys("Good product");

		WebElement review_tf = driver.findElement(By.id("scarface-review-text-card-title"));
		review_tf.sendKeys("Good Product");

		WebElement submit_btn = driver.findElement(By.xpath("// button[@class='a-button-text']"));
		submit_btn.click();

		// *[@class='*']

		// a[@class='a-button-text']
		// button[@class='ryp__media-upload-call-to-action--square']

		// button[@class='a-button-text']
		// a-spacing-top-micro']//button[@class='ryp__star__button']
		Thread.sleep(5000);
		driver.quit();
	}

}
