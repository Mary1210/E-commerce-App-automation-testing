package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ComparePage extends PageBase
{

	public ComparePage(WebDriver driver) {
		super(driver);
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
