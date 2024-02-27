package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAmazon {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=10590786658388695687&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9146075&hvtargid=kwd-10573980&hydadcr=14453_2316415");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shoe");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

	}

}
