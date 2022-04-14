package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TagPage extends PageBase{

    public TagPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    @FindBy(linkText = "book")
    WebElement bookTag;

    @FindBy(linkText = "digital")
    WebElement digitalTag;

    @FindBy(xpath = "//h1[contains(text(),  'book')]")
    public WebElement titleBook;

    @FindBy(xpath = "//h1[contains(text(),  'digital')]")
    public WebElement titleDigital;

    public void clickOnBookTag(){
        bookTag.click();
    }

    public void clickOnDigitalTag() {
        digitalTag.click();
    }

}
