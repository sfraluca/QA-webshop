package webshop;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class MenuItems {
    public final ElementsCollection menuFirstLevel = $$(".nav-primary li.level0");
    public final ElementsCollection menuSecondLevel = $$(".nav-primary li.level0 ul.level0 li.level1");

    /**
     * Validators
     */
    public void isMenuFirstLevelVisible() {
        for (int i = 0; i< menuFirstLevel.size(); i++) {
            menuFirstLevel.get(i).shouldBe(Condition.visible);
        }
    }

    public void isMenuSecondLevelVisible() {
        for (int i = 0; i< menuSecondLevel.size(); i++) {
            menuSecondLevel.get(i).shouldBe(Condition.visible);
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

    public void accessSecondMenu() {
        for (int i = 0; i<= menuFirstLevel.size(); i++) {
            int counter = i;
            menuFirstLevel.get(i).hover();
            for (int j = 0; j<= menuSecondLevel.size(); j++) {
                menuSecondLevel.get(j).click();
                menuFirstLevel.get(i).hover();
            }
        }

    }


}
