package Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.TestBase;
import Pages.PageHome;

public class TestHome extends TestBase {

	PageHome home;
	
	@BeforeMethod
	public void setup()
	{
		initilization();
		home = new PageHome();
	}

	@Test (enabled = false)
	public void getText()
	{
		home.Date();
		home.verifyCountry();
	}
	
	@Test (enabled = true)
	public void Verify() 
	{
		String actual = home.verifyText1();
		Assert.assertEquals(actual, "Release date");
		
		String  actual2 = home.verifyText2();
		Assert.assertEquals(actual2, "Country of origin");
	}
	
//	@Test (enabled = false)
//	public void Verify2() 
//	{	
//		String  actual = home.verifyText2();
//		Assert.assertEquals(actual, "Country of origin");
//	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Test(enabled = true)
//	public void TestPushpaZukegaNahiSala1()
//	{		
//		home.verifycountaryoforiginlabel();
//		home.verifyreleasedatelabel();
//	}
//			
//	@Test(enabled = true)
//	public void TestPushpaZukegaNahiSala2()
//	{		
//	String date = home.verifydatelabel();
//    Assert.assertEquals(date, "December 17, 2021 (United States)");
//    
//	String countary =	home.verifycountarylabel();
//	Assert.assertEquals(countary, "India");   
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
		
}
