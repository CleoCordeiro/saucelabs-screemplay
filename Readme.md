# 📱 Documentação do Screenplay Mobile 

Guia de referência para testes automatizados em aplicações móveis usando o Screenplay library.
Este guia fornece informações detalhadas sobre os recursos disponíveis para testes automatizados em aplicações móveis usando o Screenplay library. Ele inclui informações sobre as classes, métodos e atributos disponíveis para testes mobile, bem como exemplos de uso para ajudar você a começar a escrever testes automatizados em aplicações móveis usando o Screenplay library.

- [📱 Documentação do Screenplay Mobile](#-documentação-do-screenplay-mobile)
  - [📃 Documentação do Arquivo de Configurações do Appium](#-documentação-do-arquivo-de-configurações-do-appium)
  - [🧪 MobileBaseTest](#-mobilebasetest)
    - [🧩 Extensões](#-extensões)
    - [Utilização](#utilização)
    - [Exemplo de Uso](#exemplo-de-uso)
      - [🌐 BasePage](#-basepage)
        - [Exemplo de Uso](#exemplo-de-uso-1)
    - [📍 LocatorAnnotation](#-locatorannotation)
        - [Atributos](#atributos)
        - [Exemplo de Uso](#exemplo-de-uso-2)
        - [AndroidBy](#androidby)
        - [iOSBy](#iosby)
  - [🎭 MobileUser](#-mobileuser)
    - [Atributos](#atributos-1)
    - [Construtor](#construtor)
    - [Métodos](#métodos)
    - [Exemplo de Uso](#exemplo-de-uso-3)
    - [⚙️ Ability Mobile](#️-ability-mobile)
      - [⚙️ MobileNavigateAbility](#️-mobilenavigateability)
        - [Métodos Estáticos](#métodos-estáticos)
  - [🎯 Tasks Mobile](#-tasks-mobile)
      - [🎯 Task - ClearNotifications](#-task---clearnotifications)
        - [Métodos Estáticos](#métodos-estáticos-1)
        - [Executando a Limpeza de Notificações](#executando-a-limpeza-de-notificações)
        - [Exemplo de Uso](#exemplo-de-uso-4)
      - [🎯 Task - Click](#-task---click)
        - [Métodos Estáticos](#métodos-estáticos-2)
        - [Executando o Click](#executando-o-click)
        - [Exemplo de Uso](#exemplo-de-uso-5)
      - [🎯 Task - DragAndDrop](#-task---draganddrop)
        - [Métodos Estáticos](#métodos-estáticos-3)
        - [Executando o DragAndDrop](#executando-o-draganddrop)
        - [Exemplo de Uso](#exemplo-de-uso-6)
      - [🎯 Task - InputText](#-task---inputtext)
        - [Métodos Estáticos](#métodos-estáticos-4)
        - [Executando a Inserção de Texto](#executando-a-inserção-de-texto)
        - [Exemplo de Uso](#exemplo-de-uso-7)
      - [🎯 Task - OpenDeepLink](#-task---opendeeplink)
        - [Construtor Estático](#construtor-estático)
        - [Executando a Abertura do Deeplink](#executando-a-abertura-do-deeplink)
        - [Exemplo de Uso](#exemplo-de-uso-8)
      - [🎯 Task - ScreenShot](#-task---screenshot)
        - [Construtor Estático](#construtor-estático-1)
        - [Executando a Captura do Screenshot](#executando-a-captura-do-screenshot)
        - [Exemplo de Uso](#exemplo-de-uso-9)
      - [🎯 Task - ScrollTo](#-task---scrollto)
        - [Métodos Estáticos](#métodos-estáticos-5)
        - [Configurações Adicionais](#configurações-adicionais)
        - [Executando o Scroll](#executando-o-scroll)
        - [Exemplo de Uso](#exemplo-de-uso-10)
      - [🎯 Task - WaitFor](#-task---waitfor)
        - [Construtores Estáticos](#construtores-estáticos)
        - [Executando a Espera pela Visibilidade do Elemento](#executando-a-espera-pela-visibilidade-do-elemento)
        - [Exemplo de Uso](#exemplo-de-uso-11)
  - [❓Questions Mobile](#questions-mobile)
      - [❓ Question - ContainsText](#-question---containstext)
        - [Construtor Estático](#construtor-estático-2)
        - [Executando a Verificação do Texto do Elemento](#executando-a-verificação-do-texto-do-elemento)
        - [Exemplo de Uso](#exemplo-de-uso-12)
      - [❓ Question - IsChecked](#-question---ischecked)
        - [Construtor Estático](#construtor-estático-3)
        - [Executando a Verificação do Elemento Marcado](#executando-a-verificação-do-elemento-marcado)
      - [❓ Question - IsNotChecked](#-question---isnotchecked)
        - [Construtor Estático](#construtor-estático-4)
        - [Executando a Verificação do Elemento Não Marcado](#executando-a-verificação-do-elemento-não-marcado)
        - [Exemplo de Uso](#exemplo-de-uso-13)
      - [❓ Question - IsEnabled](#-question---isenabled)
        - [Construtor Estático](#construtor-estático-5)
        - [Executando a Verificação do Elemento Habilitado](#executando-a-verificação-do-elemento-habilitado)
        - [Exemplo de Uso](#exemplo-de-uso-14)
      - [❓ Question - IsNotEnabled](#-question---isnotenabled)
        - [Construtor Estático](#construtor-estático-6)
        - [Executando a Verificação do Elemento Não Habilitado](#executando-a-verificação-do-elemento-não-habilitado)
        - [Exemplo de Uso](#exemplo-de-uso-15)
      - [❓ Question - IsVisible](#-question---isvisible)
        - [Construtor Estático](#construtor-estático-7)
        - [Executando a Verificação do Elemento Visível](#executando-a-verificação-do-elemento-visível)
        - [Exemplo de Uso](#exemplo-de-uso-16)
      - [❓ Question - IsNotVisible](#-question---isnotvisible)
        - [Construtor Estático](#construtor-estático-8)
        - [Executando a Verificação do Elemento Não Visível](#executando-a-verificação-do-elemento-não-visível)
        - [Exemplo de Uso](#exemplo-de-uso-17)

## 📃 Documentação do Arquivo de Configurações do Appium

O arquivo de configurações `appium.properties` é utilizado para configurar os testes automatizados em aplicativos Android usando a ferramenta Appium. Neste arquivo, você pode definir diversas propriedades que são usadas para estabelecer a comunicação com o dispositivo Android, além de configurar opções relacionadas aos relatórios gerados após a execução dos testes.

Aqui está a descrição detalhada de cada propriedade no arquivo `appium.properties`:

1. `appium.platform.name` (String - obrigatório): Indica a plataforma alvo dos testes. Para testes em dispositivos Android, o valor deve ser definido como "Android". Caso seja necessário realizar testes em dispositivos iOS, o valor deve ser alterado para "iOS".

2. `appium.adb.url` (String - obrigatório): Especifica o endereço IP ou host onde o servidor ADB (Android Debug Bridge) está sendo executado. Neste campo, você deve fornecer o endereço correto para que o Appium possa se conectar ao dispositivo Android.

3. `appium.adb.port` (Inteiro - obrigatório): Define o número da porta que será usado para a comunicação com o dispositivo Android por meio do ADB. O valor padrão geralmente é "4723", mas você pode alterá-lo se necessário.

4. `appium.android.appPath` (String - obrigatório): O caminho do arquivo APK (Android Package) do aplicativo Android que você deseja testar. Certifique-se de fornecer o caminho absoluto ou relativo correto para o arquivo APK.

5. `appium.android.appPackage` (String - obrigatório): O nome do pacote do aplicativo Android que será testado. Essa informação é usada pelo Appium para identificar o aplicativo correto no dispositivo.

6. `appium.android.appActivity` (String - obrigatório): O nome da atividade (Activity) principal do aplicativo Android. Essa atividade é iniciada quando o aplicativo é aberto e é necessária para direcionar o Appium para a tela inicial do aplicativo.

7. `report.name` (String - opcional): O nome que será atribuído ao relatório gerado após a execução dos testes. Isso ajuda a identificar e diferenciar vários relatórios de testes.

8. `report.title` (String - opcional): O título que será dado ao relatório de testes. Este campo pode ser usado para fornecer uma breve descrição ou resumo do conteúdo do relatório.

9. `report.theme` (String - opcional): Define o tema ou aparência do relatório gerado. As opções disponíveis geralmente são "dark" (escuro) e "light" (claro), permitindo que você escolha o estilo visual preferido para o relatório.

10. `api.Authorization` (String - opcional): Essa propriedade pode ser usada para fornecer detalhes de autorização ou autenticação para acessar APIs específicas durante a execução dos testes. O valor exato dependerá da API específica que você está utilizando.

**Observações**:
- As funcionalidades ainda não estão disponíveis para testes em dispositivos iOS. 
- Certifique-se de que todas as propriedades obrigatórias sejam fornecidas corretamente para garantir que o Appium possa se comunicar com o dispositivo Android e o aplicativo alvo.
- Os comentários no arquivo (`#`) são usados para fornecer informações e não afetam a execução do teste.
- Sempre verifique se o arquivo de configurações está corretamente formatado, sem espaços extras, erros de digitação ou problemas de sintaxe.


## 🧪 MobileBaseTest

A classe `MobileBaseTest` é a classe base para todos os testes automatizados em aplicações móveis. Ela permite a habilitação da funcionalidade de gravação de tela durante a execução dos testes por meio da extensão `ScreenRecordExtension`. Além disso, essa classe também estende `BaseTest` e inclui a extensão `SparkReportExtension`, que é responsável pela geração de relatórios HTML dos testes.


### 🧩 Extensões

A classe `MobileBaseTest` possui duas extensões importantes que fornecem recursos adicionais aos testes mobile:

1. `ScreenRecordExtension`: Essa extensão é responsável por habilitar a gravação de tela durante a execução dos testes. Ela captura a interação do teste com a aplicação móvel e salva o vídeo da gravação no diretório padrão de saída de testes do JUnit. Isso permite que você tenha evidências visuais das execuções de teste em aplicações móveis, facilitando a análise de falhas, depuração e documentação dos testes.

2. `SparkReportExtension`: Essa extensão estende as capacidades de geração de relatórios de teste com relatórios Spark em formato HTML. Com essa extensão, você pode gerar relatórios detalhados e visualmente atraentes dos resultados dos seus testes mobile. Os relatórios Spark fornecem informações valiosas sobre os testes executados, facilitando a identificação de pontos de falha e o acompanhamento do progresso dos testes.

### Utilização

Para habilitar a gravação de tela e a geração de relatórios Spark nos seus testes móveis, basta estender a classe `MobileBaseTest`.
Aqui está um exemplo de como fazer isso:

### Exemplo de Uso

```java
import org.junit.jupiter.api.Test;

public class MyMobileTest extends MobileBaseTest {

    @Test
    public void testMobileApp() {
        // Seus testes automatizados em aplicação móvel aqui
    }
}
```

Ao utilizar a classe `MobileBaseTest` como base para seus testes mobile autoMagicamente habilitará as extensões de gravação de tela e geração de relatórios, fornecendo uma poderosa combinação de recursos para melhorar a qualidade, eficiência e documentação dos seus testes automatizados em aplicações móveis. Os relatórios HTML gerados pela extensão `SparkReportExtension` fornecerão informações detalhadas e visuais sobre os resultados dos testes, ajudando você a tomar decisões mais informadas sobre a qualidade do software testado.


#### 🌐 BasePage

A classe `BasePage` é uma classe que inicializa os atributos `Locator` usando reflexão com base na classe que a invoca. É 
necessário que todas as classes de página estendam `BasePage` e que seja usado a anotação [@LocatorAnnotation](#LocatorAnnotation) para que o atributo seja inicializado.


##### Exemplo de Uso

Suponha que temos a seguinte classe que estende `BasePage`:

```java
public class LoginPage extends BasePage {

    @LocatorAnnotation(name = "username", androidLocator = @AndroidBy(id = "usernameId"), iOSLocator = @iOSBy(id = "usernameId"))
    Locator usernameLocator;

    @LocatorAnnotation(name = "password", androidLocator = @AndroidBy(id = "passwordId"), iOSLocator = @iOSBy(id = "passwordId"))
    Locator passwordLocator;

}
```

Ao extender `BasePage`, a classe `LoginPage` inclui um bloco estático que chama o método `initializeLocator(LoginPage.class)`. Esse método utiliza reflexão para inicializar os localizadores `usernameLocator` e `passwordLocator`, que foram especificados através da anotação `LocatorAnnotation`. Essa abordagem permite organizar e gerenciar os localizadores das páginas de forma mais estruturada, facilitando a manutenção dos testes.

### 📍 LocatorAnnotation

A anotação `LocatorAnnotation` permite especificar o nome e os localizadores para plataformas Android e iOS.
É utilizada para anotar campos em classes a fim de definir os localizadores para elementos específicos.

##### Atributos

A anotação `LocatorAnnotation` possui os seguintes atributos:

- `name`: O nome do localizador. Esse nome é usado para identificar o localizador nos logs.
- `androidLocator`: O localizador para a plataforma Android. Pode ser especificado usando a anotação [@AndroidBy](#AndroidBy).
- `iOSLocator`: O localizador para a plataforma iOS. Pode ser especificado usando a anotação [@iOSBy](#iOSBy).

##### Exemplo de Uso

```java
@LocatorAnnotation(name = "example", androidLocator = @AndroidBy(id = "exampleId"), iOSLocator = @iOSBy(id = "exampleId"))
Locator exampleLocator;
```

Neste exemplo, a anotação `LocatorAnnotation` é usada para definir o localizador `exampleLocator`, que possui o nome "example" e possui localizadores específicos para as plataformas Android e iOS.

A anotação `LocatorAnnotation` é útil para organizar e gerenciar os localizadores de elementos em classes de teste, permitindo que você especifique localizadores diferentes para cada plataforma de forma clara e concisa. Isso torna mais fácil a manutenção dos testes e permite a reutilização dos mesmos locators para testes em diferentes plataformas.

##### AndroidBy

A anotação AndroidBy é usada para especificar o localizador de elementos para a plataforma Android em testes automatizados com Appium. Essa anotação pode ser aplicada a campos de classes, como uma forma de definir o localizador para um elemento específico.

Atributos da Anotação
A anotação AndroidBy possui os seguintes atributos:

- uiAutomator (padrão: ""): Especifica o seletor de UI Automator para localizar o elemento.
- accessibility (padrão: ""): Especifica a descrição de acessibilidade do elemento.
- id (padrão: ""): Especifica o atributo "resource-id" do elemento.
- className (padrão: ""): Especifica o nome da classe do elemento.
- tagName (padrão: ""): Especifica o nome da tag do elemento.
- xpath (padrão: ""): Especifica a expressão XPath para localizar o elemento.
- priority (padrão: 0): Especifica a prioridade do localizador.

##### iOSBy

A anotação iOSBy é usada para especificar o localizador de elementos para a plataforma iOS em testes automatizados com Appium. Assim como a anotação AndroidBy, ela pode ser aplicada a campos de classes para definir o localizador para um elemento específico.

Atributos da Anotação
A anotação iOSBy possui os seguintes atributos:

- uiAutomator (padrão: ""): Especifica o seletor de UI Automator para localizar o elemento.
- accessibility (padrão: ""): Especifica a descrição de acessibilidade do elemento.
- id (padrão: ""): Especifica o atributo "resource-id" do elemento.
- className (padrão: ""): Especifica o nome da classe do elemento.
- tagName (padrão: ""): Especifica o nome da tag do elemento.
- xpath (padrão: ""): Especifica a expressão XPath para localizar o elemento.
- priority (padrão: 0): Especifica a prioridade do localizador.


## 🎭 MobileUser

A classe `MobileUser` representa um ator capaz de realizar ações em aplicações móveis durante a execução de testes automatizados. Essa classe é uma extensão da classe `Actor` e herda seu comportamento e atributos, porém, provê métodos e atributos adicionais especificamente direcionados para testes mobile.

### Atributos

- `name` (String): O nome do ator, identificando-o nas interações e resultados dos testes será mostrado no log do relatório de testes.
- `driver` (AppiumDriver): O driver Appium utilizado para interagir com a aplicação mobile.

### Construtor

O construtor da classe `MobileUser` é privado e deve ser acessado através do método estático `name(String name)` para criar uma instância do ator com o nome desejado.

### Métodos

- `name(String name)`: Método estático que cria e retorna uma instância de `MobileUser` com o nome fornecido.

- `cleanUp()`: Fecha o driver Appium e libera os recursos. Deve ser chamado após a conclusão dos testes para liberar os recursos utilizados pelo driver Appium.

- `resetApp()`: Reinicia a aplicação móvel para o estado inicial. O método fecha e reabre a aplicação, restaurando-a para o estado inicial.

- `canPerform(Ability<T> ability)`: Adquire uma habilidade  [Ability](#Ability) para o ator. Permite que o ator realize ações específicas durante os testes. Atualmente, a única habilidade disponível é a [MobileNavigateAbility](#MobileNavigateAbility), que permite que o ator navegue em aplicações móveis.

- `attemptTo(Task<T> task)`: Realiza uma tarefa ([Tasks](#tasks-mobile)) no contexto do ator. A tarefa representa uma ação específica a ser executada durante o teste.

- `ask(Question<T, ANSWER> question)`: Pergunta ao ator uma questão (question). As questões são usadas para obter informações de elementos da aplicação móvel durante os testes.
  

### Exemplo de Uso

```java
@Test
void navegar_para_Pagina_Main(){
// Criando uma instância de MobileUser
MobileUser mobileUser = MobileUser.name("Cléo");

// Adquirindo uma habilidade para navegar em aplicações móveis
mobileUser.canPerform(MobileNavigateAbility.ability());

// Executando uma tarefa mobile
mobileUser.attemptTo(Click.on(LoginPage.login)); // Clica no elemento localizado por LoginPage.login

// Fazendo uma pergunta mobile
boolean isVisible = mobileUser.ask(Visibility.of(MainPage.productsTitleLabel)); // Retorna um booleano indicando se o elemento está visível
Assert.assertTrue(isVisible);

// Reiniciando a aplicação móvel
mobileUser.resetApp(); // Fecha e reabre a aplicação no estado inicial

// Liberando recursos
mobileUser.cleanUp(); // Fecha o driver Appium
}
```

O `MobileUser` é essencial para a realização de testes automatizados em aplicações mobile, permitindo interações consistentes e garantindo a qualidade do software em diferentes dispositivos e ambientes.

### ⚙️ Ability Mobile
Representa uma habilidade que pode ser adquirida por um ator durante a execução de testes automatizados. As habilidades permitem que os atores realizem ações específicas durante os testes.

#### ⚙️ MobileNavigateAbility

A habilidade `MobileNavigateAbility` representa a habilidade de navegar em aplicações móveis. Essa habilidade é útil quando é necessário navegar entre telas de uma aplicação móvel durante a execução de testes automatizados.

##### Métodos Estáticos

A classe `MobileNavigateAbility` possui os seguintes métodos estáticos para configurar a navegação:

- `ability()` : Retorna uma instância de `MobileNavigateAbility` usada para definir a habilidade de navegação no ator.

 
## 🎯 Tasks Mobile

Representa uma tarefa que pode ser executada por um ator durante a execução de testes automatizados. As tarefas representam ações específicas a serem executadas durante os testes.

Aqui estão as informações detalhadas sobre as tasks disponíveis para [MobileUser](#MobileUser) e suas respectivas classes no projeto. As tasks representam ações que podem ser executadas por usuários mobile durante a execução de testes automatizados em aplicações mobile. Cada task é composta por uma ou mais interações, executadas sequencialmente na ordem em que foram adicionadas.


#### 🎯 Task - ClearNotifications

A task `ClearNotifications` representa a ação de limpar as notificações de um dispositivo móvel. Essa task é útil quando é necessário limpar as notificações antes ou durante a execução de um teste.

#####  Métodos Estáticos

A classe `ClearNotifications` possui o seguinte método estático para configurar a limpeza de notificações:

- `init()`: Inicializa a limpeza de notificações.

##### Executando a Limpeza de Notificações

A limpeza de notificações é executada chamando o método `perform(MobileUser mobileUser)`. Esse método limpará as notificações do dispositivo móvel.

##### Exemplo de Uso

Aqui está um exemplo completo de uso da classe `ClearNotifications`:

```java
@Test
void Limpar_Notificacoes(){
    //Limpa as notificações do dispositivo
    mobileUser.attemptTo(ClearNotifications.init());
}
```


https://github.com/CleoCordeiro/saucelabs-screemplay/assets/75858274/dd2604ab-aa75-49c5-b885-c03a11fcc14b


Neste exemplo, as notificações do dispositivo móvel serão limpas.

O `ClearNotifications` é útil para limpar as notificações do dispositivo móvel antes ou durante a execução de testes automatizados, garantindo que as notificações não interfiram nos testes.


#### 🎯 Task - Click

A task `Click` representa a ação de clicar em um elemento em uma aplicação mobile. Essa task é útil quando é necessário interagir com um elemento específico através de um clique.

##### Métodos Estáticos

A classe `Click` possui o seguinte método estático para configurar o clique:

- `on(Locator locator)`: Identifica o localizador do elemento a ser clicado.

##### Executando o Click

O `Click` é executado chamando o método `perform(MobileUser mobileUser)`. Esse método clicará no elemento identificado pelo localizador especificado.

##### Exemplo de Uso

Aqui está um exemplo completo de uso da classe `Click`:

```java
@Test
void Login_Sem_Informar_Credenciais() {
    // Clica no botão "LOGIN"
    mobileUser.attemptTo(Click.on(LoginPage.login));

     // Verifica se a mensagem de erro está visível, se não estiver, o teste falha
    mobileUser.shouldSeeThat(IsVisible.of(LoginPage.errorMessage));
}
```


https://github.com/CleoCordeiro/saucelabs-screemplay/assets/75858274/5a1a56aa-4314-43b0-8886-e52813e65e82

<video src="assets/ClickElement.mp4" controls title="ClickElement"></video>

Neste exemplo, o elemento representado pelo localizador `LoginPage.login` será clicado.

O `Click` é útil para interações simples em aplicações móveis, permitindo que você clique em elementos específicos para realizar testes automatizados mais abrangentes.

#### 🎯 Task - DragAndDrop

A task `DragAndDrop` representa a ação de realizar um arrastar e soltar em uma aplicação mobile. Essa tarefa é útil quando é necessário arrastar um elemento de uma posição para outra na tela.

##### Métodos Estáticos

A classe `DragAndDrop` possui os seguintes métodos estáticos:

- `from(Locator locator)`: Cria um objeto `DragAndDrop` para realizar a ação de arrastar um elemento a partir do localizador especificado.
- `to(Locator locator)`: Identifica o localizador do elemento para onde o arraste será realizado.

##### Executando o DragAndDrop

O `DragAndDrop` é executado chamando o método `perform(MobileUser mobileUser)`. Esse método realizará a ação de arrastar o elemento identificado pelo localizador `from` para a posição do elemento identificado pelo localizador `to`.

##### Exemplo de Uso

```java
@Test
void Adicionar_Produto_No_Carrinho_Arrastando_E_Soltando() {
    // Utilizando a tarefa Login para realizar o login, faz todo o processo de login
    mobileUser.attemptTo(Login.withCredentials("standard_user", "secret_sauce"));

    // Arrasta o elemento "dragCart" e solta no elemento "productsTitleLabel"
    mobileUser.attemptTo(DragAndDrop.from(MainPage.dragCart).to(MainPage.productsTitleLabel));

    // Verifica se o texto do elemento "cartItens" contém o texto "1", se não
    // contiver, o teste falha
    mobileUser.shouldSeeThat(ContainsText.of(MainPage.cartItens, "1"));
}
```


https://github.com/CleoCordeiro/saucelabs-screemplay/assets/75858274/5b011654-ace5-496f-85fc-b8fc3be6e931


<video src="assets/DragAndDrop.mp4" controls title="DragAndDrop"></video>

Neste exemplo, a ação de arrastar o elemento representado pelo localizador `MainPage.dragCart` para a posição do elemento representado pelo localizador `MainPage.productsTitleLabel` será realizada.

O `DragAndDrop` é útil para interações mais complexas em aplicações móveis, permitindo mover elementos na tela conforme necessário para realizar testes automatizados mais abrangentes.

#### 🎯 Task - InputText

A task `InputText` representa a ação de inserir um texto em um campo de texto em uma aplicação mobile. Essa task é útil quando é necessário preencher campos de texto com informações específicas.

##### Métodos Estáticos

A classe `InputText` possui os seguintes métodos estáticos para configurar o texto a ser inserido:

- `onField(Locator locator, String text)`: Especifica o localizador do campo de texto e o texto a ser inserido.

##### Executando a Inserção de Texto

O `InputText` é executada chamando o método `perform(MobileUser mobileUser)`. Esse método inserirá o texto especificado no campo de texto especificado.

##### Exemplo de Uso

Aqui está um exemplo completo de uso da classe `InputText`:

```java
@Test
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
```

https://github.com/CleoCordeiro/saucelabs-screemplay/assets/75858274/62ef46b7-bb2a-4a83-a026-d1587bf5c084

<video src="assets/ImputText.mp4" controls title="ImputText"></video>


Neste exemplo, o texto "standard_user" será inserido no campo de texto representado pelo localizador `LoginPage.username` e o texto "secret_sauce" será inserido no campo de texto representado pelo localizador `LoginPage.password`.


#### 🎯 Task - OpenDeepLink

A task `OpenDeepLink` representa a ação de abrir um deeplink em uma aplicação mobile. Essa tarefa é útil quando é necessário abrir um link específico que direciona para uma tela específica da aplicação.

##### Construtor Estático

A classe `OpenDeepLink` possui um construtor estático para criar um objeto `OpenDeepLink` com o deeplink especificado:

- `with(String deepLink)`: Cria um objeto `OpenDeepLink` com o deeplink fornecido.

##### Executando a Abertura do Deeplink

A abertura do deeplink é executada chamando o método `perform(MobileUser mobileUser)`. Esse método abrirá o deeplink especificado no navegador da aplicação.

##### Exemplo de Uso

```java
@Test
void DeepLink_Para_O_Primeiro_Produto() {
    // Abrindo o aplicativo diretamente na tela de detalhes do produto usando o
    // deeplink
    mobileUser.attemptTo(OpenDeepLink.with("swaglabs://swag-item/0"));

    // Verifica se o botão "Back to Products" está visível
    mobileUser.shouldSeeThat(IsVisible.of(DetailsProductPage.backToProducts));
}
```



https://github.com/CleoCordeiro/saucelabs-screemplay/assets/75858274/f43683bf-6bcf-4fca-ac58-1f1321736782


<video src="assets/DeepLink.mp4" controls title="DeepLink"></video>

Neste exemplo, a ação de abrir o deeplink "swaglabs://swag-item/0" será realizada no aplicativo móvel, direcionando para a tela do primeiro produto.

O `OpenDeepLink` é útil para testar fluxos específicos na aplicação, permitindo que você navegue diretamente para uma tela ou recurso específico usando o deeplink fornecido. Isso é especialmente útil em testes automatizados onde você deseja verificar o comportamento de telas específicas da aplicação.

#### 🎯 Task - ScreenShot

A task `ScreenShot` representa a ação de tirar um screenshot durante a execução de um teste automatizado em uma aplicação móvel. Essa tarefa é útil quando você precisa capturar uma imagem da tela para documentação, depuração ou registro de falhas.

##### Construtor Estático

A classe `ScreenShot` possui um construtor estático para criar um objeto `ScreenShot` com o nome do screenshot desejado:

- `take(String screenShotName)`: Cria um objeto `ScreenShot` com o nome especificado para o screenshot.

##### Executando a Captura do Screenshot

A captura do screenshot é executada chamando o método `perform(MobileUser mobileUser)`. Esse método tirará um screenshot da tela do aplicativo móvel em execução e salvará a imagem com o nome especificado no diretório "report/screenshots/" com a extensão ".png".

##### Exemplo de Uso

```java
MobileUser mobileUser = MobileUser.name("Cléo");

@Test
void Tirar_Uma_Screenshot_Da_Pagina_De_Detalhes_Do_Produto() {
    // Abrindo o aplicativo diretamente na tela de detalhes do produto usando o  deeplink
    mobileUser.attemptTo(OpenDeepLink.with("swaglabs://swag-item/0"));

    // Verifica se o botão "Back to Products" está visível
    mobileUser.shouldSeeThat(IsVisible.of(DetailsProductPage.backToProducts));

    // Tira uma screenshot da tela de detalhes do produto
    mobileUser.attemptTo(ScreenShot.take("detailsProductPage"));
}
```


https://github.com/CleoCordeiro/saucelabs-screemplay/assets/75858274/f0876b57-9d2b-438f-94cf-221f386e1c21



<video src="assets/Screenshot.mp4" controls title="Screenshot"></video>

Neste exemplo, a tarefa `ScreenShot` tirará um screenshot da tela do aplicativo móvel com o nome "detailsProductPage" e salvará a imagem no diretório "report/screenshots/" com a extensão ".png".

O `ScreenShot` é útil para capturar evidências visuais durante a execução de testes automatizados em aplicações móveis, o que facilita a identificação e solução de problemas e torna o relatório de testes mais informativo.

#### 🎯 Task - ScrollTo

A task `ScrollTo` representa a ação de realizar um scroll em uma aplicação mobile. Essa tarefa é útil quando é necessário rolar a tela para visualizar conteúdos que não estão imediatamente visíveis na tela atual.

##### Métodos Estáticos

A classe `ScrollTo` possui os seguintes métodos estáticos para configurar a direção do scroll:

- `up()`: Configura o scroll para cima.
- `down()`: Configura o scroll para baixo.
- `left()`: Configura o scroll para a esquerda.
- `right()`: Configura o scroll para a direita.

Esses métodos retornam uma instância de `ScrollTo`, que pode ser usada para adicionar outras configurações.

##### Configurações Adicionais

A classe `ScrollTo` também oferece métodos para adicionar configurações adicionais:

- `distance(int scrollDistance)`: Especifica a distância em pixels que o scroll deve percorrer. O valor padrão é 1000.
- `atLocator(Locator locator)`: Especifica o localizador do elemento para o qual o scroll deve ser realizado. O scroll será interrompido assim que o elemento estiver visível.
- `withPoint(int x, int y)`: Especifica a posição de partida do scroll, representada pelas coordenadas x e y em pixels.

##### Executando o Scroll

O scroll é executado chamando o método `perform(MobileUser mobileUser)`. Esse método realizará o scroll na direção e com as configurações especificadas.

##### Exemplo de Uso

Aqui está um exemplo completo de uso da classe `ScrollTo`:

```java
@Test
@DisplayName("CT01 - Scrollar até o produto Sauce Labs Onesie estar visível")
void Scrollar_Ate_O_Produto_Sauce_Labs_Onesie_Estar_Visivel() {
    
    // Utilizando a tarefa Login para realizar o login, faz todo o processo de login
    mobileUser.attemptTo(Login.withCredentials("standard_user", "secret_sauce"));

    // Scrolla até o elemento "sauceLabsOnesie" estar visível
    mobileUser.attemptTo(ScrollTo.up().distance(1000).atLocator(MainPage.sauceLabsOnesie));

    // Verifica se o elemento "sauceLabsOnesie" está visível, se não estiver, o
    // teste falha
    mobileUser.shouldSeeThat(IsVisible.of(MainPage.sauceLabsOnesie));

}
```

https://github.com/CleoCordeiro/saucelabs-screemplay/assets/75858274/c4d4c811-eb79-4240-a807-693e3cd6af1f

<video src="assets/ScrollToElement.mp4" controls title="ScrollToElement"></video>

Neste exemplo, o scroll será realizado para cima até que o elemento representado pelo localizador `MainPage.sauceLabsOnesie` esteja visível. A distância percorrida pelo scroll será de 1000 pixels a cada iteração.

O `ScrollTo` é útil para interações mais complexas em aplicações móveis, permitindo que você role a tela para visualizar elementos que não estão imediatamente visíveis.


#### 🎯 Task - WaitFor

A task `WaitFor` representa a ação de aguardar a visibilidade de um elemento em uma aplicação mobile. Essa tarefa é útil quando você precisa esperar que um elemento específico fique visível na tela antes de realizar outra ação.

##### Construtores Estáticos

A classe `WaitFor` possui dois construtores estáticos para criar um objeto `WaitFor` com o localizador do elemento e o tempo limite de espera especificados:

- `element(Locator locator)`: Cria um objeto `WaitFor` com o localizador do elemento e um tempo limite padrão de 10 segundos.
- `element(Locator locator, int timeoutInSeconds)`: Cria um objeto `WaitFor` com o localizador do elemento e um tempo limite personalizado em segundos para aguardar a visibilidade do elemento.

##### Executando a Espera pela Visibilidade do Elemento

A espera pela visibilidade do elemento é executada chamando o método `perform(MobileUser mobileUser)`. Esse método aguardará até que o elemento especificado seja visível na tela, respeitando o tempo limite definido.

##### Exemplo de Uso

```java
@Test
void Esperar_Pela_Visibilidade_Do_Botao_De_Login() {
MobileUser mobileUser = MobileUser.name("Cléo");
mobileUser.attemptsTo(WaitFor.element(LoginPage.login));
}
```

Neste exemplo, a tarefa `WaitFor` aguardará até que o elemento representado pelo localizador `LoginPage.login` esteja visível na tela, usando o tempo limite padrão de 10 segundos.

O `WaitFor` é útil para sincronizar as ações em testes automatizados, garantindo que o teste espere até que o elemento necessário esteja visível antes de realizar outras ações relacionadas. Isso ajuda a evitar erros intermitentes e torna os testes mais confiáveis.



## ❓Questions Mobile
As questions são usadas para obter informações de elementos da aplicação móvel durante os testes. Elas são úteis para validar informações de elementos e realizar verificações detalhadas nos resultados dos testes.

#### ❓ Question - ContainsText

A question `ContainsText` é utilizada para verificar se um elemento específico contém um texto específico em uma aplicação mobile. Essa question é útil quando você precisa validar se um elemento contém um texto específico.

##### Construtor Estático

A classe `ContainsText` possui um construtor estático para criar um objeto `ContainsText` com o localizador do elemento e o texto esperado especificados:

- `of(Locator locator, String expectedText)`: Cria um objeto `ContainsText` com o localizador do elemento e o texto esperado.

##### Executando a Verificação do Texto do Elemento

A verificação do texto do elemento é realizada chamando o método `answeredBy(MobileUser actor)`. Esse método verificará se o texto do elemento especificado corresponde ao texto esperado.

##### Exemplo de Uso

```java
MobileUser mobileUser = MobileUser.name("Cléo");
mobileUser.canPerform(MobileNavigateAbility.ability());
mobileUser.shouldSeeThat(ContainsText.of(HomePage.title, "Swag Labs")),
```

Neste exemplo, a question `ContainsText` verificará se o elemento representado pelo localizador `HomePage.title` contém o texto "Swag Labs". 
Se o texto não corresponder ao esperado, o teste falhará.

O `ContainsText` é útil para obter informações de elementos em testes automatizados, permitindo que você valide se o texto exibido corresponde ao esperado. Isso é especialmente útil para verificar conteúdos dinâmicos e realizar verificações detalhadas nos resultados dos testes.



#### ❓ Question - IsChecked

A question `IsChecked` é utilizada para verificar se um elemento específico está marcado em uma aplicação mobile. Essa question é útil quando você precisa validar se um checkbox ou radiobutton está marcado.

##### Construtor Estático

A classe `IsChecked` possui um construtor estático para criar um objeto `IsChecked` com o localizador do elemento especificado:

- `of(Locator locator)`: Cria um objeto `IsChecked` com o localizador do elemento.

##### Executando a Verificação do Elemento Marcado

```java	
MobileUser mobileUser = MobileUser.name("Cléo");
mobileUser.canPerform(MobileNavigateAbility.ability());
mobileUser.shouldSeeThat(IsChecked.of(HomePage.checkbox)),
```

Neste exemplo, a question `IsChecked` verificará se o elemento representado pelo localizador `HomePage.checkbox` está marcado. Se o elemento não estiver marcado, o teste falhará.

O `IsChecked` é útil para obter informações de elementos em testes automatizados, permitindo que você valide se um checkbox ou radiobutton está marcado. Isso é especialmente útil para verificar se os elementos estão marcados corretamente durante a execução dos testes.


#### ❓ Question - IsNotChecked

A question `IsNotChecked` é utilizada para verificar se um elemento específico não está marcado em uma aplicação mobile. Essa question é útil quando você precisa validar se um checkbox ou radiobutton não está marcado.

##### Construtor Estático

A classe `IsNotChecked` possui um construtor estático para criar um objeto `IsNotChecked` com o localizador do elemento especificado:

- `of(Locator locator)`: Cria um objeto `IsNotChecked` com o localizador do elemento.


##### Executando a Verificação do Elemento Não Marcado

A verificação do elemento não marcado é realizada chamando o método `answeredBy(MobileUser actor)`. Esse método verificará se o elemento especificado não está marcado.

##### Exemplo de Uso

```java
MobileUser mobileUser = MobileUser.name("Cléo");
mobileUser.canPerform(MobileNavigateAbility.ability());
mobileUser.shouldSeeThat(IsNotChecked.of(LoginPage.checkbox)),
```

Neste exemplo, a question `IsNotChecked` verificará se o elemento representado pelo localizador `LoginPage.checkbox` não está marcado. Se o elemento estiver marcado, o teste falhará.

O `IsNotChecked` é útil para obter informações de elementos em testes automatizados, permitindo que você valide se um checkbox ou radiobutton não está marcado. Isso é especialmente útil para verificar se os elementos estão marcados corretamente durante a execução dos testes.


#### ❓ Question - IsEnabled

A question `IsEnabled` é utilizada para verificar se um elemento específico está habilitado em uma aplicação mobile. Essa question é útil quando você precisa validar se um elemento está habilitado.

##### Construtor Estático

A classe `IsEnabled` possui um construtor estático para criar um objeto `IsEnabled` com o localizador do elemento especificado:

- `of(Locator locator)`: Cria um objeto `IsEnabled` com o localizador do elemento.

##### Executando a Verificação do Elemento Habilitado

A verificação do elemento habilitado é realizada chamando o método `answeredBy(MobileUser actor)`. Esse método verificará se o elemento especificado está habilitado.

##### Exemplo de Uso

```java
MobileUser mobileUser = MobileUser.name("Cléo");
mobileUser.canPerform(MobileNavigateAbility.ability());
mobileUser.shouldSeeThat(IsEnabled.of(LoginPage.LoginButton)),
```

Neste exemplo, a question `IsEnabled` verificará se o elemento representado pelo localizador `LoginPage.LoginButton` está habilitado. Se o elemento não estiver habilitado, o teste falhará.

O `IsEnabled` é útil para obter informações de elementos em testes automatizados, permitindo que você valide se um elemento está habilitado. Isso é especialmente útil para verificar se os elementos estão habilitados corretamente durante a execução dos testes.


#### ❓ Question - IsNotEnabled

A question `IsNotEnabled` é utilizada para verificar se um elemento específico não está habilitado em uma aplicação mobile. Essa question é útil quando você precisa validar se um elemento não está habilitado.

##### Construtor Estático

A classe `IsNotEnabled` possui um construtor estático para criar um objeto `IsNotEnabled` com o localizador do elemento especificado:

- `of(Locator locator)`: Cria um objeto `IsNotEnabled` com o localizador do elemento.


##### Executando a Verificação do Elemento Não Habilitado

A verificação do elemento não habilitado é realizada chamando o método `answeredBy(MobileUser actor)`. Esse método verificará se o elemento especificado não está habilitado.

##### Exemplo de Uso

```java
MobileUser mobileUser = MobileUser.name("Cléo");
mobileUser.canPerform(MobileNavigateAbility.ability());
mobileUser.shouldSeeThat(IsNotEnabled.of(LoginPage.LoginButton)),
```

Neste exemplo, a question `IsNotEnabled` verificará se o elemento representado pelo localizador `LoginPage.LoginButton` não está habilitado. Se o elemento estiver habilitado, o teste falhará.

O `IsNotEnabled` é útil para obter informações de elementos em testes automatizados, permitindo que você valide se um elemento não está habilitado. Isso é especialmente útil para verificar se os elementos estão habilitados corretamente durante a execução dos testes.


#### ❓ Question - IsVisible

A question `IsVisible` é utilizada para verificar se um elemento específico está visível em uma aplicação mobile. Essa question é útil quando você precisa validar se um elemento está visível.

##### Construtor Estático

A classe `IsVisible` possui um construtor estático para criar um objeto `IsVisible` com o localizador do elemento especificado:

- `of(Locator locator)`: Cria um objeto `IsVisible` com o localizador do elemento.


##### Executando a Verificação do Elemento Visível

A verificação do elemento visível é realizada chamando o método `answeredBy(MobileUser actor)`. Esse método verificará se o elemento especificado está visível.

##### Exemplo de Uso

```java
MobileUser mobileUser = MobileUser.name("Cléo");
mobileUser.canPerform(MobileNavigateAbility.ability());
mobileUser.shouldSeeThat(IsVisible.of(LoginPage.LoginButton)),
```

Neste exemplo, a question `IsVisible` verificará se o elemento representado pelo localizador `LoginPage.LoginButton` está visível. Se o elemento não estiver visível, o teste falhará.

O `IsVisible` é útil para obter informações de elementos em testes automatizados, permitindo que você valide se um elemento está visível. Isso é especialmente útil para verificar se os elementos estão visíveis corretamente durante a execução dos testes.


#### ❓ Question - IsNotVisible

A question `IsNotVisible` é utilizada para verificar se um elemento específico não está visível em uma aplicação mobile. Essa question é útil quando você precisa validar se um elemento não está visível.

##### Construtor Estático

A classe `IsNotVisible` possui um construtor estático para criar um objeto `IsNotVisible` com o localizador do elemento especificado:

- `of(Locator locator)`: Cria um objeto `IsNotVisible` com o localizador do elemento.


##### Executando a Verificação do Elemento Não Visível

A verificação do elemento não visível é realizada chamando o método `answeredBy(MobileUser actor)`. Esse método verificará se o elemento especificado não está visível.

##### Exemplo de Uso

```java
MobileUser mobileUser = MobileUser.name("Cléo");
mobileUser.canPerform(MobileNavigateAbility.ability()); 
mobileUser.shouldSeeThat(IsNotVisible.of(LoginPage.LoginButton)),
```

Neste exemplo, a question `IsNotVisible` verificará se o elemento representado pelo localizador `LoginPage.LoginButton` não está visível. Se o elemento estiver visível, o teste falhará.

O `IsNotVisible` é útil para obter informações de elementos em testes automatizados, permitindo que você valide se um elemento não está visível. Isso é especialmente útil para verificar se os elementos estão visíveis corretamente durante a execução dos testes.
