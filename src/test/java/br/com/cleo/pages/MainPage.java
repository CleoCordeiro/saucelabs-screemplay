package br.com.cleo.pages;

import br.com.screenplay.core.model.Locator;
import br.com.screenplay.core.model.LocatorAnnotation;
import br.com.screenplay.pages.BasePage;
import io.appium.java_client.pagefactory.AndroidBy;

public class MainPage extends BasePage {

    @LocatorAnnotation(name = "Menu Button", androidLocator = @AndroidBy(accessibility = "test-Menu"))
    public static Locator menuButton;

    @LocatorAnnotation(name = "Cart Button", androidLocator = @AndroidBy(accessibility = "test-Cart"))
    public static Locator cartButton;

    @LocatorAnnotation(name = "Toggle Button", androidLocator = @AndroidBy(accessibility = "test-Toggle"))
    public static Locator toggleButton;

    @LocatorAnnotation(name = "Modal Selector Button", androidLocator = @AndroidBy(accessibility = "test-Modal Selector Button"))
    public static Locator modalSelectorButton;

    @LocatorAnnotation(name = "Product Image", androidLocator = @AndroidBy(xpath = "//android.view.ViewGroup[@content-desc=\'test-Item\']"))
    public static Locator productImage;

    @LocatorAnnotation(name = "Product Title Label", androidLocator = @AndroidBy(xpath = "//android.view.ViewGroup[@content-desc=\'test-Cart drop zone\']/android.view.ViewGroup/android.widget.TextView"))
    public static Locator productsTitleLabel;

    @LocatorAnnotation(name = "Product Name Label", androidLocator = @AndroidBy(xpath = "//android.widget.TextView[@content-desc=\"test-Item title\"]"))
    public static Locator productNameLabel;

    @LocatorAnnotation(name = "Sauce Labs Onesie", androidLocator = @AndroidBy(xpath = "//android.view.ViewGroup[@bounds and descendant::android.widget.TextView[contains(@text, 'Sauce Labs Onesie')]]"))
    public static Locator sauceLabsOnesie;

    @LocatorAnnotation(name = "Product Price Label", androidLocator = @AndroidBy(xpath = "//android.widget.TextView[@content-desc=\'test-Price\']"))
    public static Locator productPriceLabel;

    @LocatorAnnotation(name = "Drag to Cart", androidLocator = @AndroidBy(xpath = "(//android.view.ViewGroup[@content-desc=\"test-Drag Handle\"])[1]"))
    public static Locator dragCart;

   // (//android.view.ViewGroup[@content-desc="test-ADD TO CART"])[1]
    @LocatorAnnotation(name = "Cart Add Button", androidLocator = @AndroidBy(xpath = "(//android.view.ViewGroup[@content-desc='test-ADD TO CART'])[1]"))
    public static Locator CartAddButton;

    //android.view.ViewGroup[@content-desc="test-Cart"]/android.view.ViewGroup/android.widget.TextView
    @LocatorAnnotation(name = "Cart Itens", androidLocator = @AndroidBy(xpath = "//android.view.ViewGroup[@content-desc=\'test-Cart\']/android.view.ViewGroup/android.widget.TextView"))
    public static Locator cartItens;

    @LocatorAnnotation(name = "Price", androidLocator = @AndroidBy(xpath = "(//android.widget.TextView[@content-desc=\'test-Price\'])[1]"))
    public static Locator price;
}
