package webshop;

import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import webshop.dataprovider.DataProviderRegisterCredentials;
import webshop.dataprovider.RegisterUsersForTest;

import static com.codeborne.selenide.Selenide.sleep;

@Epic("RegisterFormTests")
@Severity(SeverityLevel.CRITICAL)
@Test(description = "Register Homepage tests suit")
public class RegisterFormTests  extends MagentoTestBasePage{

    RegisterForm registerForm = new RegisterForm();

    @Test(description = "I can register {0}",
            testName = "Register {0}",
            dataProvider = "correct_credentials", dataProviderClass = DataProviderRegisterCredentials.class)
    public void can_register_with_valid_credentials(RegisterUsersForTest registerUser) {
        String firstname = registerUser.getFirstname();
        String middlename = registerUser.getMiddlename();
        String lastname = registerUser.getLastname();
        String email = registerUser.getEmail();
        String password = registerUser.getPassWord();
        String confirmPassword = registerUser.getConfirmPass();
        MagentoTestBasePage accountLink = new MagentoTestBasePage();
        accountLink.clickOnAccountLink();
        registerForm.clickOnRegisterLink();
        registerForm.isFirstNameVisible();
        registerForm.fillInFirstNameRegisterForm(firstname);
        registerForm.isMiddleNameVisible();
        registerForm.fillInMiddleNameRegisterForm(middlename);
        registerForm.isLastNameVisible();
        registerForm.fillInLastNameRegisterForm(lastname);
        registerForm.isEmailVisible();
        registerForm.fillInEmailRegisterForm(email);
        registerForm.isPasswordVisible();
        registerForm.fillInPasswordRegisterForm(password);
        registerForm.isConfirmationPasswordVisible();
        registerForm.fillInConfirmationRegisterForm(confirmPassword);
        registerForm.isRegisterButtonVisible();
        registerForm.isRegisterButtonEnabled();
//        registerForm.clickOnRegisterButton();
        sleep(2500);
    }

}
