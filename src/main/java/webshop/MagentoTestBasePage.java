package webshop;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MagentoTestBasePage extends ScreenShooter {
    public final SelenideElement accountLink = $(".skip-link.skip-account");
    private final SelenideElement welcomeMessage = $(".welcome-msg");
    private final SelenideElement pageNotFoundMessage = $("div.std p strong");

    public MagentoTestBasePage() {
        openPage();
    }

    public void clickOnAccountLink() {
        accountLink.click();
    }

    @Step("Open Website")
    private void openPage() {
        open("http://testfasttrackit.info/magento-test/");
        takeScreenShot("Open Website");
    }

    @Step("Verify welcome message text is: {0}")
    public void verifyWelcomeMessageByText(String welcomeText) {
        takeScreenShot("Verify welcome message text is " + welcomeText);
        welcomeMessage.shouldHave(exactText(welcomeText));
        takeScreenShot("Verify welcome message text");
    }

    @Step("Verify page not found message text is: {0}")
    public void verifyPageNotFoundMessageByText(String pageNotFoundText) {
        takeScreenShot("Verify page not found message text is " + pageNotFoundText);
        pageNotFoundMessage.shouldHave(exactText(pageNotFoundText));
        takeScreenShot("Page Not Found");
    }
}
