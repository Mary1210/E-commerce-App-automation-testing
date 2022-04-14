package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class CategoryPage extends PageBase{
    public CategoryPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(xpath = "//div[@class='page-title']")
    public WebElement cellPhonesTitle;

    @FindBy(xpath="//h1[contains(text(), 'Shoes')]")
    public WebElement shoesTitle;

    @FindBy(xpath = "//div[@class='filter-content']")
    WebElement filterColor;

    @FindBy(tagName = "li")
    List <WebElement> allColors;

    @FindBy(xpath="//input[@id='attribute-option-15']")
    public WebElement redcolor;

    public void selectColor(String selectColor)
    {
        for (WebElement color: allColors)
        {
            if(color.getText().equals(selectColor)) {
                color.click();
            }
        }
    }
}
