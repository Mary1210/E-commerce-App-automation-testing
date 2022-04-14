package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends PageBase{

	public CheckoutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "BillingNewAddress_FirstName")
	private WebElement fnTxt;

	@FindBy(id = "BillingNewAddress_LastName")
	private WebElement lnTxt;

	@FindBy(id = "BillingNewAddress_Email")
	private WebElement emailTxt;

	@FindBy(id = "BillingNewAddress_CountryId")
	private WebElement countryList;

	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement phoneTxt;

	@FindBy(id = "BillingNewAddress_City")
	private WebElement cityTxt;

	@FindBy(id = "BillingNewAddress_Address1")
	private WebElement addressTxt;

	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement postCodeTxt;

	@FindBy(xpath = "//div[@id='billing-buttons-container']//button[@class='button-1 new-address-next-step-button']")
	private WebElement continueBtn;

	@FindBy(id = "shippingoption_0")
	private WebElement shippingMethodRdo;

	@FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
	private WebElement continueShippingBtn;

	@FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
	private WebElement continuePaymentBtn;

	@FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
	private WebElement continueInfoBtn;

	@FindBy(css = "a.product-name")
	public WebElement prodcutName;

	@FindBy(xpath = "//button[@class='button-1 confirm-order-next-step-button']")
	private WebElement confirmBtn;

	@FindBy(css = "h1")
	public WebElement ThankYoulbl;

	@FindBy(linkText = "Click here for order details.")
	private WebElement orderDetailsLink;
	

	public void RegisteredUserCheckoutProduct(String countryName, String address, 
			String postcode, String phone, String city, String productName) throws InterruptedException {
		select = new Select(countryList);
		select.selectByVisibleText(countryName);
		setTextElementText(cityTxt, city);
		setTextElementText(addressTxt, address);
		setTextElementText(postCodeTxt, postcode);
		setTextElementText(phoneTxt, phone);
		clickButton(continueBtn);
		clickButton(shippingMethodRdo);
		clickButton(continueShippingBtn);
		clickButton(continuePaymentBtn);
		clickButton(continueInfoBtn);
	}

	public void confirmOrder()
	{
		clickButton(confirmBtn);
	}

	public void viewOrderDetails() {
		clickButton(orderDetailsLink);
	}

}
