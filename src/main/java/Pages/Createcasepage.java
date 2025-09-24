package Pages;

import Config.DriverManager;
import Config.Locators;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import Services.Createacase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static Config.config.*;

public class Createcasepage extends DriverManager {
  public Createcasepage(WebDriver driver) {
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
    Createacase caseData = new Createacase(driver);
    WebElement OBsite = driver.findElement(Locators.OB_TOGGLE);
    WebElement ORsite = driver.findElement(Locators.OR_TOGGLE);
    if (ORsite.isEnabled()) {
      super.OthersClickservice();
      Addcaseclick(true);
      caseData.CreateORdata(FIRST_DATA, LAST_DATA, DATE);
      caseData.ButtonsORclick();
    }
    else if (OBsite.isDisplayed()) {
      super.OthersClickservice();
      Addcaseclick(false);
      caseData.CreateOBData(FIRST_DATA, LAST_DATA, DATE);

    }
  }

  public void Addcaseclick(boolean isOR) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    if (isOR) {
      WebElement addCaseBtn = wait.
          until(ExpectedConditions.elementToBeClickable(Locators.ADD_CASE_OR_SITE));
      addCaseBtn.click();
    }
    else {
      WebElement addCaseBtn = wait.
          until(ExpectedConditions.elementToBeClickable(Locators.ADD_CASE_OB_SITE));
      addCaseBtn.click();
    }
  }

  public void Addcloseclick() {
    driver.findElement(Locators.ADD_CASE_CLOSE_BTN)
        .click();
  }
}
