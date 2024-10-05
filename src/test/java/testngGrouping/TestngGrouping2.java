package testngGrouping;
import org.testng.annotations.Test;
@Test(groups= {"All Testcases"})
public class TestngGrouping2 {
	
		@Test(groups= {"chrome.sanity"})
		public void w16()
		{
			System.out.println("w16 is running");
		}
		@Test(groups= {"chrome.smoke"})
		public void w17()
		{
			System.out.println("w17 is running");
		}
		@Test(groups= {"firefox.regression"})
		public void w18()
		{
			System.out.println("w18 is running");
		}
		@Test(groups= {"firefox.sanity"})
		public void w19()
		{
			System.out.println("w19 is running");
		}
		@Test(groups={"firefox.smoke"})
		public void w20()
		{
			System.out.println("w20 is running");
		}
		
		

	}

