package Pages;

import Config.DriverManager;
import Config.Locators;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Gasshifthistory extends DriverManager {

  public Gasshifthistory(WebDriver driver) {
    DriverManager.driver = driver;
  }

  @Override
  public void OthersClickservice() throws InterruptedException {
    super.OthersClickservice();
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
  }
  public void gasshifthistorryclick() {

    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    driver.findElement(Locators.GAS_HISTORY)
        .click();
  }

  public void GashifttabsClick() {
    try {
      driver.manage()
          .timeouts()
          .implicitlyWait(Duration.ofSeconds(8));
      WebElement transfer = driver.findElement(Locators.TRANSFER_TAB);
      if (transfer.isEnabled()) {
        WebElement pagenumber = driver.findElement(Locators.PAGINATION_NUMBER);
        pagenumber.click();
        if (pagenumber.isEnabled()) {
          driver.findElement(Locators.PREVIOUS_LINK)
              .click();
        }
      }
      else {
        System.out.println("No pages are displayed");
      }
      driver.manage()
          .timeouts()
          .implicitlyWait(Duration.ofSeconds(8));
      WebElement Swap = driver.findElement(Locators.SWAP_TAB);
      Swap.click();
      if (Swap.isEnabled()) {
        WebElement pagenumber = driver.findElement(Locators.PAGINATION_NUMBER);
        pagenumber.click();
        if (pagenumber.isEnabled()) {
          driver.findElement(Locators.PREVIOUS_LINK)
              .click();
        }
      }
      else {
        System.out.println("No pages are displayed");
      }

      driver.manage()
          .timeouts()
          .implicitlyWait(Duration.ofSeconds(8));
      WebElement share = driver.findElement(Locators.SHARE_TAB);
      share.click();
      if (share.isEnabled()) {
        WebElement pagenumber = driver.findElement(Locators.PAGINATION_NUMBER);
        pagenumber.click();
        if (pagenumber.isEnabled()) {
          driver.findElement(Locators.PREVIOUS_LINK)
              .click();
        }
      }
      else {
        System.out.println("No pages are displayed");
      }

      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      WebElement missingQa = wait.until(ExpectedConditions.elementToBeClickable(Locators.MISSING_QA_TAB));
      missingQa.click();
    } catch (ElementClickInterceptedException e) {
      System.out.println(e);
    }
  }

  public void Historybackbtn() {
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    driver.findElement(Locators.GAS_HISTORY_BACK_BTN)
        .click();
  }
}



