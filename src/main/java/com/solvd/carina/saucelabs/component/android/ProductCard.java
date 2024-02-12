package com.solvd.carina.saucelabs.component.android;

import com.solvd.carina.saucelabs.component.common.ProductCardBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.ICustomTypePageFactory;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ProductCardBase.class)
public class ProductCard extends ProductCardBase implements ICustomTypePageFactory {
    @FindBy(xpath = "./android.view.ViewGroup")
    private ExtendedWebElement seeInfoBtn;
    @FindBy(xpath = "./android.view.ViewGroup/android.widget.ImageView")
    private ExtendedWebElement image;
    @FindBy(xpath = "./android.view.ViewGroup//android.widget.TextView[@content-desc='test-Item title']")
    private ExtendedWebElement title;
    @FindBy(xpath = "./android.view.ViewGroup//android.widget.TextView[@content-desc='test-Price']")
    private ExtendedWebElement price;
    @FindBy(xpath = "./android.view.ViewGroup//android.view.ViewGroup[@content-desc='test-ADD TO CART']")
    private ExtendedWebElement addToCartBtn;
    public ProductCard(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
    @Override
    public boolean isProductImagePresent() {
        return image.isPresent();
    }
    @Override
    public String getPrice() {
        return price.getText();
    }
    @Override
    public String getTitle() {
        return title.getText();
    }
    @Override
    public void clickOnAddToCart() {
        addToCartBtn.click();
    }

}
