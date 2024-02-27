package selenium.program;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonLoginDDT {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1= new FileInputStream("D:\\Smita_MKT_Programs\\Selenium\\ExcelSheet1//smita1.xlsx");
		Workbook wb= WorkbookFactory.create(f1);
		String user=wb.getSheet(null).getRow(1).getCell(0).getStringCellValue();
		String pwd=wb.getSheet(null).getRow(1).getCell(1).getStringCellValue();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.id("nav-link-accountList"));

		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		
		WebElement login=driver.findElement(By.linkText("Sign in"));
		login.click();
		
		driver.findElement(By.id("ap_email")).sendKeys(user);
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys(pwd);
		//driver.findElement(By.id("signInSubmit")).click();

	}

}
