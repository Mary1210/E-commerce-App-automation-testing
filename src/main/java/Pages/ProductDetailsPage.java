package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase{

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(css="div[class='add-to-wishlist']")
	WebElement addToWishListBtn;

	@FindBy (css="strong[class='current-item']")
	public WebElement productNamebreadCrumb;
	
	@FindBy(xpath="//div[@class='compare-products']")
	WebElement addToCompareBtn ;
	
	@FindBy (xpath="//button[@class='button-1 add-to-cart-button']")
	WebElement addToCartBtn;

	@FindBy(linkText = "HTC One Mini Blue")
	WebElement htcProduct;
	

	public void AddProductToWishList()
	{
		clickButton(addToWishListBtn);
	}
	
	public void AddProductToCompare() 
	{
		clickButton(addToCompareBtn);
	}
	
	public void AddProductToCart()
	{
		clickButton(addToCartBtn);
	}

	public void openHTCProduct()
	{
		clickButton(htcProduct);
	}
}
