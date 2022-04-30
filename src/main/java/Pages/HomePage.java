package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait(driver, 30);
		action = new Actions(driver);
	}

	@FindBy(linkText="Register")
	WebElement registerLink;

	@FindBy (linkText="Log in")
	WebElement loginLink;

	@FindBy (linkText="Contact us")
	WebElement contactUsLink;

	@FindBy(id="customerCurrency")
	public WebElement CurrenyDropdown;

	@FindBy(xpath = "//div[@class='topic-block-title']")
	public WebElement welcomeHomeMessage;

	@FindBy(name="customerCurrency")
	public WebElement customerCurrency;

	@FindBy(xpath="//ul[@class='top-menu notmobile']//a[@href='/electronics']")
	WebElement electronicsLink;

	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[@href='/cell_phones']")
	WebElement cellPhoneLink;

	@FindBy(xpath="//ul[@class='top-menu notmobile']//a[@href='/apparel']")
	WebElement apparelLink;

	@FindBy(xpath = "//div[@class='picture']//a[@href='/shoes']")
	WebElement shoesLink;

	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[@href='/digital-downloads']")
	WebElement digitalDownloadsLink;

	@FindBy(xpath = "//div[@class='header-menu']")
	WebElement headerMenu;

	public void openRegisterationPage()
	{
		wait.until(ExpectedConditions.elementToBeClickable(registerLink));
		clickButton(registerLink);
	}

	public void openLoginPage()
	{
		wait.until(ExpectedConditions.elementToBeClickable(loginLink));
		clickButton(loginLink);
	}

	public void changeCurrencyToEuro()
	{
		select = new Select(CurrenyDropdown);
		select.selectByVisibleText("Euro");
	}

	public void changeCurrencyToDollar()
	{
		select = new Select(CurrenyDropdown);
		select.selectByVisibleText("US Dollar");
	}

	public void openElectronicsCategory()
	{
		action.moveToElement(electronicsLink).moveToElement(cellPhoneLink).click().build().perform();
	}

	public void openCellPhonesPage()
	{
		action.moveToElement(cellPhoneLink).build().perform();
	}

	public void openApprealCategory()
	{
		clickButton(apparelLink);
	}

	public void openShoesCategory()
	{
		clickButton(shoesLink);
	}

	public void openDigitalDownloads() {
		digitalDownloadsLink.click();
	}
	

}
