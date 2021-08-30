package webshop;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

@Epic("MenuItems")
@Severity(SeverityLevel.CRITICAL)
@Test(description = "Menu items tests suit")
public class MenuItemsTests extends MagentoTestBasePage {
    MenuItems menuItems = new MenuItems();

    @Feature("Menu items")
    @Test(description = "I can all menu items")
    public void can_access_menu() {
        menuItems.isMenuFirstLevelVisible();
        menuItems.clickOnMenuFirstLevel();
    }

//    @Feature("SubMenu items")
//    @Test(description = "I can all submenu items")
//    public void can_access_submenu() {
//        //to be reviewed
//        menuItems.accessSecondMenu();
//    }


}
