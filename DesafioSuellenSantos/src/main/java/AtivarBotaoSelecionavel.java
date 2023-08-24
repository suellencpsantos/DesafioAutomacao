import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AtivarBotaoSelecionavel {

    public void ativarBotao(WebDriver driver) {

        WebElement toggleElement = driver.findElement(By.id("toggleAddBalance"));
        toggleElement.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
