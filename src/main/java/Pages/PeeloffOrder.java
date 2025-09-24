package Pages;

import Config.DriverManager;
import Config.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.NoSuchElementException;

public class PeeloffOrder extends DriverManager {

  public PeeloffOrder(WebDriver driver) {
    DriverManager.driver = driver;
  }

  @Override
  public void OthersClickservice() throws InterruptedException {
    super.OthersClickservice();
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
  }

  public void Peelofforderclick(String filterdate) throws NoSuchElementException {
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    driver.findElement(Locators.PEEL_OFF_ORDER)
        .click();

    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    driver.findElement(Locators.ORDER_FACILITY)
        .click();
    WebElement Facilitylist = driver.findElement(Locators.ORDER_FACILITY_DROP);
    Facilitylist.click();
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    WebElement time = driver.findElement(Locators.SEARCH_DATE);
    time.clear();
    time.sendKeys(filterdate);

    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    driver.findElement(Locators.ORDER_SUBMIT)
        .click();
  }

  public void orderclose() {
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    driver.findElement(Locators.ORDER_BACK_BTN)
        .click();

  }
}
