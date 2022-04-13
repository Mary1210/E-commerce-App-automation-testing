package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Time;
import java.util.List;
import java.util.Timer;

public class SearchPage extends PageBase {

	public SearchPage(WebDriver driver)
	{
		super (driver);
		wait = new WebDriverWait(driver , 30);
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
