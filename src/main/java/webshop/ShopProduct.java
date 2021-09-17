package webshop;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ShopProduct extends ScreenShooter {

    public final SelenideElement menuMen = $(".nav-primary .level0.nav-2.parent a");
    public final SelenideElement menuMenShirts = $(".nav-primary .level0.nav-2.parent ul .level1.nav-2-2");
    public final SelenideElement plaidCottonShirt = $("h2.product-name a[title='Plaid Cotton Shirt']");
    public final SelenideElement addToCartProducts = $(".add-to-cart-buttons button[type=button]");
    public final SelenideElement colorBlackShirt = $("#configurable_swatch_color #swatch17");
    public final SelenideElement sizeXSProducts = $("#configurable_swatch_size #swatch81");
    public final SelenideElement addToWishlist = $(".add-to-links .link-wishlist");
    public final SelenideElement viewSaleMenu = $(".level0.nav-5");
    public final SelenideElement littleOnesMenu = $(".level0.nav-8");
    public final SelenideElement backToShoppingButton = $(".button2.btn-continue");
    public final SelenideElement cartButton = $(".header-minicart a");
    public final SelenideElement viewCart = $(".cart-link");
    public final SelenideElement quantityUpdate = $(".product-cart-actions .button.btn-update");
    public final SelenideElement cosplayMenu = $(".level0.nav-7");
    public final SelenideElement compareButton = $("button[title='Compare']");
    public final SelenideElement khakiColor = $("#swatch25");
    public final SelenideElement size34Men = $("#swatch61");
    public final SelenideElement quantityProductDetail = $(".qty-wrapper input#qty");
    public final SelenideElement addToCartMsg = $("li.success-msg span");
    public final SelenideElement descriptionReview = $(".input-box #review_field");
    public final SelenideElement summaryReview = $(".inline-label .input-box #summary_field");
    public final SelenideElement nicknameReview = $("#nickname_field");
    public final SelenideElement submitReview = $(".buttons-set .button");
    public final SelenideElement homeDecoMenu = $(".level0.nav-4");
    public final SelenideElement booksMusicMenu = $(".level1.nav-4-1");
    public final SelenideElement reviewTab = $(".toggle-tabs li.last");
    public final SelenideElement firstReviewTab = $(".tab-content .no-rating a");
    public final SelenideElement clickOnCloseCompare = $(".buttons-set button");

    public final ElementsCollection saleProductListOldPrice = $$(".products-grid .price-box p.old-price");
    public final ElementsCollection saleProducts = $$(".products-grid .price-box");
    public final ElementsCollection productsLittleOnes = $$(".item .btn-cart");
    public final ElementsCollection removeButtonCart = $$(".product-cart-remove a.btn-remove");
    public final ElementsCollection quantityInput = $$(".product-cart-actions .input-text.qty");
    public final ElementsCollection compareLinks = $$(".products-grid .link-compare");
    public final ElementsCollection menProducts = $$(".products-grid a[title='View Details']");
    public final ElementsCollection descriptionTab = $$(".toggle-tabs li");
    public final ElementsCollection ratingStarsPrice = $$("#product-review-table tr");
    public final ElementsCollection booksProducts = $$(".products-grid li h2 a");



    /**
     * Validators
     */
    @Step("Men menu visibility")
    public void isMenuMenVisible() {
        takeScreenShot("Men menu should be visible");
        menuMen.shouldBe(Condition.visible); }

    @Step("Menu Shirts visibility")
    public void isMenuMenShirtsVisible() {
        takeScreenShot("Menu Shirts should be visible");
        menuMenShirts.shouldBe(Condition.visible); }

    @Step("Plaid Cotton shirt visibility")
    public void isPlaidCottonShirtVisible() {
        takeScreenShot("Plaid Cotton shirt should be visible");
        plaidCottonShirt.shouldBe(Condition.visible); }

    @Step("Add to cart products visibility")
    public void isAddToCartProductsVisible() {
        takeScreenShot("Add to cart products should be visible");
        addToCartProducts.shouldBe(Condition.visible); }

    @Step("Color black visibility")
    public void isColorBlackVisible() {
        takeScreenShot("Color black should be visible");
        colorBlackShirt.shouldBe(Condition.visible); }

    @Step("Size visibility")
    public void isSizeXSVisible() {
        takeScreenShot("Size should be visible");
        sizeXSProducts.shouldBe(Condition.visible); }

    @Step("Add to wishlist visibility")
    public void isAddToWishlistVisible() {
        takeScreenShot("Add to wishlist should be visible");
        addToWishlist.shouldBe(Condition.visible); }

    @Step("Sale menu visibility")
    public void isSaleMenuVisible() {
        takeScreenShot("Sale menu should be visible");
        viewSaleMenu.shouldBe(Condition.visible);
    }

    @Step("Little ones menu visibility")
    public void isLittleOnesMenuVisible() {
        takeScreenShot("Little ones menu should be visible");
        littleOnesMenu.shouldBe(Condition.visible);
    }

    @Step("Back to shopping visibility")
    public void isBackToShoppingButtonVisible() {
        takeScreenShot("Back to shopping should be visible");
        backToShoppingButton.shouldBe(Condition.visible); }

    @Step("Mini cart button visibility")
    public void isMiniCartButtonVisible() {
        takeScreenShot("Mini cart button should be visible");
        cartButton.shouldBe(Condition.visible); }

    @Step("View Cart visibility")
    public void isViewCartVisible() {
        takeScreenShot("View Cart should be visible");
        viewCart.shouldBe(Condition.visible); }

    @Step("Quantity update visibility")
    public void isQuantityUpdateVisible() {
        takeScreenShot("Quantity update should be visible");
        quantityUpdate.shouldBe(Condition.visible); }
    public void isCosplayMenuVisible() { cosplayMenu.shouldBe(Condition.visible); }
    public void isCompareButtonVisible() { compareButton.shouldBe(Condition.visible); }

    @Step("Men Color visibility")
    public void isMenKhakiColorVisible() {
        takeScreenShot("Men Color should be visible");
        khakiColor.shouldBe(Condition.visible); }

    @Step("Men size visibility")
    public void isMen34SizeVisible() {
        takeScreenShot("Men size should be visible");
        size34Men.shouldBe(Condition.visible); }

    @Step("Quantity Detail Men visibility")
    public void isQtyDetailMenProductVisible() {
        takeScreenShot("Quantity Detail Men should be visible");
        quantityProductDetail.shouldBe(Condition.visible); }

    @Step("Success Msg add to cart visibility")
    public void isSuccessMsgAddToCartVisible() {
        takeScreenShot("Success Msg add to cart should be visible");
        addToCartMsg.shouldBe(Condition.visible); }

    @Step("Description review visibility")
    public void isDescriptionReviewVisible() {
        takeScreenShot("Description review should be visible");
        descriptionReview.shouldBe(visible);
    }

    @Step("Summary visibility")
    public void isSummaryReviewVisible() {
        takeScreenShot("Summary should be visible");
        summaryReview.shouldBe(visible);
    }

    @Step("Mick name visibility")
    public void isNicknameVisible() {
        takeScreenShot("Mick name should be visible");
        nicknameReview.shouldBe(visible);
    }

    @Step("Submit review visibility")
    public void isSubmitReviewVisible() {
        takeScreenShot("Submit should be visible");
        submitReview.shouldBe(visible); }

    @Step("Home Deco visibility")
    public void isHomeDecoMenuVisible() {
        takeScreenShot("Home Deco should be visible");
        homeDecoMenu.shouldBe(visible); }

    @Step("Books Music visibility")
    public void isBooksMusicVisible() {
        takeScreenShot("Books Music should be visible");
        booksMusicMenu.shouldBe(visible); }

    @Step("Review tab visibility")
    public void isReviewTabVisible() {
        takeScreenShot("Review tab should be visible");
        reviewTab.shouldBe(visible); }

    @Step("First review visibility")
    public void isFirstReviewTabVisible() {
        takeScreenShot("First review should be visible");
        firstReviewTab.shouldBe(visible); }
    public void isCloseCompareVisible() { clickOnCloseCompare.shouldBe(visible); }

    @Step("Old price visibility")
    public void isOldPriceVisible() {
        if (saleProductListOldPrice.size() < saleProducts.size()) {
            for (int i = 0; i< saleProducts.size(); i++) {
                takeScreenShot("Old price should be visible");
                saleProductListOldPrice.get(i).shouldBe(Condition.visible);
            }

        }
    }

    @Step("Product little ones visibility")
    public void isProductLittleOnesVisible() {
        for (int i = 0; i< productsLittleOnes.size(); i++) {
            takeScreenShot("Product little ones should be visible");
            productsLittleOnes.get(i).shouldBe(Condition.visible);
        }
    }

    @Step("Remove button visibility")
    public void isRemoveButtonCartVisible() {
        for (int i = 0; i< removeButtonCart.size(); i++) {
            takeScreenShot("Remove button should be visible");
            removeButtonCart.get(i).shouldBe(Condition.visible);
        }
    }

    @Step("Quantity input visibility")
    public void isQuantityInputVisible() {
        for (int i = 0; i< quantityInput.size(); i++) {
            takeScreenShot("Quantity input should be visible");
            quantityInput.get(i).shouldBe(Condition.visible);
        }
    }

    public void isCompareLinksVisible() {
        for (int i = 0; i< compareLinks.size(); i++) {
            takeScreenShot("Slider should be visible");
            compareLinks.get(i).shouldBe(Condition.visible);
        }
    }

    @Step("Men products visibility")
    public void isMenProductsVisible() {
        for (int i = 0; i< menProducts.size(); i++) {
            takeScreenShot("Men products should be visible");
            menProducts.get(i).shouldBe(Condition.visible);
        }
    }

    @Step("Product Tab visibility")
    public void isProductTabVisible() {
        for (int i = 0; i< descriptionTab.size(); i++) {
            takeScreenShot("Product Tab should be visible");
            descriptionTab.get(i).shouldBe(visible);
        }
    }

    @Step("Rating stars visibility")
    public void isRatingStarsVisible() {
        for (int i = 0; i< ratingStarsPrice.size(); i++) {
            takeScreenShot("Rating stars should be visible");
            ratingStarsPrice.get(i).shouldBe(visible);
        }
    }

    @Step("Book music visibility")
    public void isBooksMusicProductVisible() {
        for (int i = 0; i< booksProducts.size(); i++) {
            takeScreenShot("Book music should be visible");
            booksProducts.get(2).shouldBe(visible);
        }
    }

    /**
     * Actions
     */
    @Step("Hovering menu men")
    public void hoverOnMenuMen() {
        takeScreenShot("Hover menu men");
        menuMen.hover(); }

    public void clickOnMenuMenShirts() { menuMenShirts.click(); }
    public void clickPlaidCottonShirt() { plaidCottonShirt.click(); }
    public void clickOnAddToCart() { addToCartProducts.click(); }
    public void clickOnBlackColor() { colorBlackShirt.click(); }
    public void clickOnXSSize() { sizeXSProducts.click(); }
    public void clickOnWishList() { addToWishlist.click(); }
    public void clickOnSaleMenu() { viewSaleMenu.click(); }
    public void clickOnLittleOnes() { littleOnesMenu.click(); }
    public void clickOnBackToShoppingButton() { backToShoppingButton.click(); }
    public void clickOnButtonCart() { cartButton.click(); }
    public void clickOnViewCart() { viewCart.click(); }
    public void clickOnUpdateQuantity() {
        quantityUpdate.click();
    }
    public void clickOnCosplayMenu() {
        cosplayMenu.click();
    }
    public void clickOnCompareButton() {
        compareButton.click();
    }
    public void clickOnKhakiColorMen() {
        khakiColor.click();
    }
    public void clickOn34SizeMen() {
        size34Men.click();
    }
    public void clickOnSubmitReview() {
        submitReview.click();
    }
    public void clickOnReviewTab() { reviewTab.click(); }
    public void clickOnFirstReviewTab() { firstReviewTab.click(); }
    public void clickOnCloseCompare() { clickOnCloseCompare.click(); }

    public void fillInDescriptionReview(String description) {
        descriptionReview.sendKeys(description);
    }
    public void fillInSummaryReview(String summary) {
        summaryReview.sendKeys(summary);
    }
    public void fillInNicknameReview(String nickname) {
        nicknameReview.sendKeys(nickname);
    }

    public void verifyMsgSuccessAddToCart(String successMsg) {
        addToCartMsg.shouldHave(exactText(successMsg));
    }


    public void addToCartAllProductsLittleOnes() {
        for (int i = 1; i< productsLittleOnes.size(); i++) {
            productsLittleOnes.get(i).click();
            isBackToShoppingButtonVisible();
            clickOnBackToShoppingButton();
        }
    }

    public void removeAllItemsFromCart() {
        for (int i = 0; i< removeButtonCart.size(); i++) {
            removeButtonCart.get(i).click();
        }
    }

    public void fillInQuantity(String input) {
        for (int i = 0; i< quantityInput.size(); i++) {
            quantityInput.get(0).clear();
            quantityInput.get(0).sendKeys(input);
            quantityInput.get(0).click();
            return;
        }
    }

    public void clickOnCompareLinks() {
        for (int i = 0; i< compareLinks.size(); i++) {
            compareLinks.get(i).click();
        }
    }

    public void clickOnViewDetailsMenProductsLinks() {
        for (int i = 0; i< menProducts.size(); i++) {
            menProducts.get(1).click();
        }
    }

    public void updateQtyMenProduct(String input) {
        quantityProductDetail.clear();
        quantityProductDetail.click();
        quantityProductDetail.sendKeys(input);
    }

    public void clickOnTabInformation() {
        for (int i = 0; i< descriptionTab.size(); i++) {
            descriptionTab.get(i).click();
        }
    }

    public void selectRatingStarsPrice() {
        for (int i = 0; i< ratingStarsPrice.size(); i++) {
            ratingStarsPrice.get(i).click();
        }
    }

    public void hoverOnHomeDecoMenu() {
        homeDecoMenu.hover();
    }

    public void clickOnBooksMusicMenu() {
        booksMusicMenu.click();
    }

    public void clickOnBooksMusicProduct() {
        for (int i = 0; i< booksProducts.size(); i++) {
            booksProducts.get(2).click();
        }
    }




}
