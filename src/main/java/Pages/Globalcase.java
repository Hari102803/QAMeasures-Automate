package Pages;

import Config.DriverManager;
import Config.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Globalcase extends DriverManager {

  public Globalcase(WebDriver driver) {
    DriverManager.driver = driver;
  }

  @Override
  public void OthersClickservice() throws InterruptedException {
    super.OthersClickservice();
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
  }

  public void Globalcaseclick() {
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    driver.findElement(Locators.GLOBAL_CASE)
        .click();

    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    WebElement organize = driver.findElement(Locators.ORGANIZATION_DROP);
    organize.click();
    Select organizedrop = new Select(organize);
    organizedrop.selectByIndex(1);

    if (organize.isSelected()) {
      driver.manage()
          .timeouts()
          .implicitlyWait(Duration.ofSeconds(8));
      WebElement facility = driver.findElement(Locators.GLOBAL_FACILITY);
      facility.click();
      Select facilitydrop = new Select(facility);
      facilitydrop.selectByIndex(2);

      if (facility.isSelected()) {
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        WebElement site = driver.findElement(Locators.GLOBAL_SITE);
        site.click();
        Select sitedrop = new Select(site);
        sitedrop.selectByIndex(1);

        if (site.isSelected()) {
          driver.manage()
              .timeouts()
              .implicitlyWait(Duration.ofSeconds(8));
          driver.findElement(Locators.GLOBAL_SURGEON)
              .click();
          List<WebElement> surgeonlist = driver.findElements(Locators.GLOBAL_SURGEON_DROPDOWN);
          for (WebElement surgeonslist : surgeonlist) {
            if (surgeonslist.getText()
                .equals("ALLEN, AGAPAY")) {
              surgeonslist.click();
              break;
            }
          }
        }
      }
    }
    if (organize.isSelected()) {
      driver.manage()
          .timeouts()
          .implicitlyWait(Duration.ofSeconds(8));
      driver.findElement(Locators.GLOBAL_SUBMIT_BTN)
          .click();

      driver.findElement(Locators.GLOBAL_CLEAR_BTN)
          .click();
    }
  }

  public void Globalclose() {
    driver.findElement(Locators.GLOBAL_CLOSE_BTN)
        .click();
  }
}
