package testNG01;
import org.testng.annotations.Test;
import org.testng.Assert;
public class Keywords2 {
	
	
		@Test
		public void r4() {
			System.out.println("r4 is running");
		}
		@Test
		public void r5() {
			System.out.println("r5 is running");
		}
		@Test
		public void r6() {
			System.out.println("r6 is running");
			Assert.fail();
			
		}

	}



