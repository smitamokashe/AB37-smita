package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {

	public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.com");
			driver.manage().window().maximize();
			
			WebElement cate_dd=driver.findElement(By.id("searchDropdownBox"));
			Select s1=new Select(cate_dd);
			s1.selectByVisibleText("Books");
			
	}
	//maven-archetype-quickstart 1.4
}
//(//select[@id='Skills'])[1]