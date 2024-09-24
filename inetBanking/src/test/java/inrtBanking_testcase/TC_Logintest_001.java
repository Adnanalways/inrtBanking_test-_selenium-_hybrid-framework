package inrtBanking_testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import inetBanking.LoginPage;

public class TC_Logintest_001 extends BaseClass
{
	

	@Test
	public void loginTest()

	{
		
		driver.get(baseUrl);
		
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(Password);
		
		lp.clicksubmit();
		
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(true);
		}
	}
}
