package webshop;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

@Epic("MenuItems")
@Severity(SeverityLevel.CRITICAL)
@Test(description = "Menu items tests suit")
public class MenuItemsTests {
    MenuItems menuItems = new MenuItems();

    @Feature("Menu items")
    @Test(description = "I can all menu items")
    public void can_access_menu() {
        menuItems.isMenuFirstLevelVisible();
        menuItems.clickOnMenuFirstLevel();
    }


}
