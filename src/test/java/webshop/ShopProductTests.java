package webshop;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

@Epic("ShopProducts")
@Severity(SeverityLevel.CRITICAL)
@Test(description = "ShopProduct tests suit")
public class ShopProductTests extends MagentoTestBasePage {

    ShopProduct shopProduct = new ShopProduct();
    LoginForm loginForm = new LoginForm();
    MagentoTestBasePage accountLink = new MagentoTestBasePage();

    @Feature("Shop by men cloths")
    @Test(description = "I can add to cart shirts")
    public void can_add_to_cart_shirts_men() {
        shopProduct.isMenuMenVisible();
        shopProduct.hoverOnMenuMen();
        shopProduct.isMenuMenShirtsVisible();
        shopProduct.clickOnMenuMenShirts();
        shopProduct.isPlaidCottonShirtVisible();
        shopProduct.clickPlaidCottonShirt();
        shopProduct.isColorBlackVisible();
        shopProduct.clickOnBlackColor();
        shopProduct.isSizeXSVisible();
        shopProduct.clickOnXSSize();
        shopProduct.isAddToCartProductsVisible();
        shopProduct.clickOnAddToCart();
    }

    @Feature("Filter blazers")
    @Test(description = "I can filter blazers from category")
    public void can_filter_by_blazers() {
        shopProduct.isMenMenuVisible();
        shopProduct.clickOnMenMenu();
        shopProduct.isCategoryVisible();
        shopProduct.isSubCategoryVisible();
        shopProduct.clickOnBlazerInCategory();
    }

    @Feature("Add To wishlist men cloths")
    @Test(description = "I can add to wishlist")
    public void can_add_to_wishlist_men_cloths() {
        accountLink.clickOnAccountLink();
        loginForm.clickOnLoginLink();
        loginForm.isEmailLoginVisible();
        loginForm.fillInEmailLoginForm("test1@yahoo.com");
        loginForm.isPasswordLoginVisible();
        loginForm.fillInPasswordLoginForm("1a2b3c4d");
        loginForm.clickOnLoginButton();
        sleep(2500);
        shopProduct.isMenuMenVisible();
        shopProduct.hoverOnMenuMen();
        shopProduct.isMenuMenShirtsVisible();
        shopProduct.clickOnMenuMenShirts();
        shopProduct.isAddToWishlistVisible();
        shopProduct.clickOnWishList();
    }

    @Feature("Sale price")
    @Test(description = "I can see old price on sale")
    public void can_view_old_price_on_sale() {
        shopProduct.isSaleMenuVisible();
        shopProduct.clickOnSaleMenu();
        shopProduct.isOldPriceVisible();
    }

    @Feature("Baby's cloths shop")
    @Test(description = "I can shop all products in little ones")
    public void can_shop_little_ones_things() {
        shopProduct.isLittleOnesMenuVisible();
        shopProduct.clickOnLittleOnes();
        shopProduct.isProductLittleOnesVisible();
        shopProduct.addToCartAllProductsLittleOnes();

    }

    @Feature("Delete products from cart")
    @Test(description = "I can delete items from cart")
    public void can_delete_items_from_cart() {
        can_shop_little_ones_things();
        shopProduct.isMiniCartButtonVisible();
        shopProduct.clickOnButtonCart();
        shopProduct.isViewCartVisible();
        shopProduct.clickOnViewCart();
        shopProduct.isRemoveButtonCartVisible();
        shopProduct.removeAllItemsFromCart();
    }

    @Feature("Quantity cart")
    @Test(description = "I can change the quantity in the cart")
    public void can_change_the_quantity() {
        can_shop_little_ones_things();
        shopProduct.isMiniCartButtonVisible();
        shopProduct.clickOnButtonCart();
        shopProduct.isViewCartVisible();
        shopProduct.clickOnViewCart();
        shopProduct.isQuantityInputVisible();
        shopProduct.fillInQuantity("2");
        shopProduct.isQuantityUpdateVisible();
        shopProduct.clickOnUpdateQuantity();
    }

    @Feature("Compare products")
    @Test(description = "I can compare the products cosplay")
    public void can_compare_cosplay_products() {
        shopProduct.isCosplayMenuVisible();
        shopProduct.clickOnCosplayMenu();
        shopProduct.isCompareLinksVisible();
        shopProduct.clickOnCompareLinks();
        sleep(1500);
        shopProduct.isCompareButtonVisible();
        shopProduct.clickOnCompareButton();
        sleep(2000);
    }

    public void can_add_to_cart_pants() {
        shopProduct.isMenMenuVisible();
        shopProduct.clickOnMenMenu();
        shopProduct.isMenProductsVisible();
        shopProduct.clickOnViewDetailsMenProductsLinks();
        shopProduct.isMenKhakiColorVisible();
        shopProduct.clickOnKhakiColorMen();
        shopProduct.isMen34SizeVisible();
        shopProduct.clickOn34SizeMen();
        shopProduct.isQtyDetailMenProductVisible();
        shopProduct.updateQtyMenProduct("3");
        shopProduct.clickOnAddToCart();
    }

    public void verify_success_add_to_cart_msg() {
        can_add_to_cart_pants();
        shopProduct.isSuccessMsgAddToCartVisible();
        shopProduct.verifyMsgSuccessAddToCart("Khaki Bowery Chino Pants was added to your shopping cart.");
    }

    public void can_open_tab() {
        shopProduct.isMenMenuVisible();
        shopProduct.clickOnMenMenu();
        shopProduct.isMenProductsVisible();
        shopProduct.clickOnViewDetailsMenProductsLinks();
        shopProduct.isProductTabVisible();
        shopProduct.clickOnTabInformation();
    }

    public void can_add_a_review_to_books() {
        shopProduct.isBooksMenuVisible();
        shopProduct.clickOnBooksMenu();
        shopProduct.isBookTitleVisible();
        shopProduct.clickOnBookTitle();
        shopProduct.isAddReviewBookVisible();
        shopProduct.clickOnAddReviewBook();
        shopProduct.isRatingStarsVisible();
        shopProduct.selectRatingStarsPrice();
        shopProduct.isDescriptionReviewVisible();
        shopProduct.fillInDescriptionReview("Description Review for book. The product is perfect");
        shopProduct.isSummaryReviewVisible();
        shopProduct.fillInSummaryReview("This is the summary");
        shopProduct.isNicknameVisible();
        shopProduct.fillInNicknameReview("Rohn");
        shopProduct.isSubmitReview();
        shopProduct.clickOnSubmitReview();
    }




}
