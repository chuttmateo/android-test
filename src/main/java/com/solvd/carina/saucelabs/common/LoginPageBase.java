package com.solvd.carina.saucelabs.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class LoginPageBase extends AbstractPage {
    public LoginPageBase(WebDriver driver) {
        super(driver);
    }
    public abstract void typeUsername(String username);
    public abstract void typePassword(String password);
    public abstract ProductsPageBase clickOnLogInBtn();
    public abstract boolean isErrorMessagePresent();
}
