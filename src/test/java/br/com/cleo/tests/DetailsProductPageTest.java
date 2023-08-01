package br.com.cleo.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.cleo.pages.DetailsProductPage;
import br.com.screenplay.abilities.MobileNavigateAbility;
import br.com.screenplay.actors.MobileUser;
import br.com.screenplay.questions.mobile.IsVisible;
import br.com.screenplay.tasks.mobile.OpenDeepLink;
import br.com.screenplay.tasks.mobile.ScreenShot;

public class DetailsProductPageTest {

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
    @DisplayName("CT01 - DeepLink para o primeiro produto")
    void DeepLink_Para_O_Primeiro_Produto() {
        // Abrindo o aplicativo diretamente na tela de detalhes do produto usando o
        // deeplink
        mobileUser.attemptTo(OpenDeepLink.with("swaglabs://swag-item/0"));

        // Verifica se o botão "Back to Products" está visível
        mobileUser.shouldSeeThat(IsVisible.of(DetailsProductPage.backToProducts));
    }

    @Test
    @DisplayName("CT02 - Tirar uma screenshot da página de detalhes do produto")
    void Tirar_Uma_Screenshot_Da_Pagina_De_Detalhes_Do_Produto() {
        // Abrindo o aplicativo diretamente na tela de detalhes do produto usando o
        // deeplink
        mobileUser.attemptTo(OpenDeepLink.with("swaglabs://swag-item/0"));

        // Verifica se o botão "Back to Products" está visível
        mobileUser.shouldSeeThat(IsVisible.of(DetailsProductPage.backToProducts));

        // Tira uma screenshot da tela de detalhes do produto
        mobileUser.attemptTo(ScreenShot.take("detailsProductPage"));
    }
}
