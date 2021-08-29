package webshop.dataprovider;

import java.util.HashMap;

public class UserForTest {
    String email;
    String passWord;
    String firstname;
    String middlename;
    String lastname;
    String testName;

    public UserForTest(HashMap<String, String> user) {
        this.email = user.get("email");
        this.passWord = user.get("password");
        this.firstname = user.get("firstname");
        this.middlename = user.get("middlename");
        this.lastname = user.get("lastname");
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstname() {
        return firstname.toUpperCase();
    }

    public String getMiddlename() {
        return middlename.toUpperCase();
    }

    public String getLastname() {
        return lastname.toUpperCase();
    }

    public String getPassWord() {
        return passWord;
    }

    @Override
    public String toString() {
        return testName;
    }
}
