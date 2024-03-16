package seleniumTC.pkg;

/* 4.Checck if a user can sucessfully edit their profile information*/
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

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

public class TC4EditProfileInfo {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();

		FileInputStream f1 = new FileInputStream(
				"D:\\Smita_MKT_Programs\\AutomateTestCases\\ExcelSheet1\\amazonLogin.xlsx");// location of
																							// excelsheet-format>>FileInputStream
																							// refVar= new
																							// FileInputStream("location
																							// of the excelsheet")

		Workbook wb = WorkbookFactory.create(f1);// open the excelsheet

		String fname = wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();

		String mobNum = NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(1).getNumericCellValue());

		String psw = wb.getSheet("login").getRow(1).getCell(2).getStringCellValue();

		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D150668181581%26hvpone%3D%26hvptwo%3D%26hvadid%3D678802104140%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D8366720646713754005%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062044%26hvtargid%3Dkwd-10544572015%26hydadcr%3D5621_2412643&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.manage().window().maximize();// maximizing the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().refresh();
		driver.findElement(By.id("ap_email")).sendKeys(mobNum);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys(psw);// 1.find element 2.locate 3.perform
																// action-send text
		driver.findElement(By.id("signInSubmit")).click();

		// Hover over
		WebElement acc_sign_in = driver.findElement(By.id("nav-link-accountList"));
		Actions a1 = new Actions(driver);// actions actions
		a1.moveToElement(acc_sign_in).perform();// hover over the required element
		
		//click
		acc_sign_in.click();
		
		//click on the login and security
		WebElement loginSec_btn = driver.findElement(By.xpath("(//span[@class='a-color-secondary'])[2]"));
		loginSec_btn.click();
		
		//click on the login and security
		WebElement edit_btn = driver.findElement(By.xpath("(//span[@id='NAME_BUTTON'])"));
		edit_btn.click();
		
		
		//appending random value to the cust_tf
		//double pi = Math.PI;
		//System.out.println("Area of the circle = " + area);

	
			double r = Math.random();
			int randomNo =(int) ( r*1000);
			System.out.println("randomNo = " + randomNo);
		
		
		//customer name deatisl edit
		WebElement cust_tf = driver.findElement(By.id("ap_customer_name"));
		cust_tf.clear();
		cust_tf.sendKeys("Anvi"+randomNo);
		
		
		WebElement savecust_btn = driver.findElement(By.id("cnep_1C_submit_button"));
		savecust_btn.click();
	}

}