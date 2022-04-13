package stepDefinitions;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegistrationPage;
import Pages.MyaccountPage;
import Pages.ForgetPassword;
import Runners.TestRunner;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LoginStepDefinition extends TestRunner {

    LoginPage LoginObject;
    HomePage HomeObject;
    RegistrationPage registerObject;
    MyaccountPage MyaccountObject;
    ForgetPassword ForgetObject;
    RegistrationStepDefinition register;

    @Before
    public void LoginStepDefinitionBeforeClass()
    {
        HomeObject =new HomePage(driver);
        LoginObject = new LoginPage(driver);
        registerObject= new RegistrationPage(driver);
        MyaccountObject = new MyaccountPage(driver);
        ForgetObject = new ForgetPassword(driver);
    }

    @Given("Open login Page")
    public void openLoginPage()
    {
        HomeObject.openLoginPage();
    }

    @When("User enter valid username and password")
    public void insertValidData()
    {
        LoginObject.UserLogin("test1234@mail.com", "12345678");
    }

    @When("Click on forget Password")
    public  void goToForgetPasswordPage()
    {
        LoginObject.GotoForgetPasswordPage();
    }

    @And("User click on login button")
    public void userClickLoginBtn()
    {
        LoginObject.clickLoginBtn();
    }

    @And("User write E-mail")
    public void enterEmailForForgetPassword()
    {
        ForgetObject.Forgetpassword("test1234@mail.com");
    }

    @And("User click on logout button")
    public void userClickLogoutBtn(){
        LoginObject.clickLogoutBtn();
    }


    @Then("User could login successfully")
    public void userLoginSuccessfully()
    {
        Assert.assertTrue(registerObject.logoutLink.getText().contains("Log out"));
    }

    @Then("Email sent successfully to retrieve password")
    public void emailSentSuccessfully()
    {
        Assert.assertTrue(ForgetObject.recoverSuccessMessage.getText().contains("Email with instructions has been sent to you."));
        ForgetObject.closeRecoverSuccessMessage();
    }

    @Then("User could logout successfully")
    public void userLogoutSuccessfully() {
        Assert.assertTrue(registerObject.loginLink.getText().contains("Log in"));
    }


}
