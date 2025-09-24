package Pages;


import Config.DriverManager;
import Config.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class EmptyShiftpage extends DriverManager{

  public EmptyShiftpage(WebDriver driver) {
    DriverManager.driver = driver;

  }
  @Override
  public void OthersClickservice() throws InterruptedException {
    super.OthersClickservice();
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
  }

  public void Emptyshiftclick() {
    driver.findElement(Locators.EMPTY_SHIFT)
        .click();
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
  }

  public void Emptyshiftfacilty() {
    WebElement shiftfacility = driver.findElement(Locators.EMPTY_SHIFT_SELECT);
    shiftfacility.click();
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    Select choosefacility = new Select(shiftfacility);
    choosefacility.selectByIndex(1);
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    if (shiftfacility.isSelected()) {
      driver.findElement(Locators.EMPTY_SHIFT_CLEAR)
          .click();
    }

  }

  public void Closeclick() {
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    driver.findElement(Locators.EMPTY_CLOSE)
        .click();
  }

}
