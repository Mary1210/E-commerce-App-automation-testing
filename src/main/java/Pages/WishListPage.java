package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WishListPage extends PageBase{

	public WishListPage(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait(driver, 30);
	}
	
	@FindBy (css="td.product")
	public WebElement ProductCell;
	
	@FindBy(css="h1")
	public WebElement WishlistHeader;
	
	 @FindBy (name="updatecart")
	 WebElement removefromCartCheck;
	
	 @FindBy (css= "div[class='no-data']")
	 public WebElement EmptyCartbl;
	 
	 public void removeProductFromCart()
	 {
		// wait.until(ExpectedConditions.elementToBeSelected(removefromCartCheck));
		 clickButton(removefromCartCheck);
		 //clickButton(updateWishlistBtn);
	 }
	 

}
