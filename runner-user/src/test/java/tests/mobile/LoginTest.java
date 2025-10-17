package tests.mobile;

import base.BaseMobileTest;
import org.assertj.core.api.SoftAssertions;
import org.example.mobile.user.pagedefinition.HomePage;
import org.example.mobile.user.pagedefinition.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseMobileTest {

    @Test
    private void sampleTest() {
        SoftAssertions softAssertions = new SoftAssertions();
        LoginPage  loginPage = new LoginPage(driver);
        loginPage.loginAs("standard_user", "secret_sauce");
        HomePage homePage = new HomePage(driver);

        softAssertions.assertThat(homePage.checkCartButtonIsDisplayed()).isTrue();
        softAssertions.assertAll();
    }

    @Test
    private void sampleTest2() {
        SoftAssertions softAssertions = new SoftAssertions();
        LoginPage  loginPage = new LoginPage(driver);
        loginPage.loginAs("locked_out_user", "secret_sauce");

        softAssertions.assertThat(loginPage.isErrorMessageDisplayed()).isTrue();
        softAssertions.assertAll();
    }
}
