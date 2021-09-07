package webshop;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FilterSidebar {

    public final SelenideElement homeDecoMenu = $(".level0.nav-4");
    public final SelenideElement kitchenSubMenu = $(".level1.nav-4-5");
    public final SelenideElement viewMenMenu = $(".level0.nav-2");

    public final ElementsCollection filterPrice = $$("#narrow-by-list li a");
    public final ElementsCollection productPrice = $$(".product-info .price-box");
    public final ElementsCollection shirtCategory = $$("dl#narrow-by-list dd.odd ol");
    public final ElementsCollection shirtSubCategory = $$("dl#narrow-by-list dd.odd ol li");

    /**
     * Validators
     */
    public void isFilterPriceVisible() {
        for (int i = 0; i< filterPrice.size(); i++) {
            filterPrice.get(i).shouldBe(Condition.visible);
        }
    };

    public void isCategoryVisible() {
        for (int i = 0; i< shirtCategory.size(); i++) {
            shirtCategory.get(i).shouldBe(Condition.visible);
        }
    };

    public void isSubCategoryVisible() {
        for (int i = 0; i< shirtSubCategory.size(); i++) {
            shirtSubCategory.get(i).shouldBe(Condition.visible);
        }
    };

    public void isMenMenuVisible() {
        viewMenMenu.shouldBe(Condition.visible);
    }
    public void isHomeDecoMenuVisible() {
        homeDecoMenu.shouldBe(Condition.visible);
    }
    public void isKitchenSubMenuVisible() {
            kitchenSubMenu.shouldBe(Condition.visible);
    }

    /**
     * Actions
     */
    public void hoverOnHomeDecoMenuVisible() {
        homeDecoMenu.hover();
    }

    public void clickOnKitchenSubMenu() {
        kitchenSubMenu.click();
    }
    public void clickOnMenMenu() {
        viewMenMenu.click();
    }

    public void clickOnPriceFilter() {
        for (int i = 0; i< filterPrice.size(); i++) {
            filterPrice.get(i).click();
        }
    }

    public void clickOnBlazerInCategory() {
        for (int i = 0; i< shirtCategory.size(); i++) {
            for (int j = 0; j < shirtSubCategory.size(); j++) {
                shirtSubCategory.get(4).click();
                return;
            }
        }
    }

}
