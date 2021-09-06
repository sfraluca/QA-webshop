package webshop;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
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
    public final SelenideElement viewMenMenu = $(".level0.nav-2");
    public final ElementsCollection saleProductListOldPrice = $$(".products-grid .price-box p.old-price");
    public final SelenideElement viewSaleMenu = $(".level0.nav-5");
    public final ElementsCollection saleProducts = $$(".products-grid .price-box");
    public final SelenideElement littleOnesMenu = $(".level0.nav-8");
    public final ElementsCollection productsLittleOnes = $$(".item .btn-cart");
    public final SelenideElement backToShoppingButton = $(".button2.btn-continue");
    public final ElementsCollection removeButtonCart = $$(".product-cart-remove a.btn-remove");
    public final SelenideElement cartButton = $(".header-minicart a");
    public final SelenideElement viewCart = $(".cart-link");
    public final ElementsCollection quantityInput = $$(".product-cart-actions .input-text.qty");
    public final SelenideElement quantityUpdate = $(".product-cart-actions .button.btn-update");
//    public final SelenideElement compareLinkSakuraDress = $(".product-name a[title='Sakura blossom flower dress , inspirat from anime '] .link-compare");
    public final ElementsCollection compareLinks = $$(".products-grid .link-compare");
    public final SelenideElement cosplayMenu = $(".level0.nav-7");
    public final SelenideElement compareButton = $("button[title='Compare']");
    public final ElementsCollection menProducts = $$(".products-grid a[title='View Details']");
    public final SelenideElement khakiColor = $("#swatch25");
    public final SelenideElement size34Men = $("#swatch61");
    public final SelenideElement quantityProductDetail = $(".qty-wrapper input#qty");
    public final SelenideElement addToCartMsg = $("li.success-msg span");
    public final ElementsCollection descriptionTab = $$(".toggle-tabs li");
    public final SelenideElement booksMenu = $(".level0.nav-6");
    public final SelenideElement bookTitle = $("h2.product-name");
    public final ElementsCollection addReviewBooks = $$(".rating-links a");
    public final ElementsCollection ratingStarsPrice = $$("#product-review-table tr");
    public final SelenideElement descriptionReview = $(".input-box #review_field");
    public final SelenideElement summaryReview = $(".inline-label .input-box #summary_field");
    public final SelenideElement nicknameReview = $("#nickname_field");
    public final SelenideElement submitReview= $(".buttons-set .button");

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

    public void isOldPriceVisible() {
        if (saleProductListOldPrice.size() < saleProducts.size()) {
            for (int i = 0; i< saleProducts.size(); i++) {
                saleProductListOldPrice.get(i).shouldBe(Condition.visible);
            }

        }
    }

    public void isSaleMenuVisible() {
        viewSaleMenu.shouldBe(Condition.visible);
    }

    public void isLittleOnesMenuVisible() {
        littleOnesMenu.shouldBe(Condition.visible);
    }
    public void isProductLittleOnesVisible() {
        for (int i = 0; i< productsLittleOnes.size(); i++) {
            productsLittleOnes.get(i).shouldBe(Condition.visible);
        }
    }

    public void isBackToShoppingButtonVisible() { backToShoppingButton.shouldBe(Condition.visible); }

    public void isRemoveButtonCartVisible() {
        for (int i = 0; i< removeButtonCart.size(); i++) {
            removeButtonCart.get(i).shouldBe(Condition.visible);
        }
    }

    public void isMiniCartButtonVisible() { cartButton.shouldBe(Condition.visible); }

    public void isViewCartVisible() { viewCart.shouldBe(Condition.visible); }

    public void isQuantityInputVisible() {
        for (int i = 0; i< quantityInput.size(); i++) {
            quantityInput.get(i).shouldBe(Condition.visible);
        }
    }

    public void isQuantityUpdateVisible() { quantityUpdate.shouldBe(Condition.visible); }

//    public void isCompareLinkSakuraDressVisible() { compareLinkSakuraDress.shouldBe(Condition.visible); }
    public void isCompareLinksVisible() {
        for (int i = 0; i< compareLinks.size(); i++) {
            compareLinks.get(i).shouldBe(Condition.visible);
        }
    }
    public void isCosplayMenuVisible() { cosplayMenu.shouldBe(Condition.visible); }
    public void isCompareButtonVisible() { compareButton.shouldBe(Condition.visible); }

    public void isMenProductsVisible() {
        for (int i = 0; i< menProducts.size(); i++) {
            menProducts.get(i).shouldBe(Condition.visible);
        }
    }

    public void isMenKhakiColorVisible() { khakiColor.shouldBe(Condition.visible); }
    public void isMen34SizeVisible() { size34Men.shouldBe(Condition.visible); }
    public void isQtyDetailMenProductVisible() { quantityProductDetail.shouldBe(Condition.visible); }
    public void isSuccessMsgAddToCartVisible() { addToCartMsg.shouldBe(Condition.visible); }
    public void isProductTabVisible() {
        for (int i = 0; i< descriptionTab.size(); i++) {
            descriptionTab.get(i).click();
        }
    }
    public void isBooksMenuVisible() { booksMenu.shouldBe(visible); }
    public void isBookTitleVisible() { bookTitle.shouldBe(visible); }
    public void isAddReviewBookVisible() {
        for (int i = 0; i< addReviewBooks.size(); i++) {
            addReviewBooks.get(i).click();
        }
    }

    public void isRatingStarsVisible() {
        for (int i = 0; i< ratingStarsPrice.size(); i++) {
            ratingStarsPrice.get(i).click();
        }
    }
    public void isDescriptionReviewVisible() {
        descriptionReview.shouldBe(visible);
    }

    public void isSummaryReviewVisible() {
        summaryReview.shouldBe(visible);
    }

    public void isNicknameVisible() {
        nicknameReview.shouldBe(visible);
    }

    public void isSubmitReview() { submitReview.shouldBe(visible); }


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

    public void clickOnSaleMenu() { viewSaleMenu.click(); }

    public void clickOnLittleOnes() { littleOnesMenu.click(); }

    public void addToCartAllProductsLittleOnes() {
        for (int i = 1; i< productsLittleOnes.size(); i++) {
            productsLittleOnes.get(i).click();
            isBackToShoppingButtonVisible();
            clickOnBackToShoppingButton();
        }
    }
    public void clickOnBackToShoppingButton() { backToShoppingButton.click(); }

    public void removeAllItemsFromCart() {
        for (int i = 0; i< removeButtonCart.size(); i++) {
            removeButtonCart.get(i).click();
        }
    }
    public void clickOnButtonCart() { cartButton.click(); }

    public void clickOnViewCart() { viewCart.click(); }

    public void fillInQuantity(String input) {
        for (int i = 0; i< quantityInput.size(); i++) {
            quantityInput.get(0).clear();
            quantityInput.get(0).sendKeys(input);
            quantityInput.get(0).click();
            return;
        }
    }

    public void clickOnUpdateQuantity() {
        quantityUpdate.click();
    }

    public void clickOnCompareLinks() {
        for (int i = 0; i< compareLinks.size(); i++) {
            compareLinks.get(i).click();
        }
    }

    public void clickOnCosplayMenu() {
        cosplayMenu.click();
    }

    public void clickOnCompareButton() {
        compareButton.click();
    }

    public void clickOnViewDetailsMenProductsLinks() {
        for (int i = 0; i< menProducts.size(); i++) {
            menProducts.get(1).click();
        }
    }

    public void clickOnKhakiColorMen() {
        khakiColor.click();
    }

    public void  clickOn34SizeMen() {
        size34Men.click();
    }

    public void updateQtyMenProduct(String input) {
        quantityProductDetail.clear();
        quantityProductDetail.click();
        quantityProductDetail.sendKeys(input);
    }

    public void verifyMsgSuccessAddToCart(String successMsg) {
        addToCartMsg.shouldHave(exactText(successMsg));
    }

    public void clickOnTabInformation() {
        for (int i = 0; i< descriptionTab.size(); i++) {
            descriptionTab.get(i).click();
        }
    }

    public void clickOnBooksMenu() {
        booksMenu.click();
    }

    public void clickOnBookTitle() {
        bookTitle.click();
    }

    public void clickOnAddReviewBook() {
        for (int i = 0; i< addReviewBooks.size(); i++) {
            addReviewBooks.get(1).click();
        }
    }
    public void selectRatingStarsPrice() {
        for (int i = 0; i< ratingStarsPrice.size(); i++) {
            ratingStarsPrice.get(2).click();
        }
    }

    public void fillInDescriptionReview(String description) {
        descriptionReview.sendKeys(description);
    }

    public void fillInSummaryReview(String summary) {
        summaryReview.sendKeys(summary);
    }

    public void fillInNicknameReview(String nickname) {
        nicknameReview.sendKeys(nickname);
    }

    public void clickOnSubmitReview() {
        submitReview.click();
    }


}
