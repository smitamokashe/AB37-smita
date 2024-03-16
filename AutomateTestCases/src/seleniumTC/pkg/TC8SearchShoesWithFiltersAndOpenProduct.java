package seleniumTC.pkg;
/* 8.Check if products can be sorted by relevance , price , rating , etc*/

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

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

public class TC8SearchShoesWithFiltersAndOpenProduct {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		FileInputStream f1 = new FileInputStream(
				"D:\\Smita_MKT_Programs\\AutomateTestCases\\ExcelSheet1\\amazonLogin.xlsx");// location of
																							// excelsheet-format>>FileInputStream
		EdgeDriver driver = new EdgeDriver(); // refVar= new
		// FileInputStream("location
		// of the excelsheet")

		Workbook wb = WorkbookFactory.create(f1);// open the excelsheet

//		String fname = wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();

		String mobNum = NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(1).getNumericCellValue());

		String psw = wb.getSheet("login").getRow(1).getCell(2).getStringCellValue();

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
		WebElement search_tf = driver.findElement(By.id("twotabsearchtextbox"));
		search_tf.sendKeys("shoes");

		// click on enter button
		WebElement search_btn = driver
				.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[2]"));
		search_btn.click();

		// Include Out of Stock
		WebElement Incl_Cb = driver.findElement(By.linkText("Include Out of Stock"));
		Incl_Cb.click();

		WebElement getItbytomm_cb = driver.findElement(By.linkText("Get It by Tomorrow"));
		getItbytomm_cb.click();

		WebElement mens_sneaker_cb = driver.findElement(By.linkText("Men's Sneakers"));
		mens_sneaker_cb.click();

		WebElement seeMore_btn = driver.findElement(By.linkText("See more"));
		seeMore_btn.click();

		WebElement shoeBrandsBata_cb = driver.findElement(By.linkText("Bata"));
		shoeBrandsBata_cb.click();

		WebElement seeMore_btn1 = driver.findElement(By.linkText("See more"));
		seeMore_btn1.click();

		WebElement shoeBrandsAdidas_cb = driver.findElement(By.linkText("adidas"));
		shoeBrandsAdidas_cb.click();

		WebElement seeMore_btn2 = driver.findElement(By.linkText("See more"));
		seeMore_btn2.click();

		WebElement shoeBrandsNike_cb = driver.findElement(By.linkText("Nike"));
		shoeBrandsNike_cb.click();

		WebElement priceRange_cb = driver.findElement(By.linkText("₹2,500 - ₹5,000"));
		priceRange_cb.click();

		WebElement size7_btn = driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[40]"));
		size7_btn.click();

		WebElement payOndel_btn = driver.findElement(By.linkText("Eligible for Pay On Delivery"));
		payOndel_btn.click();

		WebElement MensShoes_btn = driver.findElement(By.linkText("Men's Shoes"));
		MensShoes_btn.click();

		WebElement MensShoesf1_btn = driver.findElement(By.linkText("Men's Sports & Outdoor Shoes"));
		MensShoesf1_btn.click();

		WebElement MensShoesf2_btn = driver.findElement(By.linkText("Men's Running Shoes"));
		MensShoesf2_btn.click();

		List<WebElement> results = driver
				.findElements(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])"));
//		Thread.sleep(2000);
		int count = results.size();
		System.out.println(count);
		results.get(count - 3).click();

		// *[@class='*']
		driver.quit();
	}

}