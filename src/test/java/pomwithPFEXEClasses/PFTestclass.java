package pomwithPFEXEClasses;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomwithPFLOGICALClasses.PFHomepage;
import pomwithPFLOGICALClasses.PFLoginpage;


public class PFTestclass {
	public static void main (String[]args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://project1.qualibytes.com/backend/admin/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		PFLoginpage k=new PFLoginpage(driver);
		k.setusernamePF();
		k.setpasswordPF();
		k.verifylogbutPF();
		
		PFHomepage m=new PFHomepage(driver);
		m.verifylogoPF();
		m.optionsPF();
	}
	

}
