package webshop;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

@Epic("LoginFormTests")
@Severity(SeverityLevel.CRITICAL)
@DisplayName("Login Form Homepage tests suit")
public class LoginFormTests extends MagentoTestBasePage {
    LoginForm loginForm = new LoginForm();
    MagentoTestBasePage accountLink = new MagentoTestBasePage();

    @DisplayName("I can login with valid credentials")
    @Feature("Login")
    @Test
    public void can_login_with_valid_credentials() {
        accountLink.clickOnAccountLink();
        loginForm.clickOnLoginLink();
        loginForm.isEmailLoginVisible();
        loginForm.fillInEmailLoginForm("test1@yahoo.com");
        loginForm.isPasswordLoginVisible();
        loginForm.fillInPasswordLoginForm("1a2b3c4d");
    }

}
