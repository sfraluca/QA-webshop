package webshop.dataprovider;

import java.util.HashMap;

public class ProductsForSearch {
    String searchInput;
    String testName;

    public ProductsForSearch(HashMap<String, String> product) {
        this.searchInput = product.get("searchInput");
    }

    public void setProductInput(String testName) {
        this.testName = testName;
    }

    public String getProduct() {
        return searchInput;
    }

    @Override
    public String toString() {
        return testName;
    }
}
