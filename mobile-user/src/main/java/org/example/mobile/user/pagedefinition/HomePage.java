package org.example.mobile.user.pagedefinition;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.example.mobile.user.base.BasePage;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    @AndroidFindBy(accessibility = "test-Cart")
    @iOSXCUITFindBy(accessibility = "Cart button")
    private WebElement cartButton;

    public HomePage(AppiumDriver driver) {
        super(driver);
    }

    public boolean checkCartButtonIsDisplayed() {
        return cartButton.isDisplayed();
    }

    public void clickCartButton() {
        cartButton.click();
    }
}
