package com.solvd.carina.carina.common;

import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class UiElementsPageBase extends AbstractPage implements IMobileUtils {
    public UiElementsPageBase(WebDriver driver) {
        super(driver);
    }
    public abstract void typeText(String text);
    public abstract void typeEmail(String text);
    public abstract void typeDate(String date);
    public abstract void clickOnIsACopySquareBox();
    public abstract void clickOnMaleGender();
    public abstract void clickOnEnableSwitch();
    public abstract void swipeToMaleRadio();
    public abstract void swipeToEnableSwitch();
}
