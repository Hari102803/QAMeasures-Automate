package Pages;


import Config.DriverManager;
import Config.Locators;
import Config.config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Transfercasepage extends DriverManager {

  public Transfercasepage(WebDriver driver) {
    DriverManager.driver = driver;
  }

  @Override
  public void choosefacility() {
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    super.choosefacility();
  }

  @Override
  public void OthersClickservice() throws InterruptedException {
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    super.OthersClickservice();
  }

  public void Transfercaseclick() {
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    WebElement Transfercase = driver.findElement(Locators.TRANSFER_CASE);
    Transfercase.click();
    if (Transfercase.isDisplayed()) {
      System.out.println(config.TRANSFER_CASE_VALIDATION);
    }
  }

  public void Transferclosebtn() {
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    WebElement transferclose = driver.findElement(Locators.TRANSFER_CLOSE_BTN);
    transferclose.click();
  }
}
