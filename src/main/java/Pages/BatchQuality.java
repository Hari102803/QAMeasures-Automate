package Pages;

import Config.DriverManager;
import Config.Locators;
import Config.config;
import Services.BatchQualitycase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BatchQuality extends DriverManager {

  public BatchQuality(WebDriver driver) {
    DriverManager.driver = driver;
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(5));
  }
  @Override
  public void OthersClickservice() throws InterruptedException {
    WebElement OBsite = driver.findElement(Locators.OB_TOGGLE);
    WebElement ORsite = driver.findElement(Locators.OR_TOGGLE);
    if (OBsite.isDisplayed()) {
      ORsite.click();
    }
    else if (ORsite.isDisplayed()) {
      batchqulaityclick();
    }
    super.OthersClickservice();
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
  }

  public void batchqulaityclick() throws InterruptedException {
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    driver.findElement(Locators.BATCH)
        .click();

    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    WebElement facilitychoose = driver.findElement(Locators.BATCH_FACILITY);
    facilitychoose.click();

    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    Select batchfacilitychoose = new Select(facilitychoose);
    batchfacilitychoose.selectByIndex(1);
  if(facilitychoose.isDisplayed()){
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    WebElement submit = driver.findElement(Locators.BATCH_SUBMIT_BTN);
    submit.click();
    if(submit.isDisplayed()){
      BatchQualitycase Quality = new  BatchQualitycase(driver);
      Quality.Endocaseclick();
      }
    }
  }
  public void batchclosebtn() {
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement closeBtn = wait.until(ExpectedConditions.elementToBeClickable(Locators.BATCH_CLOSE_POPUP));
    closeBtn.click();
    if (closeBtn.isEnabled()) {
      System.out.println(config.BATCH_QUALITY_VALIDATION);
    }
    else {
      System.out.println(config.NOT_CLOSE_BATCH_VALIDATION);
    }
  }
}
