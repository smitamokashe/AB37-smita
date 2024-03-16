package seleniumTC.pkg;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC1SucessfulNewRegister {

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
				"https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=13035989443330183612&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062041&hvtargid=kwd-10573980&hydadcr=14453_2316415");
		driver.manage().window().maximize();// maximizing the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement signin_btn = driver.findElement(By.linkText("Start here."));
		signin_btn.click();

		WebElement fname_tf = driver.findElement(By.xpath("//input[@name='customerName']"));
		fname_tf.sendKeys(fname);

		WebElement mobNum_tf = driver.findElement(By.xpath("//input[@name='email']"));
		mobNum_tf.sendKeys(mobNum);

		WebElement psw_tf = driver.findElement(By.xpath("//input[@name='password']"));
		psw_tf.sendKeys(psw);

		WebElement continue_btn1 = driver.findElement(By.id("continue"));
		continue_btn1.click();

	}

}