package webshop.dataprovider;

import org.testng.annotations.DataProvider;

import java.util.HashMap;
import java.util.Set;

public class DataProviderSearchInputs {
    private static final HashMap<String, HashMap<String, String>> genericData = new HashMap<>();

    private static void buildCorrectSearchableProducts() {
        HashMap<String,String> searchByProductName1 = new HashMap<>();
        searchByProductName1.put("searchInput", "LINEN BLAZER");
        genericData.put("Correct_Search_with_Product1", searchByProductName1);

        HashMap<String,String> searchByProductName2 = new HashMap<>();
        searchByProductName2.put("searchInput", "STRETCH COTTON BLAZER");
        genericData.put("Correct_Search_with_Product2", searchByProductName2);
    }

    @DataProvider(name = "search_by_name")
    public static Object[][] getSearchableProducts() {
        buildCorrectSearchableProducts();

        Object[][] data = new Object[genericData.size()][];
        Set<String> keys = genericData.keySet();

        for (int i = 0; i < genericData.size(); i++) {
            String key = keys.toArray()[i].toString();
            ProductsForSearch product = new ProductsForSearch(genericData.get(key));
            product.setProductInput(key);
            data[i] = new Object[]{product};
        }
        return data;
    }
}
