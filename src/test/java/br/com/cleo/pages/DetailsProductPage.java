package br.com.cleo.pages;

import br.com.screenplay.core.model.Locator;
import br.com.screenplay.core.model.LocatorAnnotation;
import br.com.screenplay.pages.BasePage;
import io.appium.java_client.pagefactory.AndroidBy;

public class DetailsProductPage extends BasePage {

    @LocatorAnnotation(name = "Back to Products", androidLocator = @AndroidBy(accessibility = "test-BACK TO PRODUCTS"))
    public static Locator backToProducts;

}
