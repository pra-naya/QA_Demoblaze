package PageObjects;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import java.util.List;
import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    public SelenideElement loginLink() {
        return $x("//a[@id='login2']");
    }

    public SelenideElement loginUserName() {
        return $x("//*[@id=\"loginusername\"]");
    }

    public SelenideElement loginPassword() {
        return $x("//*[@id=\"loginpassword\"]");
    }

    public SelenideElement loginButton() {
        return $x("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
    }

    public SelenideElement welcome() {
        return $x("//a[@id='nameofuser']");
    }

    public SelenideElement productLink() {
        return $x("//a[normalize-space()='Samsung galaxy s6']");
    }

    public SelenideElement addToCartButton() {
        return $x("//a[@class='btn btn-success btn-lg']");
    }

    public SelenideElement cartLink() {
        return $x("//a[normalize-space()='Cart']");
    }

    public SelenideElement logOutLink() {
        return $x("//a[@id='logout2']");
    }

}
