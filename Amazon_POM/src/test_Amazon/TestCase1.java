package test_Amazon;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import source_Amazon.*;

//login with correct password
public class TestCase1 {
	@Test
	public void login_to_amazon() {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fb%2Fref%3Dnav_ya_signin%3F_encoding%3DUTF8%26node%3D6648217031%26pd_rd_w%3DnaRM1%26content-id%3Damzn1.sym.fd3d60f7-29ad-49a0-9806-0537521c536e%26pf_rd_p%3Dfd3d60f7-29ad-49a0-9806-0537521c536e%26pf_rd_r%3D2YN29EWZZEQBYYKCG14W%26pd_rd_wg%3Dv6owx%26pd_rd_r%3D0a5ace36-9897-40c6-97d3-90df9213dfcd&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Login l1=new Login(driver);
		l1.un();
		l1.continue_method();
		l1.pwd();
		l1.signIn_Button1();
	}
}
