package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Homepage {

    WebDriver driver;
    WebDriverWait wait;

    By LinkQA = By.xpath("//span[normalize-space(text())='QA Measures']");


    public Homepage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(8));
    }

    public void QALink() {
       driver.findElement(LinkQA).click();
    }


}


