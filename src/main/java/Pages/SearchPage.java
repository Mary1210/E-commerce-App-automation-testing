package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class SearchPage extends PageBase {

	public SearchPage(WebDriver driver)
	{
		super (driver);
	}
	
	@FindBy(id="small-searchterms")
	WebElement searchTextBox;
	
	@FindBy (xpath="//button[@type='submit']")
	WebElement searchBtn;
	
	@FindBy(id="ui-id-1")
	List<WebElement> ProductList;
	
	@FindBy (linkText="Apple MacBook Pro 13-inch")
	WebElement productTitle;
	
	public void ProductSearch(String productName)
	{
		setTextElementText(searchTextBox, productName);
	}

	public void clickSearchBtn()
	{
		clickButton(searchBtn);
	}
	
	public void OpenProductDetailsPage() {
		clickButton(productTitle);
	}


}
