package testNG01;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pomwithPFLOGICALClasses.PFHomepage;
import pomwithPFLOGICALClasses.PFLoginpage;


public class TestscwithPF2 {
	WebDriver driver;
	PFLoginpage a;
	PFHomepage b;
	
	@Test
	public void verifylogo() {
		System.out.println("TS1 is executing for logo varyfication");
		b.verifylogoPF();
		System.out.println("TS1 is execute successfully and logo verify");
	}
	@BeforeClass
	public void openbrowser() {
		System.out.println("open browser");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://project1.qualibytes.com/backend/admin/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		a=new PFLoginpage(driver);
		b=new PFHomepage(driver);	
	}
	@BeforeMethod
	public void loginHMS() {
		System.out.println("Login into application");
		a.setusernamePF();
		a.setpasswordPF();
		a.verifylogbutPF();
	}
	@AfterMethod
	public void LogoutHMS() {
		System.out.println("Logout into application");
		b.verifylogoPF();
		b.optionsPF();
	}
	@AfterClass
	public void closebrowser()
	{
		System.out.println("CloseBrowser");
		driver.quit();
	}

}
