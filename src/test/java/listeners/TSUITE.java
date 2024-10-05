package listeners;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.MyListener.class)
public class TSUITE {
	@Test
	public void r11() {
		//System.out.println("R11 is running");
	}
	@Test
	public void r12() {
		//System.out.println("R12 is running");
		Assert.fail();
	}
	@Test
	public void r13() {
		//System.out.println("R13 is running");
	}
}
