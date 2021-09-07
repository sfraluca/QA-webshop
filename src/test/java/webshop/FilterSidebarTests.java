package webshop;

import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class FilterSidebarTests extends MagentoTestBasePage {

    FilterSidebar filterSidebar = new FilterSidebar();

    @Feature("Filter by price kitchen")
    @Test(description = "I can filter by price kitchen devices")
    public void can_filter_by_price_kitchen_devices() {
        filterSidebar.isHomeDecoMenuVisible();
        filterSidebar.hoverOnHomeDecoMenuVisible();
        filterSidebar.isKitchenSubMenuVisible();
        filterSidebar.clickOnKitchenSubMenu();
        filterSidebar.isFilterPriceVisible();
        filterSidebar.clickOnPriceFilter();
        sleep(2000);
    }

    @Feature("Filter blazers")
    @Test(description = "I can filter blazers from category")
    public void can_filter_by_blazers() {
        filterSidebar.isMenMenuVisible();
        filterSidebar.clickOnMenMenu();
        filterSidebar.isCategoryVisible();
        filterSidebar.isSubCategoryVisible();
        filterSidebar.clickOnBlazerInCategory();
    }

}
