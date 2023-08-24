import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

public class TesteBugBank {

    @Before
    public static void main(String[] args) {
        // Definir o caminho do driver do Chrome
        System.setProperty("webdriver.chrome.driver", "C:/Users/suellen.santos/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");

        // Configurar as opções do Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        // Inicializar o WebDriver do Chrome
        WebDriver driver = new ChromeDriver(options);

        // Abrir a página do BugBank
        driver.get("https://bugbank.netlify.app/");

        // Aguardar até 10 segundos para os elementos carregarem
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        realizarTransferencia(driver, "abcd@gmail.com", "abcd", "123", "123", "selecionar");
    }

    @Test

    public static void realizarTransferencia(WebDriver driver, String email, String name, String password, String passwordconf, String selecionar) {

        PageIdentifier pageIdentifier = new PageIdentifier(driver);

        if (pageIdentifier.isLoginPage()) {
            RegisterPage registerPage = new RegisterPage(driver);
            registerPage.clicarBotaoRegistrar();
        }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (pageIdentifier.isRegisterPage()) {
                RegisterPage registerPage = new RegisterPage(driver);
                //ModalPage modalPage = new ModalPage(driver);
                registerPage.preencherEmail(email);
                registerPage.preencherName(name);
                registerPage.preencherSenha(password);
                registerPage.preencherConfirmaSenha(passwordconf);
                registerPage.clicarBotaoCriarContaSaldo();
                registerPage.clicarBotaoCadastrar();
                //System.out.println("Chamando ClicarBotaoFechar()");
                //modalPage.ClicarBotaoFechar();
            }
        //System.out.println("Chamando ClicarBotaoFechar()");
        ModalPage modalPage = new ModalPage(driver);
        modalPage.ClicarBotaoFechar();
        }
    }