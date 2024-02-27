package selenium.program;

import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonWindowHandle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();

	}

}
