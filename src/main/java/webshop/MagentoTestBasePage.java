package webshop;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import webshop.SetupPage;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MagentoTestBasePage extends SetupPage{
    public DemoShopBasePage() {
        openPage();
    }
    
//    @Step("Open Page")
//    private void openPage() {
//        open("https://fasttrackit-test.netlify.app/#/");
//        takeScreenShot("Open Page");
//    }
//
//    /**
//     * Verifiers
//     */
//    @Step("Verify welcome message text is: {0}")
//    @Attachment(value = "verifyWelcomeMessageByText", type = "image/png")
//    public void verifyWelcomeMessageByText(String welcomeText) {
//        SelenideElement welcomeMessage = $(".navbar-text span span");
//        welcomeMessage.shouldHave(exactText(welcomeText));
//        takeScreenShot();
//    }
//
//    /**
//     * Actions
//     */
//    @Step("Open Login Modal")
//    public void openLoginModal() {
//        SelenideElement loginModalButton = $(".sticky-top .btn");
//        loginModalButton.click();
//        takeScreenShot("Open Login Modal");
//    }
}
