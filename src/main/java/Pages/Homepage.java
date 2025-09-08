package Pages;

import Utils.Main;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Homepage extends Main {

    WebDriverWait wait;

    public Homepage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(8));
    }

    public void QALink() {

        driver.findElement(LinkQA).click();
    }


}


