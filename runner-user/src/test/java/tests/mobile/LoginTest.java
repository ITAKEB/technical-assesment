package tests.mobile;

import base.BaseMobileTest;
import org.example.mobile.user.pagedefinition.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseMobileTest {

    @Test
    private void sampleTest() {
        LoginPage  loginPage = new LoginPage(driver);
        loginPage.loginAs("standard_user", "secret_sauce");
    }

    @Test
    private void sampleTest2() {
        LoginPage  loginPage = new LoginPage(driver);
        loginPage.loginAs("problem_user", "secret_sauce");
    }
}
