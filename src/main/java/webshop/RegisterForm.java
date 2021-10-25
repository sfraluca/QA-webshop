package webshop;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class RegisterForm extends ScreenShooter {

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
    @Step("First name visibility")
    public void isFirstNameVisible() {
        takeScreenShot("First name should be visible");
        firstNameInputRegister.shouldBe(visible);
    }

    @Step("Middle name visibility")
    public void isMiddleNameVisible() {
        takeScreenShot("Middle name should be visible");
        middleNameInputRegister.shouldBe(visible);
    }

    @Step("Last name visibility")
    public void isLastNameVisible() {
        takeScreenShot("Last name should be visible");
        lastNameInputRegister.shouldBe(visible);
    }

    @Step("Email visibility")
    public void isEmailVisible() {
        takeScreenShot("Email should be visible");
        emailInputRegister.shouldBe(visible);
    }

    @Step("Password visibility")
    public void isPasswordVisible() {
        takeScreenShot("Password should be visible");
        emailInputRegister.shouldBe(visible);
    }

    @Step("Confirmation password visibility")
    public void isConfirmationPasswordVisible() {
        takeScreenShot("Confirmation passowrd should be visible");
        emailInputRegister.shouldBe(visible);
    }

    @Step("Register button visibility")
    public void isRegisterButtonVisible() {
        takeScreenShot("Register button should be visible");
        registerButton.shouldBe(visible);
    }

    @Step("Register button enabling")
    public void isRegisterButtonEnabled() {
        takeScreenShot("Register button should be enabled");
        registerButton.shouldBe(enabled);
    }


    /**
     * Actions
     */
    @Step("Filling first name")
    public void fillInFirstNameRegisterForm(String input) {
        takeScreenShot("First name can be filled in");
        firstNameInputRegister.sendKeys(input);
    }

    @Step("Filling middle name")
    public void fillInMiddleNameRegisterForm(String input) {
        takeScreenShot("Middle name can be filled");
        middleNameInputRegister.sendKeys(input);
    }

    @Step("Filling last name")
    public void fillInLastNameRegisterForm(String input) {
        takeScreenShot("Last name can be filled");
        lastNameInputRegister.sendKeys(input);
    }

    @Step("Filling email")
    public void fillInEmailRegisterForm(String input) {
        takeScreenShot("Email register can be filled");
        emailInputRegister.sendKeys(input);
    }

    @Step("Filling password")
    public void fillInPasswordRegisterForm(String input) {
        takeScreenShot("Password can be filled");
        passwordInputRegister.sendKeys(input);
    }

    @Step("Filling confirmation")
    public void fillInConfirmationRegisterForm(String input) {
        takeScreenShot("Confirmation password can be filled");
        confirmPasswordInputRegister.sendKeys(input);
    }

    public void clickOnRegisterButton() {
        registerButton.click();
    }

    public void clickOnRegisterLink() {
        registerLink.click();
    }
}
