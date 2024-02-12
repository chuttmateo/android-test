package com.solvd.carina.saucelabs.android;

import com.solvd.carina.saucelabs.component.android.ProductCard;
import com.solvd.carina.saucelabs.component.common.ProductCardBase;
import com.solvd.carina.saucelabs.common.ProductsPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ProductsPageBase.class)
public class ProductsPage extends ProductsPageBase {
    @FindBy(xpath = "//android.widget.TextView[@text='PRODUCTS']")
    private ExtendedWebElement productsTitle;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Item'][1]")
    private ProductCard card;
    @FindBy(xpath = "//android.widget.TextView[@text='1']")
    private ExtendedWebElement cartWithProduct;
    public ProductsPage(WebDriver driver) {
        super(driver);
    }
    @Override
    public boolean isProductsTitlePresent() {
        return productsTitle.isPresent();
    }
    @Override
    public ProductCardBase getCard() {
        return card;
    }
    @Override
    public boolean isCartWithProductPresent() {
        return cartWithProduct.isPresent();
    }

}
