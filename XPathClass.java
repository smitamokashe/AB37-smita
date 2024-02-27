package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathClass {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Assignment 117: Launch (JSAM) HTML page get elements by xpath(absolute xpath)");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///D:/learningHTML1.html");
		driver.manage().window().maximize();
		/*driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("smita");
		driver.findElement(By.xpath("((/html/body/form)[2]/input)[3]")).click();
		driver.findElement(By.tagName("a")).click();*/
		
		/*WebElement l_name=driver.findElement(By.id("121"));
		boolean check_l_name = l_name.isEnabled();
		
		if(check_l_name==true &&  l_name.isDisplayed()) {
			l_name.sendKeys("123");
		}
		else {
			System.out.println("Not enabled");
		}*/   
		  
		
		WebElement checkBox1= driver.findElement(By.xpath("/html/body/input)[6]"));
		checkBox1.click();
		Thread.sleep(2000);
		
		if(checkBox1.isSelected()==true) {
			System.out.println("click on submit");
		}
		else {
			checkBox1.click();
		}
	}
}
