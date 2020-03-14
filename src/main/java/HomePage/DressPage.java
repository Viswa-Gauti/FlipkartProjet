package HomePage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DressPage extends BasePage {
	
	/*
	 * @FindBys(@FindBy(xpath="//ul[@class='product_list grid roe']/li")) private
	 * List<WebElement> Products;
	 */	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement Dress;
	
	@FindBy(xpath = "//*[@id=\'layered_id_attribute_group_1\']")
	private WebElement Ssize;
	
	@FindBy(xpath = "//*[@id=\'layered_id_attribute_group_2\']")
	private WebElement Msize;
	
	@FindBy(xpath = "//*[@id=\'layered_id_attribute_group_3\']")
	private WebElement LSize;
	
	
	
	public DressPage()
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement DressTab()
	{
		return Dress;
	}
	public WebElement SelectSSize()
	{
		return Ssize;
	}
	public WebElement SelectMSize()
	{
		return Msize;
	}
	public WebElement SelectLSize()
	{
		return LSize;
	}
}
