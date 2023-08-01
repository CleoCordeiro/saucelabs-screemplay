package br.com.cleo.tasks;

import br.com.cleo.pages.LoginPage;
import br.com.screenplay.actors.MobileUser;
import br.com.screenplay.core.model.Task;
import br.com.screenplay.tasks.mobile.Click;
import br.com.screenplay.tasks.mobile.InputText;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Login implements Task<MobileUser> {

    private String username;
    private String password;

    /**
     * Creates a new {@code Login} instance with the specified username and password.
     * @param username the username to be entered in the input field.
     * @param password the password to be entered in the input field.
     * @return a new {@code Login} instance with the specified username and password.
     */
    public static Login withCredentials(String username, String password) {
        return new Login(username, password);
    }

    @Override
    public void perform(MobileUser actor) {
        MobileUser mobileUser = (MobileUser) actor;
        mobileUser.attemptTo(InputText.onField(LoginPage.username, username));
        mobileUser.attemptTo(InputText.onField(LoginPage.password, password));
        mobileUser.attemptTo(Click.on(LoginPage.login));
    }

}
