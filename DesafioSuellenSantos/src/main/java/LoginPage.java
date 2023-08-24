import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;


    }
    public void preencherEmail(String email) {
        driver.findElement(By.name("email")).sendKeys(email);
    }

    public void preencherSenha(String senha) {
        driver.findElement(By.name("password")).sendKeys(senha);
    }

    public void clicarBotaoLogin(){
        driver.findElement(By.cssSelector("button.style__ContainerButton-sc-1wsixal-0.ihdmxA.button__child")).click();
    }
    public void clicarBotaoRegistrar() {
        driver.findElement(By.cssSelector("button.style__ContainerButton-sc-1wsixal-0.ihdmxA.button__child")).click();
    }
}
