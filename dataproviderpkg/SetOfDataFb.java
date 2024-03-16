//Assignment 153: write a testNG program to signup to facebook  using 11 set of data using dataprovider

package dataproviderpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SetOfDataFb {
	@Test(dataProvider="input")
	public void fb_registartion(String fn,String sn,String mob,String pwd)
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys(fn);
		driver.findElement(By.name("lastname")).sendKeys(sn);
		driver.findElement(By.name("reg_email__")).sendKeys(mob);
		driver.findElement(By.name("reg_passwd__")).sendKeys(pwd);
		WebElement day_dd=driver.findElement(By.id("day"));
		Select s1=new Select(day_dd);
		s1.selectByVisibleText("26");
		WebElement mon_dd=driver.findElement(By.id("month"));
		Select s2=new Select(mon_dd);
		s2.selectByVisibleText("Aug");
		WebElement yr_dd=driver.findElement(By.id("year"));
		Select s3=new Select(yr_dd);
		s3.selectByVisibleText("1991");
																										driver.findElement(By.name("sex")).click();
		driver.findElement(By.name("websubmit")).click();
		driver.close();
	}
	@DataProvider(name="input")
	public Object[][] input_values()
	{
		Object[][] d1=new Object[11][4];
		d1[0][0]="smita";
		d1[0][1]="patil";
		d1[0][2]="9876554448";
		d1[0][3]="facebook123";
		
			d1[1][0]="amol";
			d1[1][1]="patil";
			d1[1][2]="6754567778";
			d1[1][3]="apatil654@gmail.com";
			
				d1[2][0]="anvi";
				d1[2][1]="patil";
				d1[2][2]="67890086";
				d1[2][3]="loginfb123";
				
					d1[3][0]="laddu"; 
					d1[3][1]="patil"; 
					d1[3][2]="99887767"; 
					d1[3][3]="rggg@123";
					
				  		d1[4][0]="shreeya";
				  		d1[4][1]="patil";
				  		d1[4][2]="6868686868";
				  		d1[4][3]="dnuycag$11";
				  		
				  	d1[5][0]="anay";
				  	d1[5][1]="patil";
				  	d1[5][2]="98876788"; 
				  	d1[5][3]="smit#1223";
				  	
				d1[6][0]="sam";
				d1[6][1]="patil";
				d1[6][2]="67575757";
				d1[6][3]="smmu@123";
				
			d1[7][0]="punam";
			d1[7][1]="patil";
			d1[7][2]="565757575747"; 
			d1[7][3]="punam@123";
			
		d1[8][0]="abhi"; 
		d1[8][1]="patil";
		d1[8][2]="8989797"; 
		d1[8][3]="abhi@123";
		
				  d1[9][0]="android";
				  d1[9][1]="nokia"; 
				  d1[9][2]="67686868686"; 
				  d1[9][3]="android@123";
				  
				  		d1[10][0]="vishal";
				  		d1[10][1]="mokashe";
				  		d1[10][2]="68677757";
				  		d1[10][3]="vish@123";
		return d1;
		
	}

}
