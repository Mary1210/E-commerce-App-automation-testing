package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends PageBase {

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	@FindBy (css="span[class='product-subtotal']")
	public WebElement totalLbl;
	
	@FindBy(id="checkout")
	WebElement checkoutBtn;
	
	@FindBy(id="termsofservice")
	WebElement agreeCheckBox;

	@FindBy(id="termsofservice")
	WebElement agreeCheckbox;

	@FindBy(name="updatecart")
	WebElement removeBtn;

	@FindBy (css= "div[class='no-data']")
	public WebElement EmptyCartbl;
	
	public void OpenCheckoutPage()
	{
		clickButton(agreeCheckBox);
		clickButton(checkoutBtn);
	}

	public void removeFromCart()
	{
		clickButton(removeBtn);
	}
}
