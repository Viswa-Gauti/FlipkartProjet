package HomePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home extends BasePage {
	
	@FindBy(xpath ="//*[@id=\'newsletter-input\']") 
	private WebElement Email;
	@FindBy(xpath="//*[@id=\'newsletter_block_left\']/div/form/div/button")
	private WebElement Click;
	
	public Home()
	{
		PageFactory.initElements(driver, this);
	} 
	public WebElement getNewsLetter() {
		
		return Email;	
	}
	public WebElement getClick()
	{
		return Click;
		
	}
}
