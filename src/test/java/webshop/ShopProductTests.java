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


}
