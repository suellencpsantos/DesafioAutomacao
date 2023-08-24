import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ModalPage {
    private WebDriver driver;

    public ModalPage(WebDriver driver) {
        this.driver = driver;
    }

    public void IdentificadorPagina() {
      //  driver.findElement(By.className("styles__ContainerCloseButton-sc-8zteav-2 ffzYTz"));
    }

    public void ClicarBotaoFechar() {
        WebElement botaoFechar = driver.findElement(By.xpath("//*[@id=\"btnCloseModal\"]"));
        botaoFechar.click();
    }
}
