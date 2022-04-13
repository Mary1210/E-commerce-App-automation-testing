package stepDefinitions;

import Pages.RegistrationPage;
import Runners.TestRunner;
import com.github.javafaker.Faker;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.BeforeClass;


public class RegistrationStepDefinition extends TestRunner{
    LoginPage LoginObject;
    HomePage HomeObject;
    RegistrationPage registerObject;

    @Before
    public void RegistrationStepDefinitionBeforeClass()
    {
        HomeObject =new HomePage(driver);
        LoginObject = new LoginPage(driver);
        registerObject= new RegistrationPage(driver);
    }

    @Given("Open Registeration Page")
    public void openRegisterationPage()
    {
        HomeObject.openRegisterationPage();
    }

    @When("User enter valid data")
    public void insertValidData()
    {
        registerObject.userRegisteration("test", "test", "test1234@mail.com", "12345678");
    }

    @And("User click on register button")
    public void userClickRegisterBtn()
    {

        registerObject.clickRegisterButton();
    }

    @And("user click logout")
    public void userLogoutSuccessfully()
    {
        LoginObject.clickLogoutBtn();
    }

    @Then("user could register successfully")
    public void userRegisterSuccessfully()
    {
        Assert.assertTrue(registerObject.successMessage.getText().contains("Your registration completed"));
    }

    @Then("user logout successfully")
    public void userLogoutToHomePage()
    {
        Assert.assertTrue(HomeObject.welcomeHomeMessage.getText().contains("Welcome to our store"));

    }


}
