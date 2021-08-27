package webshop;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import webshop.dataprovider.DataProviderCredentials;
import webshop.dataprovider.UserForTest;

import static com.codeborne.selenide.Selenide.sleep;

@Epic("LoginFormTests")
@Severity(SeverityLevel.CRITICAL)
@Test(description = "Login Form Homepage tests suit")
public class LoginFormTests extends MagentoTestBasePage {
    LoginForm loginForm = new LoginForm();
    MagentoTestBasePage accountLink = new MagentoTestBasePage();

    @Feature("Login")
    @Test(description = "I can login with valid credentials {0}",
            testName = "Login with valid Credentials for: {0}",
            dataProvider = "correct_credentials", dataProviderClass = DataProviderCredentials.class)
    public void can_login_with_valid_credentials(UserForTest user) {
        String email = user.getEmail();
        String password = user.getPassWord();
        accountLink.clickOnAccountLink();
        LoginForm loginForm = new LoginForm();
        loginForm.clickOnLoginLink();
        loginForm.isEmailLoginVisible();
        loginForm.fillInEmailLoginForm(email);
        loginForm.isPasswordLoginVisible();
        loginForm.fillInPasswordLoginForm(password);
        sleep(1000);
    }

}
