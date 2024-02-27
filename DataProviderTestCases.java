package dataproviderpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestCases {

	@Test(dataProvider = "testdata")
	public void Login_fb(String un, String pwd) {
		EdgeDriver driver = new EdgeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(un);// using id - username
		driver.findElement(By.id("pass")).sendKeys(pwd);// using id - password

		driver.findElement(By.name("login")).click();// using name - click on the login button
	}

	@DataProvider(name = "testdata")
	public Object[][] dataforlogin() {
		Object d1[][] = new Object[7][2];
		d1[0][0] = "apatil814@gmail.com";
		d1[0][1] = "Anvi@123";// line no 24 and 25 are the data for test case 1
		
		d1[1][0] = "apatil814@gmail.com";
		d1[1][1] = "Anv@123";// line no 24 and 25 are the data for test case 2
		
		d1[2][0] = "patilanvi721@gmail.com";
		d1[2][1] = "Anvi@123";// line no 24 and 25 are the data for test case 3
		
		d1[3][0] = "patilanvi7113@gmail.com";
		d1[3][1] = "Anvi@123";// line no 24 and 25 are the data for test case 4
		
		d1[4][0] = "";
		d1[4][1] = "12345";// line no 24 and 25 are the data for test case 5
		
		d1[5][0] = "apatil814@gmail.com";
		d1[5][1] = ""; // line no 24 and 25 are the data for test case 6
		
		d1[6][0] = "";
		d1[6][1] = ""; // line no 24 and 25 are the data for test case 7

		return d1;

	}
}
