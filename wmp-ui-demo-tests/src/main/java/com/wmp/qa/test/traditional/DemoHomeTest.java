package com.wmp.qa.test.traditional;

import com.wmp.qa.ui.pages.LoginPage;
import com.wmp.qa.uicore.test.TestBase;
import org.testng.annotations.Test;

public class DemoHomeTest extends TestBase {

    @Test(groups = {"BAT"})
    public void test_Verify_Success_Login() {
        new LoginPage(getDriver()).
                Step_Enter_Login_Credentials("Admin", "admin123").
                Check_And_Validate_User_Logged().
                Step_Perform_Logout();

    }

    @Test(groups = {"BAT"})
    public void test_Add_New_User() {
        new LoginPage(getDriver()).
                Step_Enter_Login_Credentials("Admin", "admin123").
                Step_Navigate_To_AdminPage().
                Step_Search_User("Admin");
    }
}
