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
        loginForm.clickOnLoginButton();
        sleep(1000);
    }

    @Feature("Logout")
    @Test(description = "I can logout {0}",
            testName = "Logout {0}",
            dataProvider = "correct_credentials", dataProviderClass = DataProviderCredentials.class)
    public void can_logout(UserForTest user) {
//        can_login_with_valid_credentials(user);
        String firstname = user.getFirstname();
        String middlename = user.getMiddlename();
        String lastname = user.getLastname();
        accountLink.verifyWelcomeMessageByText("WELCOME, " +
                                                    firstname + " " +
                                                    middlename + " " +
                                                    lastname + "!");
        accountLink.clickOnAccountLink();
        loginForm.clickOnLogoutLink();
    }

    @Feature("Missing credentials")
    @Test(description = "I can't login without credentials")
    public void cannot_login_without_required_credentials() {
        click_login_links();
        loginForm.verifyRequiredEmailMessage("This is a required field.");
        loginForm.verifyRequiredPassMessage("This is a required field.");
    }

    @Feature("Wrong password")
    @Test(description = "I can't login with wrong password")
    public void cannot_login_with_wrong_password() {
        click_login_links();
        loginForm.fillInEmailLoginForm("test1@yahoo.com");
        loginForm.fillInPasswordLoginForm("1af3bbdd");
        loginForm.clickOnLoginButton();
        loginForm.verifyInvalidPassOrEmailMessage("Invalid login or password.");
    }

    public void click_login_links() {
        loginForm.clickOnAccountLink();
        loginForm.clickOnLoginLink();
        loginForm.clickOnLoginButton();
    }

}
