package com.solvd.carina.saucelabs.common;

import com.solvd.carina.saucelabs.component.common.ProductCardBase;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ProductsPageBase extends AbstractPage {
    public ProductsPageBase(WebDriver driver) {
        super(driver);
    }
    public abstract boolean isProductsTitlePresent();
    public abstract ProductCardBase getCard();
    public abstract boolean isCartWithProductPresent();
}
