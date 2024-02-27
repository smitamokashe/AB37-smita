package selenium.program;

import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsClass {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration");
		driver.manage().window().maximize();

	}
   
}
   