package Pages;

import Config.DriverManager;
import Config.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class GasShift extends DriverManager  {

  public GasShift(WebDriver driver) {
    DriverManager.driver = driver;
  }

  @Override
  public void OthersClickservice() throws InterruptedException {
    super.OthersClickservice();
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
  }
  public void Gasshiftclick(String fromdate, String todate) {

    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    driver.findElement(Locators.GAS_SHIFT)
        .click();

    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    driver.findElement(Locators.FROM_SHIFT)
        .sendKeys(fromdate);

    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    driver.findElement(Locators.TO_SHIFT)
        .sendKeys(todate);

    WebElement facility = driver.findElement(Locators.GAS_FACILITIES);
    facility.click();
    Select facilityselect = new Select(facility);
    facilityselect.selectByIndex(1);

    WebElement shift = driver.findElement(Locators.SHIFT_DROPDOWN);
    shift.click();
    Select shiftselect = new Select(shift);
    shiftselect.selectByIndex(1);

    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    WebElement submit = driver.findElement(Locators.GAS_SUBMIT);
    submit.click();

    if (submit.isEnabled()) {
      driver.findElement(Locators.GAS_CLEAR)
          .click();
    }
    driver.findElement(Locators.GAS_SHIFT_CLOSE_BTN)
        .click();
  }
}