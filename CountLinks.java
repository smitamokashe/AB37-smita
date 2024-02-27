package selenium.program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinks {

	public static void main(String[] args) {
		System.out.println("Assignment 126: Count the number of links we have in amazon webpage,locate using tag name");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		//count link
		List <WebElement> countLink= driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:  " + countLink.size());
		
		//print each url
		for(int i=0;i<=countLink.size()-1;i++) {
			WebElement a=countLink.get(i);
			String url=a.getAttribute("href");
			System.out.println(url);
		}
		
		//getting link's linktext
		
		for(int i=0;i<=countLink.size()-1;i++) {
			WebElement a1=countLink.get(i);
			String text_msg=a1.getText();
			System.out.println(text_msg);
	}
		
	}

}
