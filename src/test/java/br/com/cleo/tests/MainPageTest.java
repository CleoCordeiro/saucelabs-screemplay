package br.com.cleo.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.cleo.pages.MainPage;
import br.com.cleo.tasks.Login;
import br.com.screenplay.abilities.MobileNavigateAbility;
import br.com.screenplay.actors.ApiUser;
import br.com.screenplay.actors.MobileUser;
import br.com.screenplay.core.helpers.test.MobileBaseTest;
import br.com.screenplay.questions.mobile.ContainsText;
import br.com.screenplay.questions.mobile.IsVisible;
import br.com.screenplay.tasks.mobile.Click;
import br.com.screenplay.tasks.mobile.DragAndDrop;
import br.com.screenplay.tasks.mobile.ScrollTo;

public class MainPageTest extends MobileBaseTest {

    private static MobileUser mobileUser;

    @BeforeEach
    void setup() {
        // Criando um ator para realizar os testes com o nome "Cléo" será exibido no
        // relatório
        mobileUser = MobileUser.name("Cléo");
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
    @DisplayName("CT01 - Verificar o preço do primeiro produto")
    void Verificar_Preco_Do_Primeiro_Produto() {
        // Utilizando a tarefa Login para realizar o login, faz todo o processo de login
        mobileUser.attemptTo(Login.withCredentials("standard_user", "secret_sauce"));

        // Verifica se o elemento "price" contém o texto "$29.99", se não contiver, o
        // teste falha
        mobileUser.shouldSeeThat(ContainsText.of(MainPage.price, "$29.99"));
    }

    @Test
    @DisplayName("CT02 - Adicionar produto no carrinho Arrastando e Soltando")
    void Adicionar_Produto_No_Carrinho_Arrastando_E_Soltando() {
        // Utilizando a tarefa Login para realizar o login, faz todo o processo de login
        mobileUser.attemptTo(Login.withCredentials("standard_user", "secret_sauce"));

        // Arrasta o elemento "dragCart" e solta no elemento "productsTitleLabel"
        mobileUser.attemptTo(DragAndDrop.from(MainPage.dragCart).to(MainPage.productsTitleLabel));

        // Verifica se o texto do elemento "cartItens" contém o texto "1", se não
        // contiver, o teste falha
        mobileUser.shouldSeeThat(ContainsText.of(MainPage.cartItens, "1"));
    }

    @Test
    @DisplayName("CT03 - Adicionar produto no carrinho clicando no botão")
    void Adicionar_Produto_No_Carrinho_Clicando_No_Botao() {
        // Utilizando a tarefa Login para realizar o login, faz todo o processo de login
        mobileUser.attemptTo(Login.withCredentials("standard_user", "secret_sauce"));

        // Clica no elemento "CartAddButton"
        mobileUser.attemptTo(Click.on(MainPage.CartAddButton));

        // Verifica se o texto do elemento "cartItens" contém o texto "1", se não
        // contiver, o teste falha
        mobileUser.shouldSeeThat(ContainsText.of(MainPage.cartItens, "1"));

    }

    @Test
    @DisplayName("CT04 - Scrollar até o produto Sauce Labs Onesie estar visível")
    void Scrollar_Ate_O_Produto_Sauce_Labs_Onesie_Estar_Visivel() {
        
        // Utilizando a tarefa Login para realizar o login, faz todo o processo de login
        mobileUser.attemptTo(Login.withCredentials("standard_user", "secret_sauce"));

        // Scrolla até o elemento "sauceLabsOnesie" estar visível
        mobileUser.attemptTo(ScrollTo.up().distance(1000).atLocator(MainPage.sauceLabsOnesie));

        // Verifica se o elemento "sauceLabsOnesie" está visível, se não estiver, o
        // teste falha
        mobileUser.shouldSeeThat(IsVisible.of(MainPage.sauceLabsOnesie));

    }

}
