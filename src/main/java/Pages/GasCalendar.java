package Pages;

import Config.DriverManager;
import Config.Locators;
import Config.config;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class GasCalendar extends DriverManager {

  public GasCalendar(WebDriver driver) {

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
        .implicitlyWait(Duration.ofSeconds(8));
  }

  public void GasUIbuttonclick() {
    driver.findElement(Locators.NEXT_BTN)
        .click();
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    driver.findElement(Locators.MONTH_VIEW_BTN)
        .click();
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    driver.findElement(Locators.WEEK_VIEW_BTN)
        .click();
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    driver.findElement(Locators.DAY_VIEW_BTN)
        .click();
  }

  public void filterclick(String Filtervalue, String providervalue) {
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(25));
    WebElement toggle = driver.findElement(Locators.ALL_TOGGLE);
    //toggle.click();
    if (toggle.isSelected()) {
      driver.findElement(Locators.GAS_FILTER)
          .click();
    }
    else {
      System.out.println(config.PROVIDER_VALIDATION);
    }
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(40));

    WebElement facilitydropdown = driver.findElement(Locators.FILTER_FACILITY_DROPDOWN);
    facilitydropdown.click();
    facilitydropdown.sendKeys(Filtervalue + Keys.ENTER);

    if (facilitydropdown.isSelected()) {
      driver.findElement(Locators.FACILITY_DROPDOWN_CLEAR_BTN)
          .click();
    }

    WebElement providerdropdown = driver.findElement(Locators.FILTER_PROVIDER_DROPDOWN);
    providerdropdown.click();
    providerdropdown.sendKeys(providervalue + Keys.ENTER);

    if (providerdropdown.isSelected()) {
      driver.findElement(Locators.PROVIDER_DROPDOWN_CLEAR_BTN)
          .click();
    }

    driver.findElement(Locators.FILTER_CLEAR_BTN)
        .click();
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(10));

    driver.findElement(Locators.FILTER_CLOSE_BTN)
        .click();
  }

  public void Moreshiftclick() {

    WebElement monthview = driver.findElement(Locators.MONTH_VIEW_BTN);
    monthview.click();
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(1500));
    driver.findElement(Locators.PREVIOUS_BTN)
        .click();
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(1500));
    if (monthview.isSelected()) {
      driver.findElement(Locators.MORE_SHIFT)
          .click();
    }
    else {
      System.out.println(config.MORE_SHIFT_VALIDATION);
    }
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(Locators.BACK_BTN)
        .click();
  }

}
