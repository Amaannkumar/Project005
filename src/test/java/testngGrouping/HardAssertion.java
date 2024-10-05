package testngGrouping;

import org.testng.Assert;
import org.testng.annotations.Test;


public class HardAssertion {
	@Test
	public void test() {
		System.out.println("Flipkart..");
		System.out.println("Flipkart..");
		Assert.assertEquals("1","2");
		System.out.println("Flipkard..");
		System.out.println("Flipkard..");
		
		
	}
	

}
