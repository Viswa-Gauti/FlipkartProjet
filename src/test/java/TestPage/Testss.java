package TestPage;

import org.testng.annotations.Test;

import HomePage.BasePage;
import HomePage.Home;

public class Testss {
	
	Home hm;
	BasePage bp;
	
	public Testss() 
	{
		hm= new Home();
		bp= new BasePage();
	}
	@Test
	public void VerifyNewsLetter()
	{
		hm.getNewsLetter().sendKeys("viswa@gmail.com");
	}
	@Test
	public void VerifyClick()
	{
		hm.getClick().click();
	}
}
