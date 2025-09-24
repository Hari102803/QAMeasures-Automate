package Pages;

import Config.DriverManager;
import Config.Locators;
import Config.config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;

public class AddShift extends DriverManager {

  public AddShift(WebDriver driver) {
    DriverManager.driver = driver;
  }
  @Override
  public void OthersClickservice() throws InterruptedException {
    super.OthersClickservice();
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
  }
  @Override
  public void Gascalendarservice() {
    super.Gascalendarservice();
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(10));
  }

  public void Addshiftclick(String fromDate, String fromtime, String Todate, String Totime) {

    driver.findElement(Locators.ADD_SHIFT)
        .click();
    //Search Optional
//        driver.findElement(providersearch).sendKeys("test_ob");

    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(10));
    WebElement provider = driver.findElement(Locators.PROVIDER_INPUT);
    provider.click();

    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(10));
    WebElement providerdrops = driver.findElement(Locators.PROVIDER_DROPDOWN);
    providerdrops.click();

    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    driver.findElement(Locators.PROCEDURE_INPUT)
        .click();
    WebElement facility = driver.findElement(Locators.PROCEDURE_DROPDOWN);
    facility.click();

    if (facility.isDisplayed()) {
      driver.manage()
          .timeouts()
          .implicitlyWait(Duration.ofSeconds(8));
      driver.findElement(Locators.POSITION_INPUT)
          .click();

      WebElement position = driver.findElement(Locators.POSITION_DROPDOWN);
      position.click();
    }
    else {
      System.out.println(config.NOT_SELECT_VALIDATION);
    }
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    driver.findElement(Locators.FROM_DATE_INPUT)
        .sendKeys(fromDate, fromtime);

    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    driver.findElement(Locators.TO_DATE_INPUT)
        .sendKeys(Todate, Totime);

    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    driver.findElement(Locators.ADD_BTN)
        .click();

    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    driver.findElement(Locators.CLEAR_BTN)
        .click();

  }

  public void addshiftclose() {
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(10));
    WebElement close = driver.findElement(Locators.ADD_SHIFT_CLOSE_BTN);
    close.click();
    if (close.isEnabled()) {
      System.out.println(config.ADD_SHIFT_CLOSE_MODEL);
    }
    else {
      System.out.println(config.POPUP_NOT_SELECT_VALIDATION);
    }
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(Locators.BACK_BTN)
        .click();
  }

}


