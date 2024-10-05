package pomwithPFLOGICALClasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PFLoginpage {
	
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='emailaddress']")
	private WebElement un;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement pwd;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginbutton;
	
	
	public PFLoginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void setusernamePF() {
		un.sendKeys("admin@mail.com");
	}
	public void setpasswordPF() {
		pwd.sendKeys("Password@123");
	}
	public void verifylogbutPF() {
		loginbutton.click();
	}	

}
