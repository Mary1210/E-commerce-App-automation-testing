package stepDefinitions;

import Pages.HomePage;
import Pages.ProductDetailsPage;
import Pages.SearchPage;
import Runners.TestRunner;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CurrencyStepDefinition extends TestRunner {

    HomePage homeObject;

    @Before
    public void CurrencyStepDefinitionBeforeClass() {
        homeObject = new HomePage(driver);
    }

    @Given("Click on currency dropdown")
    public void changeCurrency()
    {
        homeObject.changeCurrencyToEuro();
    }
    @Then("Currency changes successfully")
    public void currencyChanged()
    {
        Assert.assertEquals(true, homeObject.customerCurrency.getText().contains("Euro"));
    }

    @And("Change currency again")
    public void changeCurrencyAgain()
    {
        homeObject.changeCurrencyToDollar();
    }
}
