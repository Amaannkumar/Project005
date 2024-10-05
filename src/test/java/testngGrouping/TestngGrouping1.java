package testngGrouping;

import org.testng.annotations.Test;
@Test(groups= {"All Testcases"})
public class TestngGrouping1 {
	@Test(groups= {"chrome.sanity"})
	public void w11()
	{
		System.out.println("w11 is running");
	}
	@Test(groups= {"chrome.smoke"})
	public void w12()
	{
		System.out.println("w12 is running");
	}
	@Test(groups= {"firefox.regression"})
	public void w13()
	{
		System.out.println("w13 is running");
	}
	@Test(groups= {"firefox.sanity"})
	public void w14()
	{
		System.out.println("w14 is running");
	}
	@Test(groups={"firefox.smoke"})
	public void w15()
	{
		System.out.println("w15 is running");
	}
	
	

}
