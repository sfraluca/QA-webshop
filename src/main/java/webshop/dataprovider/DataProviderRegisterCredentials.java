package webshop.dataprovider;

import org.testng.annotations.DataProvider;

import java.util.HashMap;
import java.util.Set;

public class DataProviderRegisterCredentials {
    private static final HashMap<String, HashMap<String, String>> genericData = new HashMap<>();

    private static void buildCorrectRegisterCredentials() {
        HashMap<String,String> correctCredentialsRegisterTest = new HashMap<>();
        correctCredentialsRegisterTest.put("email", "test_register1@yahoo.com");
        correctCredentialsRegisterTest.put("password", "1a2b3c4d.");
        correctCredentialsRegisterTest.put("confirmPass", "1a2b3c4d.");
        correctCredentialsRegisterTest.put("firstname", "Test");
        correctCredentialsRegisterTest.put("middlename", "Reg");
        correctCredentialsRegisterTest.put("lastname", "Maria");
        genericData.put("Correct_register_with_test1", correctCredentialsRegisterTest);

        HashMap<String,String> correctCredentialsRegisterTest1 = new HashMap<>();
        correctCredentialsRegisterTest1.put("email", "test_1@yahoo.com");
        correctCredentialsRegisterTest1.put("password", "1a2b3c4d.");
        correctCredentialsRegisterTest1.put("confirmPass", "1a2b3c4d.");
        correctCredentialsRegisterTest1.put("firstname", "Test1");
        correctCredentialsRegisterTest1.put("middlename", "R");
        correctCredentialsRegisterTest1.put("lastname", "Maria1");
        genericData.put("Correct_register_with_test2", correctCredentialsRegisterTest1);
    }

    @DataProvider(name = "correct_credentials")
    public static Object[][] getCredentials() {
        buildCorrectRegisterCredentials();

        Object[][] data = new Object[genericData.size()][];
        Set<String> keys = genericData.keySet();

        for (int i = 0; i < genericData.size(); i++) {
            String key = keys.toArray()[i].toString();
            RegisterUsersForTest user = new RegisterUsersForTest(genericData.get(key));
            user.setRegisterTestName(key);
            data[i] = new Object[]{user};
        }
        return data;
    }
}
