package com.solvd.carina.carina.common;

import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CarinaDescriptionPageBase extends AbstractPage implements IMobileUtils {

    public CarinaDescriptionPageBase(WebDriver driver) {
        super(driver);
    }
    public abstract boolean isProfileNamePresent(String profileName);
}
