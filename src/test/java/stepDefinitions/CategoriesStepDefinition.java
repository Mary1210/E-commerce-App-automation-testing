package stepDefinitions;

import Pages.CategoryPage;
import Pages.HomePage;
import Runners.TestRunner;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CategoriesStepDefinition extends TestRunner {

    HomePage homeObject;
    CategoryPage categoryObject;

    @Before
    public void CategoriesStepDefinitionBeforeClass() {
        homeObject = new HomePage(driver);
        categoryObject = new CategoryPage(driver);
    }

    @Given("Click on category")
    public void clickOnCategory()
    {
        homeObject.openElectronicsCategory();
    }

 /*  @When("User click on sub category")
    public void clickOnSubCategory()
    {
        homeObject.openCellPhonesPage();
    }*/

    @Then("Sub category page opens successfully")
    public void subCategoryOpens()
    {
        Assert.assertTrue(categoryObject.cellPhonesTitle.getText().contains("Cell phones"));
    }
}
