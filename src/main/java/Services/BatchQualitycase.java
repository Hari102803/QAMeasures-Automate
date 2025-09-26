package Services;

import Config.DriverManager;
import Config.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Config.DriverManager.driver;

public class BatchQualitycase {

  public BatchQualitycase(WebDriver driver) {
    DriverManager.driver = driver;

  }
  public void Endocaseclick() throws InterruptedException {
    Thread.sleep(1000);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement caseCheckbox = wait.until(ExpectedConditions.elementToBeClickable((Locators.Case_Quality)));
    caseCheckbox.click();
    if(caseCheckbox.isSelected()){
      driver
          .manage()
          .timeouts()
          .implicitlyWait(Duration.ofSeconds(10));

      WebElement completeQA = driver.findElement(Locators.QUALITY_COMPLETEQA);
      completeQA.click();
      if(completeQA.isDisplayed()){
        driver
            .manage()
            .timeouts()
            .implicitlyWait(Duration.ofSeconds(10));
        QAflow flow = new QAflow(driver);
        flow.BatchQualityQAflow();

        //driver.findElement(Locators.QA_BACK_BTN).click();
      }
    }
  }
}
