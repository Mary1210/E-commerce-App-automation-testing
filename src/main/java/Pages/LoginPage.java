package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends PageBase{

	private WebDriverWait wait;


	public LoginPage(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait(driver , 30);
	}

	@FindBy (id="Email")
	WebElement emailTextBox;

	@FindBy (id="Password")
	WebElement passwordTextBox;

	@FindBy (xpath = "//button[@class='button-1 login-button']")
	WebElement loginBtn;

	@FindBy(linkText = "Log out")
	WebElement logoutBtn;

	@FindBy(linkText = "Forgot password?")
	WebElement forgetPasswordBtn;

	public void UserLogin(String email, String password)
	{
		setTextElementText(emailTextBox, email);
		setTextElementText(passwordTextBox, password);
	}
	public void clickLoginBtn() {
		clickButton(loginBtn);
	}


	public void GotoForgetPasswordPage()
	{
		clickButton(forgetPasswordBtn);
	}

	public void clickLogoutBtn() {
		clickButton(logoutBtn);
	}




}
