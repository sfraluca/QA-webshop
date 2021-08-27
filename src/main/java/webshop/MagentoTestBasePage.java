package webshop;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MagentoTestBasePage extends SetupPage{
    public SelenideElement accountLink = $(".skip-link.skip-account");

    public MagentoTestBasePage() {
        openPage();
    }

    public void clickOnAccountLink() {
        accountLink.click();
    }

    @Step("Open Website")
    private void openPage() {
        open("http://testfasttrackit.info/magento-test/men.html");
        takeScreenShot("Open Website");
    }
}
