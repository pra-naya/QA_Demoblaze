package StepDefinitions;

import Application.Demoblaze;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

import static com.codeborne.selenide.Selenide.sleep;

public class StepFile {
    Demoblaze app;

    @Given("^User has opened the browser$")
    public void openBrowser() {
        app = new Demoblaze();
        app.openBrowser();
    }


    @When("User opens the website")
    public void goToDemoblaze() {
        app.goToDemoblaze();
    }

    @And("User clicks the Log in link in the navigation bar")
    public void clickLoginLink() {
        app.clickLoginLink();
    }

    @And("^User enters valid username (.*) and password (.*)$")
    public void enterCredentials(String userName, String password) {
        app.enterCredentials(userName, password);
    }

    @And("User clicks the login button")
    public void clickLoginButton() {
        app.clickLoginButton();
    }

    @Then("User should be logged in")
    public void userLoggedIn() {
        app.userLoggedIn();
    }

    @And("^User has logged in with valid username (.*) and password (.*)$")
    public void login(String userName, String password) {
        app.clickLoginLink();
        app.enterCredentials(userName, password);
        app.clickLoginButton();
        sleep(1000);
    }

    @And("User has navigated to a product page")
    public void navigateToProductPage() {
        app.navigateToProductPage();
    }

    @When("User clicks the Add to cart button")
    @And("User has clicked the Add to cart button")
    public void clickAddToCartButton() {
        app.clickAddtToCartButton();
    }

    @And("User clicks the cart link")
    @And("User has clicked the cart link")
    public void clickCartLink() {
        app.clickCartLink();
        sleep(1000);
    }

    @Then("The product should be added to the cart")
    public void productAddedToCart() {
        app.productAddedToCart();
    }

    @When("User clicks the Delete button")
    public void clickDeleteButton() {
        app.clickDeleteButton();
        sleep(1000);
    }

    @Then("The product should be deleted from the cart")
    public void productDeletedFromCart() {
        app.productDeletedFromCart();
    }

    @When("User clicks the Place Order button")
    public void clickPlaceOrderButton() {
        app.clickPlaceOrderButton();
        sleep(1000);
    }

    @And("^User enters (.*), (.*), (.*), (.*), (.*), (.*) in the name, country, city credit card, month, and year fields respectively$")
    public void enterInformation(String name, String country, String city, long creditCard, String month, int year) {
        app.enterInformation(name, country, city, creditCard, month, year);
    }

    @And("User clicks the Purchase button")
    public void clickPurchaseButton() {
        app.clickPurchsaeButton();
    }

    @Then("User should get a thank you message")
    public void getMessage() {
        app.getMessage();
    }

    @When("User clicks the log out link in the navigation bar")
    public void clickLogOutLink() {
        app.clickLogOutLink();
    }

    @Then("User should be logged out")
    public void userLoggedOut() {
        app.userLoggedOut();
    }

    @And("^User enters invalid username (.*) and wrong password (.*)$")
    public void enterInvalidCredentials(String userName, String password) {
        app.enterCredentials(userName, password);
    }

    @Then("User should not be logged in")
    public void userNotLoggedIn() {
        app.userNotLoggedIn();
    }
}
