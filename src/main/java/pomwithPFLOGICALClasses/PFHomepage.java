package pomwithPFLOGICALClasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class PFHomepage {
	
	@FindBy(xpath="//*[@id=\"wrapper\"]/div[1]/div/a/span[1]/img")
	private WebElement logo;
	
	@FindBy(xpath="//*[@id=\"wrapper\"]/div[1]/ul[2]/li[1]/button")
	private WebElement options;
	
	WebDriver driver;
	public PFHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void verifylogoPF()
	{
		boolean result=logo.isDisplayed();
		if (result==true)
		{
			System.out.println("Tc successfully passed and logo displayed");
		}
		else
		{
			System.out.println("Tc failed and logo is not displayed");
		}
	}
     public void optionsPF()
     {	
      options.click();
}}
