package stepDefinitions;

import Pages.ProductDetailsPage;
import Pages.SearchPage;
import Pages.ShoppingCartPage;
import Runners.TestRunner;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingCartStepDefinition extends TestRunner {

    String productName = "HTC One Mini Blue";
    SearchPage searchObject;
    ProductDetailsPage detailsObject;
    ShoppingCartPage cartPage;

    @Before
    public void ShpoppingCartStepDefinitionBeforeClass() {
        searchObject = new SearchPage(driver);
        detailsObject = new ProductDetailsPage(driver);
        cartPage = new ShoppingCartPage(driver);
    }

    @Given("Insert product name")
    public void insertProductName()
    {
        searchObject.ProductSearch(productName);
    }

    @And("Open product details page to shopping cart")
    public void openProductDetails()
    {
        detailsObject.openHTCProduct();
    }

    @Then("Add product to shopping Cart")
    public void addProductToShoppingCart()
    {
        detailsObject.AddProductToCart();
    }

    @And("Go to Shopping cart page")
    public void goToShoppingCart()
    {
        driver.navigate().to("https://demo.nopcommerce.com/cart");
    }

    @Then("Product added to Shopping Cart")
    public void productAddedToShoppingCart()
    {
        Assert.assertTrue(cartPage.totalLbl.getText().contains("100"));
        cartPage.removeFromCart();
        Assert.assertTrue(cartPage.EmptyCartbl.getText().contains("empty!"));
    }
}
