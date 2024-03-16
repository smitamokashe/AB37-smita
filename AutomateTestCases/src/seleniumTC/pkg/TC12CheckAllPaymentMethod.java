
/* 12.Check if user is able to select each payment menthod*/
/* 13.Check if user is able to apply for coupon code while ordering the product*/
/* 14.Go to order page and click on your last ordered product and give 5 start ratings*/
/* 15.Reach till cart page without login in amazon application*/

package seleniumTC.pkg;

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

public class TC12CheckAllPaymentMethod {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream f1 = new FileInputStream(
				"D:\\Smita_MKT_Programs\\AutomateTestCases\\ExcelSheet1\\amazonLogin.xlsx");// location of
																							// excelsheet-format>>FileInputStream
		EdgeDriver driver = new EdgeDriver(); // refVar= new

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		Workbook wb = WorkbookFactory.create(f1);// open the excelsheet

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

		// applying filters

		List<WebElement> results = driver
				.findElements(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])"));
		Thread.sleep(2000);
		int count = results.size();
		System.out.println(count);
		results.get(count - 4).click();

//		results.get(count_am_sug - 20).click();
		Set<String> pen_shoe = driver.getWindowHandles();

		Iterator<String> pcId = pen_shoe.iterator();

		String parendId = pcId.next();// parent id from parentandchild
		String childId = pcId.next();// 1st childid

		driver.switchTo().window(childId);// moved the control to child window
		Thread.sleep(3000);

		WebElement addToCart_btn = driver.findElement(By.id("add-to-cart-button"));
		Thread.sleep(2000);
		addToCart_btn.click();
		Thread.sleep(1000);

		WebElement proced_btn = driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
		Thread.sleep(2000);
		proced_btn.click();
		Thread.sleep(1000);

		WebElement useThisAdd_btn = driver.findElement(By.xpath("//span[@id='shipToThisAddressButton']"));
		Thread.sleep(2000);
		useThisAdd_btn.click();
		Thread.sleep(1000);

		WebElement credDebit_Rbtn = driver.findElement(By.xpath("//input[@value='SelectableAddCreditCard']"));
		Thread.sleep(2000);
		credDebit_Rbtn.click();
		Thread.sleep(1000);

		WebElement netBank_Rbtn = driver.findElement(By.xpath(
				"//input[@value='instrumentId=amzn1.pm.poa.YW16bjEucG9hOmFtem4xLnBvYS5wb2RhLlVuaWZpZWRQYXltZW50c0ludGVyZmFjZTox.QTJLVjJGVFhIRVVaU1o&isExpired=false&paymentMethod=UnifiedPaymentsInterface&tfxEligible=false']"));
		Thread.sleep(2000);
		netBank_Rbtn.click();
		Thread.sleep(1000);

		WebElement upi_Rbtn = driver.findElement(By.xpath(
				"//input[@value='instrumentId=amzn1.pm.poa.YW16bjEucG9hOmFtem4xLnBvYS5wb2RhLlVuaWZpZWRQYXltZW50c0ludGVyZmFjZTox.QTJLVjJGVFhIRVVaU1o&isExpired=false&paymentMethod=UnifiedPaymentsInterface&tfxEligible=false']"));
		Thread.sleep(2000);
		upi_Rbtn.click();
		Thread.sleep(1000);

		WebElement emi_Rbtn = driver.findElement(
				By.xpath("//input[@value='instrumentId=EMI&isExpired=false&paymentMethod=CC&tfxEligible=false']"));
		Thread.sleep(2000);
		emi_Rbtn.click();
		Thread.sleep(1000);

		WebElement Cod_Rbtn = driver.findElement(By.xpath(
				"//input[@value='instrumentId=0h_PE_CUS_18b1c868-2e63-40e2-8b24-414fe05d88c8%2FCash&isExpired=false&paymentMethod=COD&tfxEligible=false']"));
		Thread.sleep(2000);
		Cod_Rbtn.click();
		Thread.sleep(1000);
		boolean fname_tf_isTrue = Cod_Rbtn.isEnabled();
		if (fname_tf_isTrue == true) {
			Cod_Rbtn.click();
		} else {
			System.out.println("Do nothing");
		}

		// *[@class='*']

		 driver.quit();
	}

}