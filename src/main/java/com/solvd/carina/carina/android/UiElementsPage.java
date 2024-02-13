package com.solvd.carina.carina.android;

import com.solvd.carina.carina.common.UiElementsPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = UiElementsPageBase.class)
public class UiElementsPage extends UiElementsPageBase {
    @FindBy(id = "editText")
    private ExtendedWebElement textInput;
    @FindBy(id = "editText2")
    private ExtendedWebElement emailInput;
    @FindBy(id = "editText3")
    private ExtendedWebElement dateInput;
    @FindBy(id = "checkBox2")
    private ExtendedWebElement isACopySquareBox;
    @FindBy(id = "radioButton")
    private ExtendedWebElement maleGenderRadio;
    @FindBy(id = "switch1")
    private ExtendedWebElement enableSwitch;
    @FindBy(className = "android.widget.ScrollView")
    private ExtendedWebElement pageContainer;

    public UiElementsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void typeText(String text) {
        textInput.type(text);
    }

    @Override
    public void typeEmail(String text) {
        emailInput.type(text);
    }

    @Override
    public void typeDate(String date) {
        dateInput.type(date);
    }

    @Override
    public void clickOnIsACopySquareBox() {
        isACopySquareBox.click();
    }

    @Override
    public void clickOnMaleGender() {
        maleGenderRadio.click();
    }

    @Override
    public void clickOnEnableSwitch() {
        enableSwitch.click();
    }

    @Override
    public void swipeToMaleRadio() {
        swipe(maleGenderRadio, pageContainer, 10);
    }

    @Override
    public void swipeToEnableSwitch() {
        swipe(enableSwitch, pageContainer, 10);
    }

    @Override
    public boolean isPageOpened() {
        return textInput.isElementPresent();
    }
}
