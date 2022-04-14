package stepDefinitions;

import Pages.ProductDetailsPage;
import Pages.SearchPage;
import Pages.ShoppingCartPage;
import Pages.WishListPage;
import Runners.TestRunner;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WistListStepDefinition extends TestRunner {

    String productName = "HTC One Mini Blue";
    SearchPage searchObject;
    ProductDetailsPage detailsObject;
    WishListPage wishlistobject;

    @Before
    public void WishListStepDefinitionBeforeClass() {
        searchObject = new SearchPage(driver);
        detailsObject = new ProductDetailsPage(driver);
        wishlistobject = new WishListPage(driver);
    }

    @Given("Insert product name to wist list")
    public void insertProductName()
    {
        searchObject.ProductSearch(productName);
    }

    @And("Open product details page for wish list")
    public void openProductDetails() {
        detailsObject.openHTCProduct();
    }

    @Then("Add product to wish list")
    public void addProductToWistList()
    {
        detailsObject.AddProductToWishList();
    }

    @And("Go to wist list page")
    public void goToWishList()
    {
        driver.navigate().to("https://demo.nopcommerce.com/wishlist");
    }

    @Then("Product added to wist list")
    public void productAddedToWishList()
    {
        Assert.assertTrue(wishlistobject.ProductCell.getText().contains(productName));
        wishlistobject.removeProductFromCart();
        Assert.assertTrue(wishlistobject.EmptyCartbl.getText().contains("empty!"));
    }
}
