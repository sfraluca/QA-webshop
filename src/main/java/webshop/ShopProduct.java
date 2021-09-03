package webshop;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ShopProduct {
    public final SelenideElement menuMen = $(".nav-primary .level0.nav-2.parent a");
    public final SelenideElement menuMenShirts = $(".nav-primary .level0.nav-2.parent ul .level1.nav-2-2");
    public final SelenideElement plaidCottonShirt = $("h2.product-name a[title='Plaid Cotton Shirt']");
    public final SelenideElement addToCartProducts = $(".add-to-cart-buttons button[type=button]");
    public final SelenideElement colorBlackShirt = $("#configurable_swatch_color #swatch17");
    public final SelenideElement sizeXSProducts = $("#configurable_swatch_size #swatch81");
    public final SelenideElement addToWishlist = $(".add-to-links .link-wishlist");
    public final ElementsCollection shirtCategory = $$("dl#narrow-by-list dd.odd ol");
    public final ElementsCollection shirtSubCategory = $$("dl#narrow-by-list dd.odd ol li");
    public final SelenideElement viewMenMenu= $(".level0.nav-2");

    /**
     * Validators
     */
    public void isMenuMenVisible() { menuMen.shouldBe(Condition.visible); }

    public void isMenuMenShirtsVisible() { menuMenShirts.shouldBe(Condition.visible); }

    public void isPlaidCottonShirtVisible() { plaidCottonShirt.shouldBe(Condition.visible); }

    public void isAddToCartProductsVisible() { addToCartProducts.shouldBe(Condition.visible); }

    public void isColorBlackVisible() { colorBlackShirt.shouldBe(Condition.visible); }

    public void isSizeXSVisible() {sizeXSProducts.shouldBe(Condition.visible); }

    public void isAddToWishlistVisible() { addToWishlist.shouldBe(Condition.visible); }

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

    /**
     * Actions
     */
    public void hoverOnMenuMen() { menuMen.hover(); }

    public void clickOnMenuMenShirts() { menuMenShirts.click(); }

    public void clickPlaidCottonShirt() { plaidCottonShirt.click(); }

    public void clickOnAddToCart() { addToCartProducts.click(); }

    public void clickOnBlackColor() { colorBlackShirt.click(); }

    public void clickOnXSSize() { sizeXSProducts.click(); }

    public void clickOnWishList() { addToWishlist.click(); }

    public void clickOnBlazerInCategory() {
        for (int i = 0; i< shirtCategory.size(); i++) {
            for (int j = 0; j < shirtSubCategory.size(); j++) {
                shirtSubCategory.get(4).click();
                return;
            }
        }
    }

    public void clickOnMenMenu() {
        viewMenMenu.click();
    }

}
