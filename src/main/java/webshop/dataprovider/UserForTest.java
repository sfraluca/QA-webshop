package webshop.dataprovider;

import java.util.HashMap;

public class UserForTest {
    String email;
    String passWord;
    String testName;

    public UserForTest(HashMap<String, String> user) {
        this.email = user.get("email");
        this.passWord = user.get("password");
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassWord() {
        return passWord;
    }

    @Override
    public String toString() {
        return testName;
    }
}
