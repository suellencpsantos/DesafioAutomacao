import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        String urlBugBank = "https://bugbank.netlify.app/";

        // Nome de usuário e senha para o login
        String email = "";
        String name = "";
        String password = "";
        String passwordconf = "";
        String selecionar ="";

        // Configurar o caminho para o executável do ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:/chrome/chromedriver.exe");

        // Inicializar o ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navegar para a página de login do Bug Bank
        driver.get(urlBugBank);

        // Realizar o login no Bug Bank
        TesteBugBank testeBugBank = new TesteBugBank();
        testeBugBank.realizarTransferencia(driver,email,name,password,passwordconf,selecionar);

    }
}
