package webshop;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FilterSidebar extends ScreenShooter{

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
    @Step("Filter price visibility")
    public void isFilterPriceVisible() {
        for (int i = 0; i< filterPrice.size(); i++) {
            takeScreenShot("Filter price should be visible");
            filterPrice.get(i).shouldBe(Condition.visible);
        }
    };

    @Step("Category visibility")
    public void isCategoryVisible() {
        for (int i = 0; i< shirtCategory.size(); i++) {
            takeScreenShot("Category should be visible");
            shirtCategory.get(i).shouldBe(Condition.visible);
        }
    };

    @Step("Subcategory visibility")
    public void isSubCategoryVisible() {
        for (int i = 0; i< shirtSubCategory.size(); i++) {
            takeScreenShot("Subcategory should be visible");
            shirtSubCategory.get(i).shouldBe(Condition.visible);
        }
    };

    @Step("Men menu visibility")
    public void isMenMenuVisible() {
        takeScreenShot("Men menu should be visible");
        viewMenMenu.shouldBe(Condition.visible);
    }

    @Step("Home deco menu visibility")
    public void isHomeDecoMenuVisible() {
        takeScreenShot("Home Deco should be visible");
        homeDecoMenu.shouldBe(Condition.visible);
    }

    @Step("Kitchen sub menu visibility")
    public void isKitchenSubMenuVisible() {
        takeScreenShot("Kitchen should be visible");
        kitchenSubMenu.shouldBe(Condition.visible);
    }

    /**
     * Actions
     */
    @Step("Home deco hover on menu")
    public void hoverOnHomeDecoMenuVisible() {
        takeScreenShot("Home deco can be hovered");
        homeDecoMenu.hover();
    }

    public void clickOnKitchenSubMenu() {
        kitchenSubMenu.click();
    }
    public void clickOnMenMenu() {
        viewMenMenu.click();
    }
    public void hoverOnMenMenu() {
        viewMenMenu.hover();
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
