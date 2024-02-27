package InhritPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollInfinite {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
		for(int i=0;i<=1;i-- ) {
		JavascriptExecutor jse=		driver;
		jse.executeScript("window.scrollBy(0,1400)");
		}
	}

}
