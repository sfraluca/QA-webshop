package webshop;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

@Epic("FirstPageTests")
@Severity(SeverityLevel.CRITICAL)
@Test(description = "First page Homepage Tests suit")
public class FirstPageTests extends MagentoTestBasePage{

    FirstPageShopping firstPageAccess = new FirstPageShopping();

    @Feature("Slider")
    @Test(description = "I can access slider links")
    public void can_access_slider_links() {
        firstPageAccess.isSliderVisible();
        firstPageAccess.isSliderNextVisible();
        sleep(2500);
        firstPageAccess.clickOnSlideShowNext();
        sleep(2500);
        firstPageAccess.clickOnSlideShowPrev();
        sleep(2500);
        firstPageAccess.isSliderPrevVisible();
        firstPageAccess.clickOnSlideShowPrev();
        sleep(2500);
        }

    @Feature("PromoBanner")
    @Test(description = "I can access the pages through promo banners")
    public void can_access_pages_from_promos() {
            firstPageAccess.isPromoBannersVisible();
            firstPageAccess.clickOnPromoBanner();
    }



}
