package stepDefinitions;

import Pages.CategoryPage;
import Pages.HomePage;
import Runners.TestRunner;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FilterStepDefinition extends TestRunner {

    HomePage homeObject;
    CategoryPage categoryObject;

    @Before
    public void FilterStepDefinitionBeforeClass() {
        homeObject = new HomePage(driver);
        categoryObject = new CategoryPage(driver);
    }

    @Given("Click on Appreal category")
    public void clickOnCategory()
    {
        homeObject.openApprealCategory();
    }

    @When("User click on Shoes category")
    public void clickOnSubCategory()
    {
        homeObject.openShoesCategory();
    }

    @Then("Shoes page category page opens successfully")
    public void shoesPageOpens()
    {
        Assert.assertTrue(categoryObject.shoesTitle.getText().contains("Shoes"));
    }

    @And("User select color filter")
    public void selectColor()
    {
        categoryObject.selectColor("Red");
    }

    @Then("Color filter selected")
    public void colorFilterSelected()
    {
        Assert.assertTrue(categoryObject.redcolor.isSelected());
    }
}
