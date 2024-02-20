package PageObjects;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import java.util.List;
import static com.codeborne.selenide.Selenide.*;

public class CartPage {

    public SelenideElement productName() {
        return $x("//td[normalize-space()='Samsung galaxy s6']");
    }

    public SelenideElement deleteButton() {
        return $x("//a[normalize-space()='Delete']");
    }

    public SelenideElement placeOrderButton() {
        return $x("//button[normalize-space()='Place Order']");
    }

    public SelenideElement enterName() {
        return $x("//*[@id=\"name\"]");
    }

    public SelenideElement enterCountry() {
        return $x("//*[@id=\"country\"]");
    }

    public SelenideElement enterCity() {
        return $x("//*[@id=\"city\"]");
    }

    public SelenideElement enterCreditCard() {
        return $x("//*[@id=\"card\"]");
    }

    public SelenideElement enterMonth() {
        return $x("//*[@id=\"month\"]");
    }

    public SelenideElement enterYear() {
        return $x("//*[@id=\"year\"]");
    }

    public SelenideElement purchaseButton() {
        return $x("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");
    }

    public SelenideElement message() {
        return $x("/html/body/div[10]/h2");
    }






}
