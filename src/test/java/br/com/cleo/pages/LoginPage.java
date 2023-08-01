package br.com.cleo.pages;

import br.com.screenplay.core.model.Locator;
import br.com.screenplay.core.model.LocatorAnnotation;
import br.com.screenplay.pages.BasePage;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.iOSBy;

public class LoginPage extends BasePage {

    @LocatorAnnotation(name = "Username", androidLocator = @AndroidBy(accessibility = "test-Username"))
    public static Locator username;

    @LocatorAnnotation(name = "Password", androidLocator = @AndroidBy(accessibility = "test-Password"))
    public static Locator password;

    @LocatorAnnotation(name = "Login", androidLocator = @AndroidBy(accessibility = "test-LOGIN"), iOSLocator = @iOSBy(accessibility = "test-LOGIN"))
    public static Locator login;

    @LocatorAnnotation(name = "Error Message", androidLocator = @AndroidBy(accessibility = "test-Error message"), iOSLocator = @iOSBy(accessibility = "test-Error message"))
    public static Locator errorMessage;

}
