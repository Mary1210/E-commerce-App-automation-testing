package stepDefinitions;

import Pages.ComparePage;
import Pages.ProductDetailsPage;
import Pages.SearchPage;
import Runners.TestRunner;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CompareStepDefinition extends TestRunner {

    String firstProductName = "Asus N551JK-XO076H Laptop";
    String secondProductName = "Apple MacBook Pro 13-inch";
    SearchPage searchObject;
    ProductDetailsPage detailsObject;
    ComparePage compareObject;

    @Before
    public void WishListStepDefinitionBeforeClass() {
        searchObject = new SearchPage(driver);
        detailsObject = new ProductDetailsPage(driver);
        compareObject = new ComparePage(driver);
    }

    @Given("Insert first product name to compare")
    public void insertFirstProductName()
    {
        searchObject.ProductSearch(firstProductName);
    }

    @And("Open product details page for first product")
    public void openProductDetails() {
        compareObject.openFirstProduct();
    }


    @Then("Add product to compare")
    public void addProductToCompare() {
        detailsObject.AddProductToCompare();
    }

    @And("Insert second product name to compare")
    public void insertSecondProductName()
    {
        searchObject.ProductSearch(secondProductName);
    }


    @And("Open product details page for second product")
    public void openSecondProduct()
    {
        compareObject.openSecondProduct();
    }

    @And("Go to compare page")
    public void goToComparePage()
    {
        driver.navigate().to("http://demo.nopcommerce.com" + "/compareproducts");
    }

    @Then("Products added to compare page")
    public void productsAddedToComparePage()
    {
        Assert.assertTrue(compareObject.firstProductName.getText().equals("Asus N551JK-XO076H Laptop"));
        Assert.assertTrue(compareObject.secondProductName.getText().equals("Apple MacBook Pro 13-inch"));
    }
}
