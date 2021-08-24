package webshop;
import io.qameta.allure.Feature;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
public class LoginFormTests {
    LoginForm loginForm = new LoginForm();

    @DisplayName("I can login with valid credentials")
    @Feature("Login")
    @Test
    public void can_login_with_valid_credentials() {
//        openLoginModal();
//        loginForm.isUserNameVisible();
//        loginForm.fillInUsername("dino");
//        loginForm.isPasswordVisible();
//        loginForm.fillInPassword("choochoo");
//        loginForm.isLoginButtonVisible();
//        loginForm.isLoginButtonEnabled();
//        loginForm.clickOnLoginButton();
//        verifyWelcomeMessageByText("Hi dino!");
//        sleep(2500);
    }

    @DisplayName("I receive an error message when logging in with wrong credentials")
    @Feature("Login")
    @Test
    public void wrong_credentials_throws_error_message() {
//        openLoginModal();
//        loginModal.fillInUsername("wrongUser");
//        loginModal.fillInPassword("wrongPassword");
//        loginModal.clickOnLoginButton();
//        loginModal.wrongUsernameOrPassword();
    }
}
