package webshop;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class RegisterForm {

    public SelenideElement registerLink = $("a[title=Register]");
    public SelenideElement firstNameInputRegister = $("input#firstname.input-text");
    public SelenideElement middleNameInputRegister = $("input#middlename.input-text");
    public SelenideElement lastNameInputRegister = $("input#lastname.input-text");
    public SelenideElement emailInputRegister = $("input#email_address.input-text");
    public SelenideElement passwordInputRegister = $("input#password.input-text");
    public SelenideElement confirmPasswordInputRegister = $("input#confirmation.input-text");
    public SelenideElement registerButton = $(".buttons-set button[type=submit].button");

    /**
     * Validators
     */
    public void isFirstNameVisible() {
        firstNameInputRegister.shouldBe(visible);
    }

    public void isMiddleNameVisible() {
        middleNameInputRegister.shouldBe(visible);
    }

    public void isLastNameVisible() {
        lastNameInputRegister.shouldBe(visible);
    }

    public void isEmailVisible() {
        emailInputRegister.shouldBe(visible);
    }

    public void isPasswordVisible() {
        emailInputRegister.shouldBe(visible);
    }

    public void isConfirmationPasswordVisible() {
        emailInputRegister.shouldBe(visible);
    }

    public void isRegisterButtonVisible() {
        registerButton.shouldBe(visible);
    }

    public void isRegisterButtonEnabled() {
        registerButton.shouldBe(enabled);
    }


    /**
     * Actions
     */

    public void fillInFirstNameRegisterForm(String input) {
        firstNameInputRegister.sendKeys(input);
    }

    public void fillInMiddleNameRegisterForm(String input) {
        middleNameInputRegister.sendKeys(input);
    }

    public void fillInLastNameRegisterForm(String input) {
        lastNameInputRegister.sendKeys(input);
    }

    public void fillInEmailRegisterForm(String input) {
        emailInputRegister.sendKeys(input);
    }

    public void fillInPasswordRegisterForm(String input) {
        passwordInputRegister.sendKeys(input);
    }

    public void fillInConfirmationRegisterForm(String input) {
        confirmPasswordInputRegister.sendKeys(input);
    }

    public void clickOnRegisterButton() {
        registerButton.click();
    }

    public void clickOnRegisterLink() {
        registerLink.click();
    }
}
