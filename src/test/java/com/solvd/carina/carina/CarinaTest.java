package com.solvd.carina.carina;

import com.solvd.carina.carina.common.CarinaDescriptionPageBase;
import com.solvd.carina.carina.common.LoginPageBase;
import com.solvd.carina.carina.common.UiElementsPageBase;
import com.solvd.carina.carina.common.WelcomePageBase;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CarinaTest implements IAbstractTest {
    @Test
    @MethodOwner(owner = "mchutt")
    public void verifyLogInTest(){
        WelcomePageBase welcomePage = initPage(getDriver(), WelcomePageBase.class);
        Assert.assertTrue(welcomePage.isPageOpened(), "WelcomePage is not opened");
        Assert.assertTrue(welcomePage.isNextButtonPresent(), "Next button is not present");

        LoginPageBase loginPage = welcomePage.clickNextBtn();
        CarinaDescriptionPageBase descriptionPage = loginPage.login();
        Assert.assertTrue(descriptionPage.isPageOpened(), "Description page is not opened");

        Assert.assertTrue(descriptionPage.isProfileNamePresent("Lorem ipsum"), "User Profile is not present");
    }

    @Test
    @MethodOwner(owner = "mchutt")
    public void verifyFormTest(){
        WelcomePageBase welcomePage = initPage(getDriver(), WelcomePageBase.class);
        LoginPageBase loginPage = welcomePage.clickNextBtn();
        CarinaDescriptionPageBase descriptionPage = loginPage.login();

        UiElementsPageBase uiElementsPageBase = descriptionPage.openUiElement();

        Assert.assertTrue(uiElementsPageBase.isPageOpened(), "Ui Page is not opened");
        uiElementsPageBase.typeText("example");
        uiElementsPageBase.typeEmail("example@example.com");
        uiElementsPageBase.typeDate("13/02/2023");
        uiElementsPageBase.clickOnIsACopySquareBox();

        uiElementsPageBase.swipeToMaleRadio();
        uiElementsPageBase.clickOnMaleGender();

        uiElementsPageBase.swipeToEnableSwitch();
        uiElementsPageBase.clickOnEnableSwitch();
    }
}
