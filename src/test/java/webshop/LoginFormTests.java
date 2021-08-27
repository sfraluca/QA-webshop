package webshop;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

@Epic("LoginFormTests")
@Severity(SeverityLevel.CRITICAL)
@Test(description = "Login Form Homepage tests suit")
public class LoginFormTests extends MagentoTestBasePage {
    LoginForm loginForm = new LoginForm();
    MagentoTestBasePage accountLink = new MagentoTestBasePage();

    @Feature("Login")
    @Test(description = "I can login with valid credentials")
    public void can_login_with_valid_credentials() {
        accountLink.clickOnAccountLink();
        loginForm.clickOnLoginLink();
        loginForm.isEmailLoginVisible();
        loginForm.fillInEmailLoginForm("test1@yahoo.com");
        loginForm.isPasswordLoginVisible();
        loginForm.fillInPasswordLoginForm("1a2b3c4d");
        sleep(1000);
    }

}
