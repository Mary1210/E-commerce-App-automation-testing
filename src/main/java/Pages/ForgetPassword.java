package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgetPassword extends PageBase {

	public ForgetPassword(WebDriver driver) {
		super(driver);
		
	}

	@FindBy (id="Email")
	WebElement emailTxtbox;
	
	@FindBy (name="send-email")
	WebElement retrievepasswordBtn;
	
	@FindBy(xpath="//span[@class='close']")
	WebElement closeBtn;

	@FindBy(xpath = "//div[@class='bar-notification success']")
	public WebElement recoverSuccessMessage;

	public void Forgetpassword(String email)
	{
		setTextElementText(emailTxtbox, email);
		clickButton(retrievepasswordBtn);
	}
	public void closeRecoverSuccessMessage() {
		clickButton(closeBtn);
	}
	
	
}
