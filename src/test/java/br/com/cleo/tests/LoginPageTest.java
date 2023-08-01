package br.com.cleo.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.cleo.pages.LoginPage;
import br.com.cleo.pages.MainPage;
import br.com.cleo.tasks.Login;
import br.com.screenplay.abilities.MobileNavigateAbility;
import br.com.screenplay.actors.MobileUser;
import br.com.screenplay.core.helpers.test.MobileBaseTest;
import br.com.screenplay.questions.mobile.IsVisible;
import br.com.screenplay.tasks.mobile.ClearNotifications;
import br.com.screenplay.tasks.mobile.Click;
import br.com.screenplay.tasks.mobile.InputText;

public class LoginPageTest extends MobileBaseTest {

    private static MobileUser mobileUser;

    @BeforeEach
    void setup() {
        // Criando um ator para realizar os testes com o nome "Cléo" será exibido no
        // relatório
        mobileUser = MobileUser.name("Cleo");
        // Definindo a habilidade do ator para navegar em aplicativos mobile
        mobileUser.canPerform(MobileNavigateAbility.ability());
    }

    @AfterAll
    static void tearDownAll() {
        // Fechando o driver do Appium após a execução dos testes
        mobileUser.cleanUp();
    }

    @AfterEach
    void tearDown() {
        // Resetando o aplicativo após a execução de cada teste para garantir que o app
        // esteja no estado inicial
        mobileUser.resetApp();
    }

    @Test
    @DisplayName("CT01 - Login com credenciais válidas usando tarefa inputText")
    void Login_Com_Credenciais_Validas_Usando_InputText() {

        // Insere o texto "standard_user" no campo "standard_user"
        mobileUser.attemptTo(InputText.onField( LoginPage.username, "standard_user"));

        // Insere o texto "secret_sauce" no campo "secret_sauce"
        mobileUser.attemptTo(InputText.onField( LoginPage.password, "secret_sauce"));

        // Clica no botão "LOGIN"
        mobileUser.attemptTo(Click.on(LoginPage.login));

        // Verifica se o título da página "PRODUCTS" está visível, se não estiver, o teste falha
        mobileUser.shouldSeeThat(IsVisible.of(MainPage.productsTitleLabel));
    }

    /**
     * Criando uma tarefa para realizar o login para reutilizar o código em outros
     * testes
     * {@link Login}
     */
    @Test
    @DisplayName("CT02 - Login com credenciais válidas com a task Login")
    void Login_Com_Credenciais_Validas_Com_A_Task_Login() {
        // Utilizando a tarefa Login para realizar o login, faz todo o processo de login
        mobileUser.attemptTo(Login.withCredentials("standard_user", "secret_sauce"));

        // Verifica se o título da página "PRODUCTS" está visível, se não estiver, o teste falha
        mobileUser.shouldSeeThat(IsVisible.of(MainPage.productsTitleLabel));

    }

    @Test
    @DisplayName("CT03 - Tentar logar com credenciais inválidas")
    void Login_Com_Credenciais_Invalidas_Com_A_Task_Login() {
        // Utilizando a tarefa Login para realizar o login, faz todo o processo de login
        mobileUser.attemptTo(Login.withCredentials("aaa", "secret_sauce"));

        // Verifica se a mensagem de erro está visível, se não estiver, o teste falha
        mobileUser.shouldSeeThat(IsVisible.of(LoginPage.errorMessage));
    }

    @Test
    @DisplayName("CT04 - Tentar logar sem informar as credenciais")
    void Login_Sem_Informar_Credenciais() {
        // Clica no botão "LOGIN"
        mobileUser.attemptTo(Click.on(LoginPage.login));

         // Verifica se a mensagem de erro está visível, se não estiver, o teste falha
        mobileUser.shouldSeeThat(IsVisible.of(LoginPage.errorMessage));
    }

    @Test
    @DisplayName("CT05 - Limpar notificações")
    void Limpar_Notificacoes() {
        // Limpa as notificações do dispositivo
        mobileUser.attemptTo(ClearNotifications.init());
    }

}
