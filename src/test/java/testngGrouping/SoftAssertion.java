package testngGrouping;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	@Test
	public void soft() {
		System.out.println("Flipkart..");
		System.out.println("Flipkart..");
		SoftAssert s=new SoftAssert();
		s.assertEquals("1","2");
		System.out.println("Flipkard..");
		System.out.println("Flipkard..");
		s.assertAll();
	}

}
