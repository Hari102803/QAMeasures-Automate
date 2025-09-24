package Pages;

import Config.DriverManager;
import Config.Locators;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static Config.DriverManager.driver;


public class Homepage{

  WebDriverWait wait;

  public Homepage(WebDriver driver) {
    DriverManager.driver = driver;
    this.wait = new WebDriverWait(driver, Duration.ofSeconds(8));
  }

  public void QALink() {

    driver.findElement(Locators.LINK_QA)
        .click();
  }

}


