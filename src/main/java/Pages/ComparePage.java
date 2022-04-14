package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ComparePage extends PageBase
{

	public ComparePage(WebDriver driver) {
		super(driver);
        wait = new WebDriverWait(driver, 30);
	}

    @FindBy(linkText="Asus N551JK-XO076H Laptop")
    public WebElement firstProductName; 
    
    @FindBy(linkText="Apple MacBook Pro 13-inch")
    public WebElement secondProductName ;

    public void openFirstProduct()
    {
        clickButton(firstProductName);
    }

    public void openSecondProduct()
    {
        clickButton(secondProductName);
    }
   

   
}
