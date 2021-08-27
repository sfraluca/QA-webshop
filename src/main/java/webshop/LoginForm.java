package webshop;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginForm extends ScreenShooter {
    public SelenideElement loginLink = $("a[title='Log In']");
    public SelenideElement emailInputLogin = $("input#email");
    public SelenideElement passwordInputLogin = $("input#pass");
    public SelenideElement accountLink = $(".skip-link.skip-account");


    /**
     * Validators
     */
    public void isEmailLoginVisible() {emailInputLogin.shouldBe(Condition.visible);}

    public void isPasswordLoginVisible() {passwordInputLogin.shouldBe(Condition.visible);}

    /**
     * Actions
     */
    public void fillInEmailLoginForm(String input) { emailInputLogin.sendKeys(input);}

    public void fillInPasswordLoginForm(String input) { passwordInputLogin.sendKeys(input);}

    public void clickOnLoginLink() {
        loginLink.click();
    }

    public void clickOnAccountLink() {
        accountLink.click();
    }

}
