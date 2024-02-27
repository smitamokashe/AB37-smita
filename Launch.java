package selenium.program;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launch {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Assignment 110: WAP to launch Google using get in selenium");
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://www.google.com");
		
		System.out.println(c1.getWindowHandle());
		System.out.println(c1.getWindowHandles());
		System.out.println(c1.getTitle());
		/*Thread.sleep(2000);
		//c1.close();
		c1.quit();*/
		//FirefoxDriver fs=new FirefoxDriver();z
		
		//fs.get("https://www.google.com");
		//InternetExplorerDriver ie = new InternetExplorerDriver();
		
		//ie.get("https://www.google.com");
		//GeckoDriverInfo gk=new GeckoDriverInfo();
		
	}

}
