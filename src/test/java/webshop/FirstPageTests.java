package webshop;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

@Epic("FirstPageTests")
@Severity(SeverityLevel.CRITICAL)
@Test(description = "First page Homepage Tests suit")
public class FirstPageTests extends MagentoTestBasePage{

    FirstPageShopping firstPageAccess = new FirstPageShopping();
    MagentoTestBasePage verifyPageNotFound = new MagentoTestBasePage();

    //to be reviewed
    //to be used element collection
//    @Feature("Slider")
//    @Test(description = "I can access slider links")
//    public void can_access_slider_links() {
//        firstPageAccess.isSliderVisible();
//        firstPageAccess.isSliderNextVisible();
//        firstPageAccess.clickOnSlideShow();
//        firstPageAccess.isBreadcrumbsEyeWearVisible();
//        firstPageAccess.isHomepageVisible();
//        firstPageAccess.clickOnHomePageBreadcrumbs();
//        firstPageAccess.clickOnSlideShowNext();
//        firstPageAccess.clickOnSlideShow();
////        firstPageAccess.isBreadcrumbsWomenVisible();
//        verifyPageNotFound.verifyPageNotFoundMessageByText("404 Page not found.");
//        firstPageAccess.isHomePageOnPageNotFoundVisible();
//        firstPageAccess.clickOnHomepageOnPageNotFound();
//        firstPageAccess.clickOnSlideShowPrev();
//        firstPageAccess.clickOnSlideShow();
//        firstPageAccess.isBreadcrumbsMenVisible();
//        firstPageAccess.isHomepageVisible();
//        firstPageAccess.clickOnHomePageBreadcrumbs();
//        firstPageAccess.isSliderPrevVisible();
//        firstPageAccess.clickOnSlideShowPrev();
//        }

    @Feature("PromoBanner")
    @Test(description = "I can access the pages through promo banners")
    public void can_access_pages_from_promos() {
            firstPageAccess.isPromoBannersVisible();
            firstPageAccess.clickOnPromoBanner();
    }



}
