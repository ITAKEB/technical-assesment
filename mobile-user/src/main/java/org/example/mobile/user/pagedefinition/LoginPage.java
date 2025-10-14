package org.example.mobile.user.pagedefinition;

import org.example.mobile.user.base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    @AndroidFindBy(accessibility  = "test-Username")
    @iOSXCUITFindBy(accessibility = "Username input field")
    WebElement userName;

    @AndroidFindBy(accessibility  = "test-Password")
    @iOSXCUITFindBy(accessibility = "Password input field")
    WebElement password;

    @AndroidFindBy(accessibility  = "test-LOGIN")
    @iOSXCUITFindBy(accessibility = "Login button")
    WebElement loginButton;

    public LoginPage(AppiumDriver driver) {
        super(driver);
    }

    public void enterUserName(String userName) {
        this.userName.sendKeys(userName);
    }

    public void enterPassword(String password) {
        this.password.sendKeys(password);
    }

    public void clickLoginButton() {
        this.loginButton.click();
    }

    public void loginAs(String username, String password) {
        this.enterUserName(username);
        this.enterPassword(password);
        this.clickLoginButton();
    }

}
