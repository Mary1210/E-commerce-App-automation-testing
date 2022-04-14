package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
	protected WebDriver driver;
	Select select;
	WebDriverWait wait;
	Actions action;

	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	protected static void clickButton(WebElement button)
	{
		button.click();
	}

	protected static void setTextElementText(WebElement textElement, String value)
	{
		textElement.sendKeys(value);
	}
	
	
	public void clearText(WebElement element) 
	{
		element.clear();
	}
	
}


