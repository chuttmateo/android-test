package com.solvd.carina.carina.android;


import com.solvd.carina.carina.common.CarinaDescriptionPageBase;
import com.solvd.carina.carina.common.UiElementsPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CarinaDescriptionPageBase.class)
public class CarinaDescriptionPage extends CarinaDescriptionPageBase {

    @ExtendedFindBy(accessibilityId = "Navigate up")
    private ExtendedWebElement openMenuButton;

    @ExtendedFindBy(text = "UI elements")
    private ExtendedWebElement openUiElementButton;

    @FindBy(xpath = "//android.widget.TextView[@text='%s']")
    private ExtendedWebElement profileNameElement;

    @FindBy(id = "content_frame")
    private ExtendedWebElement webViewContent;

    public CarinaDescriptionPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isProfileNamePresent(String profileName) {
        openMenuButton.click();
        profileNameElement.format(profileName);
        return profileNameElement.isPresent();
    }

    @Override
    public UiElementsPageBase openUiElement() {
        openMenuButton.click();
        openUiElementButton.click();
        return initPage(getDriver(), UiElementsPageBase.class);
    }

    @Override
    public boolean isPageOpened() {
        return webViewContent.isElementPresent();
    }

}
