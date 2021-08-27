package webshop.dataprovider;

import org.testng.annotations.DataProvider;

import java.util.HashMap;
import java.util.Set;

public class DataProviderCredentials {
    private static final HashMap<String, HashMap<String, String>> genericData = new HashMap<>();

    private static void buildCorrectCredentials() {
        HashMap<String,String> correctCredentialsTest1 = new HashMap<>();
        correctCredentialsTest1.put("email", "test1@yahoo.com");
        correctCredentialsTest1.put("password", "1a2b3c4d");
        genericData.put("Correct_Login_with_email_test1", correctCredentialsTest1);
    }

    @DataProvider(name = "correct_credentials")
    public static Object[][] getCredentials() {
        buildCorrectCredentials();

        Object[][] data = new Object[genericData.size()][];
        Set<String> keys = genericData.keySet();

        for (int i = 0; i < genericData.size(); i++) {
            String key = keys.toArray()[i].toString();
            UserForTest user = new UserForTest(genericData.get(key));
            user.setTestName(key);
            data[i] = new Object[]{user};
        }
        return data;
    }
}