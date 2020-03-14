package TestPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import HomePage.BasePage;
import HomePage.DressPage;

public class DressPageTest {
	
	DressPage dp;
	BasePage bp;
	
	public DressPageTest()  
	{
		dp=new DressPage();
		bp=new BasePage();
	}
	@Test
	public void VerifyDress()
	{
		dp.DressTab().click();
		Assert.assertTrue(dp.getTitlte().contains("Dress"),"Failed to Navigate");
	}
	@Test
	public void VerifySsize()
	{
		dp.SelectSSize().click();
		//Assert.assertTrue(dp..contains("S"),"Failed to Click");
		dp.SelectMSize().click();
		Assert.assertTrue(dp.getTitlte().contains("M"),"Failed to Click");
		dp.SelectLSize().click();
		Assert.assertTrue(dp.getTitlte().contains("L"),"Failed to Click");
		
	}
}
