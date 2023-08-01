package br.com.cleo.pages;

import br.com.screenplay.core.model.Locator;
import br.com.screenplay.core.model.LocatorAnnotation;
import br.com.screenplay.pages.BasePage;
import io.appium.java_client.pagefactory.AndroidBy;

public class DrawPage extends BasePage {

    @LocatorAnnotation(name = "Draw", androidLocator = @AndroidBy(xpath = "//android.view.ViewGroup[@content-desc='test-DRAWING-SCREEN']"))
    public static Locator draw;

}
