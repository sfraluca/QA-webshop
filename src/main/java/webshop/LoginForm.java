package webshop;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;

public class LoginForm extends ScreenShooter {
    public SelenideElement loginLink = $("a[title='Log In']");
    public SelenideElement emailInputLogin = $("input#email");
    public SelenideElement passwordInputLogin = $("input#pass");
    public SelenideElement accountLink = $(".skip-link.skip-account");
    public SelenideElement logoutLink = $("li.last a[title='Log Out']");
    public SelenideElement loginButton = $(".account-login button#send2.button");
    public SelenideElement verificationEmailLogin = $("#advice-required-entry-email");
    public SelenideElement verificationPassLogin = $("#advice-required-entry-pass");
    public SelenideElement invalidPasswordOrEmail = $(".error-msg span");

    /**
     * Validators
     */
    public void isEmailLoginVisible() { emailInputLogin.shouldBe(Condition.visible); }

    public void isPasswordLoginVisible() { passwordInputLogin.shouldBe(Condition.visible); }

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

    public void clickOnLogoutLink() { logoutLink.click(); }

    public void clickOnLoginButton() { loginButton.click(); }

    public void verifyRequiredEmailMessage(String emailRequired) { verificationEmailLogin.shouldHave(exactText(emailRequired)); }

    public void verifyRequiredPassMessage(String passRequired) { verificationPassLogin.shouldHave(exactText(passRequired)); }

    public void verifyInvalidPassOrEmailMessage(String invalidPassOrEmail) { invalidPasswordOrEmail.shouldHave(exactText(invalidPassOrEmail)); }


}
