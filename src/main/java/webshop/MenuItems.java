package webshop;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$$;

public class MenuItems extends ScreenShooter {
    public final ElementsCollection menuFirstLevel = $$(".nav-primary li.level0");

    /**
     * Validators
     */
    @Step("Menu first level visibility")
    public void isMenuFirstLevelVisible() {
        for (int i = 0; i< menuFirstLevel.size(); i++) {
            takeScreenShot("Menu first level should be visible");
            menuFirstLevel.get(i).shouldBe(Condition.visible);
        }
    }

    /**
     * Actions
     */
    public void clickOnMenuFirstLevel() {
        for (int i = 0; i < menuFirstLevel.size(); i++) {
            menuFirstLevel.get(i).click();
        }
    }
}
