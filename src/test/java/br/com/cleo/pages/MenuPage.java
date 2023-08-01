package br.com.cleo.pages;

import br.com.screenplay.core.model.Locator;
import br.com.screenplay.core.model.LocatorAnnotation;
import br.com.screenplay.pages.BasePage;
import io.appium.java_client.pagefactory.AndroidBy;

public class MenuPage extends BasePage {

    @LocatorAnnotation(name = "All Items", androidLocator = @AndroidBy(accessibility = "test-ALL ITEMS"))
    public static Locator allItems;

    @LocatorAnnotation(name = "WebView", androidLocator = @AndroidBy(accessibility = "test-WEBVIEW"))
    public static Locator webView;

    @LocatorAnnotation(name = "QR Code Scanner", androidLocator = @AndroidBy(accessibility = "test-QR CODE SCANNER"))
    public static Locator qrCodeScanner;

    @LocatorAnnotation(name = "Geo Location", androidLocator = @AndroidBy(accessibility = "test-GEO LOCATION"))
    public static Locator geoLocation;

    @LocatorAnnotation(name = "Drawing", androidLocator = @AndroidBy(accessibility = "test-DRAWING"))
    public static Locator drawing;

    @LocatorAnnotation(name = "About", androidLocator = @AndroidBy(accessibility = "test-ABOUT"))
    public static Locator about;

    @LocatorAnnotation(name = "Logout", androidLocator = @AndroidBy(accessibility = "test-LOGOUT"))
    public static Locator logout;

    @LocatorAnnotation(name = "Reset App State", androidLocator = @AndroidBy(accessibility = "test-RESET APP STATE"))
    public static Locator resetAppState;

    @LocatorAnnotation(name = "Close", androidLocator = @AndroidBy(accessibility = "test-Close"))
    public static Locator close;
}
