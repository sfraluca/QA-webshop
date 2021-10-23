package webshop;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import webshop.dataprovider.DataProviderSearchInputs;
import webshop.dataprovider.ProductsForSearch;

import static com.codeborne.selenide.Selenide.sleep;

@Epic("SearchInput")
@Severity(SeverityLevel.CRITICAL)
@Test(description = "Search input tests suit")
public class SearchProductTests {

    @Feature("Search by name")
    @Test(description = "I can search by name {0}",
            testName = "Search by name for: {0}",
            dataProvider = "search_by_name", dataProviderClass = DataProviderSearchInputs.class)
    public void can_search_by_name(ProductsForSearch products) {
        String product = products.getProduct();
        SearchProduct searchProduct = new SearchProduct();
        searchProduct.isSearchVisible();
        searchProduct.typeInSearchInput(product);
        searchProduct.isSearchButtonVisible();
        searchProduct.clickOnSearchIcon();
        searchProduct.cleanSearchInput();
        sleep(1000);

    }

}
