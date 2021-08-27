package webshop;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.Test;
import io.qameta.allure.junit4.DisplayName;

import static com.codeborne.selenide.Selenide.sleep;

@Epic("RegisterFormTests")
@Severity(SeverityLevel.CRITICAL)
@DisplayName("Register Homepage tests suit")
public class RegisterFormTests extends  MagentoTestBasePage {

    RegisterForm registerForm = new RegisterForm();
    MagentoTestBasePage accountLink = new MagentoTestBasePage();

    @DisplayName("I can register with valid credentials")
    @Feature("Register")
    @Test
    public void can_register_with_valid_credentials() {
        accountLink.clickOnAccountLink();
        registerForm.clickOnRegisterLink();
        registerForm.isFirstNameVisible();
        registerForm.fillInFirstNameRegisterForm("Test");
        registerForm.isMiddleNameVisible();
        registerForm.fillInMiddleNameRegisterForm("R");
        registerForm.isLastNameVisible();
        registerForm.fillInLastNameRegisterForm("Marina");
        registerForm.isEmailVisible();
        registerForm.fillInEmailRegisterForm("test1@yahoo.com");
        registerForm.isPasswordVisible();
        registerForm.fillInPasswordRegisterForm("1a2b3c4d");
        registerForm.isConfirmationPasswordVisible();
        registerForm.fillInConfirmationRegisterForm("1a2b3c4d");
        registerForm.isRegisterButtonVisible();
        registerForm.isRegisterButtonEnabled();
//        registerForm.clickOnRegisterButton();
        sleep(2500);
    }

}
