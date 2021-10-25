package webshop.dataprovider;

import java.util.HashMap;

public class RegisterUsersForTest {
    String email;
    String passWord;
    String confirmPass;
    String firstname;
    String middlename;
    String lastname;
    String testName;

    public RegisterUsersForTest(HashMap<String, String> user) {
        this.email = user.get("email");
        this.passWord = user.get("password");
        this.firstname = user.get("firstname");
        this.middlename = user.get("middlename");
        this.lastname = user.get("lastname");
        this.confirmPass = user.get("confirmPass");
    }

    public void setRegisterTestName(String testName) {
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

    public String getConfirmPass() { return confirmPass; }

    @Override
    public String toString() {
        return testName;
    }
}
