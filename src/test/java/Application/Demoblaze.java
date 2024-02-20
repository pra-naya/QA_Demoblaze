package Application;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.conditions.localstorage.Item;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import java.time.Duration;
import PageObjects.HomePage;
import PageObjects.CartPage;

public class Demoblaze {

    public HomePage homePage;
    public CartPage cartPage;

    public static WebDriver driver;
    // Method to open the browser and initialize components
    public void openBrowser() {
//        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        // Initializing ChromeOptions
        ChromeOptions chromeOptions = new ChromeOptions();
        // Creating a ChromeDriver instance with the provided options
        driver = new ChromeDriver(chromeOptions);
        // Setting implicit wait for 10 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Maximizing the browser window

        driver.manage().window().maximize();
        // Navigating to a specific URL
        driver.navigate().to("https://www.demoblaze.com/");
        // Setting the WebDriver instance for use in Selenium Selenide
        WebDriverRunner.setWebDriver(driver);

        // Initializing instances of different page objects/components
        homePage = new HomePage();
        cartPage = new CartPage();

    }

    public void goToDemoblaze() {
        System.out.println("Website opened!");
    }

    public void clickLoginLink() {
        homePage.loginLink().click();
    }

    public void enterCredentials(String userName, String password) {
        homePage.loginUserName().should(Condition.appear, Duration.ofSeconds(5)).sendKeys(userName);
        homePage.loginPassword().sendKeys(password);
    }

    public void clickLoginButton() {
        homePage.loginButton().click();
    }

    public void userLoggedIn() {
        Assert.assertEquals(homePage.welcome().should(Condition.appear, Duration.ofSeconds(5)).getText(), "Welcome uzah123");
    }


    public void navigateToProductPage() {
        homePage.productLink().click();
    }

    public void clickAddtToCartButton() {
        homePage.addToCartButton().click();
    }

    public void productAddedToCart() {
        Assert.assertEquals(cartPage.productName().should(Condition.appear, Duration.ofSeconds(5)).getText(), "Samsung galaxy s6");
    }
    public void clickCartLink() {
        homePage.cartLink().click();
    }

    public void clickDeleteButton() {
        cartPage.deleteButton().click();
    }

    public void productDeletedFromCart() {
        Assert.assertFalse(cartPage.productName().exists());
    }

    public void clickPlaceOrderButton() {
        cartPage.placeOrderButton().click();
    }

    public void enterInformation(String name, String country, String city, long creditCard, String month, int year) {
        cartPage.enterName().should(Condition.appear, Duration.ofSeconds(5)).sendKeys(name);
        cartPage.enterCity().sendKeys(city);
        cartPage.enterCountry().sendKeys(country);
        cartPage.enterMonth().sendKeys(month);
        cartPage.enterCreditCard().sendKeys(String.valueOf(creditCard));
        cartPage.enterYear().sendKeys(String.valueOf(year));
    }

    public void clickPurchsaeButton() {
        cartPage.purchaseButton().click();
    }

    public void getMessage() {
        Assert.assertEquals(cartPage.message().should(Condition.appear, Duration.ofSeconds(5)).getText(), "Thank you for your purchase!");
    }

    public void clickLogOutLink() {
        homePage.logOutLink().click();
    }

    public void userLoggedOut() {
//        Assert.assertFalse(homePage.logOutLink().exists());
        Assert.assertEquals(homePage.loginLink().should(Condition.appear, Duration.ofSeconds(5)).getText(), "Log in");

    }

    public void userNotLoggedIn() {
        Assert.assertEquals(homePage.loginButton().should(Condition.appear, Duration.ofSeconds(5)).getText(), "Log in");
    }
}
