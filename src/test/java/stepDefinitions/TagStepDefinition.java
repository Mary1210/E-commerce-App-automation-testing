package stepDefinitions;

import Pages.*;
import Runners.TestRunner;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TagStepDefinition extends TestRunner {

    HomePage homeObject;
    TagPage tagObject;

    @Before
    public void TagStepDefinitionBeforeClass() {
        homeObject = new HomePage(driver);
        tagObject = new TagPage(driver);
    }

    @Given("Open category page")
    public void openCategoryPage()
    {
        homeObject.openDigitalDownloads();
    }

    @When("User click on tag")
    public void clickOnTag() {
        tagObject.clickOnBookTag();
    }

    @Then("Tagged product page open")
    public void taggedProductPageOpen_01()
    {
        Assert.assertTrue(tagObject.titleBook.getText().contains("book"));
    }


    @And("User click on another tag")
    public void clickOnAnotherTag() {
        tagObject.clickOnDigitalTag();
    }

    @Then("Another tagged product page open")
    public void taggedProductPageOpen_02() {
        Assert.assertTrue(tagObject.titleDigital.getText().contains("digital"));
    }
}
