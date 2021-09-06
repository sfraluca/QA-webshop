package webshop;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FilterSidebar {

    public final ElementsCollection filterPrice = $$("#narrow-by-list li a");
    public final ElementsCollection productPrice = $$(".product-info .price-box");
    public final SelenideElement homeDecoMenu = $(".level0.nav-4");
    public final SelenideElement kitchenSubMenu = $(".level1.nav-4-5");
    /**
     * Validators
     */
    public void isFilterPriceVisible() {
        for (int i = 0; i< filterPrice.size(); i++) {
            filterPrice.get(i).shouldBe(Condition.visible);
        }
    };

    public void isProductPriceVisible() {
        for (int i = 0; i< productPrice.size(); i++) {
            productPrice.get(i).shouldBe(Condition.visible);
        }
    };

    public void isHomeDecoMenuVisible() {
        homeDecoMenu.shouldBe(Condition.visible);
    }

    public void isKitchenSubMenuVisible() {
            kitchenSubMenu.shouldBe(Condition.visible);
    }

    /**
     * Actions
     */
    public void clickOnPriceFilter() {
        for (int i = 0; i< filterPrice.size(); i++) {
            filterPrice.get(i).click();
        }
    }

    public void hoverOnHomeDecoMenuVisible() {
        homeDecoMenu.hover();
    }

    public void clickOnKitchenSubMenu() {
        kitchenSubMenu.click();
    }





}
