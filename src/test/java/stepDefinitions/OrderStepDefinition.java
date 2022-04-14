package stepDefinitions;

import Pages.*;
import Runners.TestRunner;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class OrderStepDefinition extends TestRunner {

    String ProductName = "Asus N551JK-XO076H Laptop";
    SearchPage searchObject;
    ProductDetailsPage detailsObject;
    ShoppingCartPage cartPage;
    CheckoutPage checkoutObject;
    ComparePage compareObject;

    @Before
    public void orderStepDefinitionBeforeClass() {
        searchObject = new SearchPage(driver);
        detailsObject = new ProductDetailsPage(driver);
        cartPage = new ShoppingCartPage(driver);
        checkoutObject = new CheckoutPage(driver);
        compareObject = new ComparePage(driver);
    }

    @Given("Insert product name to order")
    public void insertProductName() {
        searchObject.ProductSearch(ProductName);
    }

    @And("Open product details page to order")
    public void openProductDetails() {
        compareObject.openFirstProduct();
    }

    @Then("Product added to Shopping Cart to do an order")
    public void productAddedToShoppingCart() {
        Assert.assertTrue(cartPage.totalLbl.getText().contains("1,500.00"));
    }

    @And("Open checkout page")
    public void openCheckoutPage() {
        cartPage.OpenCheckoutPage();
    }

    @And("Add user details")
    public void addUserDetails() throws InterruptedException {
        checkoutObject.RegisteredUserCheckoutProduct
                ("Egypt", "test address", "123456", "32445566677", "Cairo", ProductName);
    }

    @Then("Product added in checkout page")
    public void productAddedInCheckoutPage() {
        Assert.assertTrue(checkoutObject.prodcutName.isDisplayed());
        Assert.assertTrue(checkoutObject.prodcutName.getText().contains(ProductName));
    }

    @And("User confirm order")
    public void userConfirmOrder() throws InterruptedException {
        checkoutObject.confirmOrder();
    }

    @Then("Order confirmed")
    public void orderConfirmed() {
        Assert.assertTrue(checkoutObject.ThankYoulbl.isDisplayed());
    }

    @And("user view order details")
    public void viewOrderDetails() {
        checkoutObject.viewOrderDetails();
    }

    @Then("Order added to order details page")
    public void orderAddedToOrderDetails() {
        Assert.assertTrue(driver.getCurrentUrl().contains("orderdetails"));
    }
}
