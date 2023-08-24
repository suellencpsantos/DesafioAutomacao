import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class RegisterPage {
    private WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherEmail(String email) {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/form/div[2]/input")).sendKeys(email);
    }

    public void preencherName(String name) {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/form/div[3]/input")).sendKeys(name);
    }

    public void preencherSenha(String password) {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/form/div[4]/div/input")).sendKeys(password);
    }

    public void preencherConfirmaSenha(String passwordconf) {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/form/div[5]/div/input")).sendKeys(passwordconf);
    }

    public void clicarBotaoRegistrar() {
        driver.findElement(By.cssSelector("button.style__ContainerButton-sc-1wsixal-0.ihdmxA.button__child")).click();
    }

    public void clicarBotaoCadastrar() {
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/form/button")).click();
    }

    public void clicarBotaoCriarContaSaldo() {

        WebElement botaoCadastrar = driver.findElement(By.cssSelector(".styles__Container-sc-1pngcbh-0.kIwoPV"));
        Actions actions = new Actions(driver);
        int xOffset = 0;
        int yOffset = 0;
        actions.moveToElement(botaoCadastrar, xOffset, yOffset).click().perform();

        try {

            if (botaoCadastrar.isDisplayed()) {
                WebDriverWait wait = new WebDriverWait(driver, 30); // Aguarda por até 10 segundos
                WebElement botaoCadastrarr = driver.findElement(By.xpath("//button[@class='style__ContainerButton-sc-1wsixal-0 CMabB button__child']"));
                wait.until(ExpectedConditions.elementToBeClickable(botaoCadastrar));
                botaoCadastrarr.click();
            } else {
                System.out.println("erro");
            }
        } catch (Exception error) {
            // aqui gera o log de erro, caso aconteça
            System.out.println(error);
        }
    }

    public void ClicarBotaoFechar() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.findElement(By.id("btnCloseModal")).click();

        }
    }