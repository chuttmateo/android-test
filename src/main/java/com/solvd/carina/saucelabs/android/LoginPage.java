package com.solvd.carina.saucelabs.android;

import com.solvd.carina.saucelabs.common.LoginPageBase;
import com.solvd.carina.saucelabs.common.ProductsPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase {
    @FindBy(xpath = "//android.widget.EditText[@content-desc='test-Username']")
    private ExtendedWebElement usernameInput;
    @FindBy(xpath = "//android.widget.EditText[@content-desc='test-Password']")
    private ExtendedWebElement passwordInput;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-LOGIN']")
    private ExtendedWebElement logInBtn;
    @FindBy(xpath = "//android.widget.TextView[@text='Username and password do not match any user in this service.']")
    private ExtendedWebElement errorMessage;
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @Override
    public void typeUsername(String username) {
        usernameInput.type(username);
    }
    @Override
    public void typePassword(String password) {
        passwordInput.type(password);
    }
    @Override
    public ProductsPageBase clickOnLogInBtn() {
        logInBtn.click();
        return initPage(driver, ProductsPageBase.class);
    }
    @Override
    public boolean isErrorMessagePresent() {
        return errorMessage.isPresent();
    }
}
