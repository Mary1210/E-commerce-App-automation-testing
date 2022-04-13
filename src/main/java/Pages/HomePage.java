package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends PageBase{

	Actions action;
	public HomePage(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait(driver, 30);
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

	@FindBy(name="Electronics")
	WebElement electronicsLink;

	@FindBy(linkText = "Cell phones ")
	WebElement cellPhoneLink;

	@FindBy(name="Apparel ")
	WebElement apparelLink;

	@FindBy(linkText = "Shoes ")
	WebElement shoesLink;

	@FindBy(linkText = "Digital downloads ")
	WebElement digitalDownloadsLink;

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

	public void changeCurrency()
	{
		select = new Select(CurrenyDropdown);
		select.selectByVisibleText("Euro");
	}

	public void openElectronicsCategory()
	{
		action.moveToElement(electronicsLink).perform();
	}

	public void openCellPhonesPage()
	{
		action.moveToElement(cellPhoneLink).perform();
	}

	public void openApprealCategory()
	{
		action.moveToElement(apparelLink).perform();
	}

	public void openShoesCategory()
	{
		action.moveToElement(shoesLink).perform();
	}

	public void openDigitalDownloads() {
		digitalDownloadsLink.click();
	}
	

}
