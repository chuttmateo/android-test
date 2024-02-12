package com.solvd.carina.saucelabs.component.common;

import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public abstract class ProductCardBase extends AbstractUIObject {
    public ProductCardBase(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
    public abstract boolean isProductImagePresent();
    public abstract String getPrice();
    public abstract String getTitle();
    public abstract void clickOnAddToCart();
}
