package AssertionTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAndHardAssertion {
	
	SoftAssert Softassert = new SoftAssert();
	
	@Test
	public void Test1()
	{
		System.out.println("Open browser");
		Softassert.assertEquals(false, true,"unable tologin");
		
		
		System.out.println("Enable VGIS Extension");
		System.out.println("Login");
		Softassert.assertEquals(false, true,"login failed");
		Softassert.assertAll();
		
	}
	
	@Test
	public void Test2()
	{
		System.out.println("CAll log window");
		Softassert.assertEquals(false, true,"unable to load Call log window");
		
		System.out.println("Activity");
		Softassert.assertEquals(false, true,"unable to load activity");
		
		
		Softassert.assertAll();
				
	}

}
