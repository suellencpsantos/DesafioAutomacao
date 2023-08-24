import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class PageIdentifier {
        private WebDriver driver;

        public PageIdentifier(WebDriver driver) {
            this.driver = driver;
        }

        public boolean isLoginPage() {
            return driver.findElement(By.className("card__login")).isDisplayed();
        }

        public boolean isRegisterPage() {
            return driver.findElement(By.className("card__register")).isDisplayed();
        }

        public boolean isModalPage() {
            return driver.findElement(By.className("styles__Container-sc-8zteav-0 eaPGNe")).isDisplayed();
        }
    }