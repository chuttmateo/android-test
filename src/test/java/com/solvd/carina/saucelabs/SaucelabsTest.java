package com.solvd.carina.saucelabs;

import com.solvd.carina.saucelabs.common.LoginPageBase;
import com.solvd.carina.saucelabs.component.common.ProductCardBase;
import com.solvd.carina.saucelabs.common.ProductsPageBase;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SaucelabsTest implements IAbstractTest {
    @Test
    public void positiveLoginTest(){
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.typeUsername("standard_user");
        loginPage.typePassword("secret_sauce");
        ProductsPageBase productsPage = loginPage.clickOnLogInBtn();
        Assert.assertTrue(productsPage.isProductsTitlePresent(), "Products title is not present");
    }
    @Test
    public void negativeLoginTest(){
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.typeUsername("sdfsadf");
        loginPage.typePassword("asdfasdf");
        loginPage.clickOnLogInBtn();
        Assert.assertTrue(loginPage.isErrorMessagePresent(), "Error: error message is not present");
    }
    @Test
    public void verifyProductTest(){
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.typeUsername("standard_user");
        loginPage.typePassword("secret_sauce");
        ProductsPageBase productsPage = loginPage.clickOnLogInBtn();
        ProductCardBase card = productsPage.getCard();
        Assert.assertEquals(card.getTitle(), "Sauce Labs Backpack", "Actual card title and expected title do not match");
        Assert.assertEquals(card.getPrice(), "$29.99", "Actual card price and expected price do not match");
    }
    @Test
    public void addProductToCartTest(){
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.typeUsername("standard_user");
        loginPage.typePassword("secret_sauce");
        ProductsPageBase productsPage = loginPage.clickOnLogInBtn();
        ProductCardBase card = productsPage.getCard();
        card.clickOnAddToCart();
        Assert.assertTrue(productsPage.isCartWithProductPresent(), "Cart does not have a product");
    }
}
