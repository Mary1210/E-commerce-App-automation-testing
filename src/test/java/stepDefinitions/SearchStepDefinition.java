package stepDefinitions;

import Pages.ProductDetailsPage;
import Pages.SearchPage;
import Runners.TestRunner;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SearchStepDefinition extends TestRunner {

    String productName = "Apple MacBook Pro 13-inch";
    SearchPage searchObject;
    ProductDetailsPage detailsObject;


    @Before
    public void SearchStepDefinitionBeforeClass() {
        searchObject = new SearchPage(driver);
        detailsObject = new ProductDetailsPage(driver);
    }

    @And("Insert product name to search")
    public void insertProductName()
    {
        //searchObject = new SearchPage(driver);
        searchObject.ProductSearch(productName);
    }

    @Then("User click on search button")
    public void clickSearchBtn()
    {
        searchObject.clickSearchBtn();
    }

    @And("Open product details page")
    public void openProductDetailsPage()
    {
        searchObject.OpenProductDetailsPage();
    }

    @Then("Product details page opens successfully")
    public void productPageOpen()
    {
        Assert.assertEquals(detailsObject.productNamebreadCrumb.getText(), productName);
    }

}
