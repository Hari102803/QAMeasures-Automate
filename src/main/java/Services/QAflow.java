package Services;

import Config.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.List;
import static Config.DriverManager.driver;

public class QAflow extends Createacase {

  public QAflow(WebDriver driver) {
    super(driver);
  }
  public void ORsiteQAflowYES() throws InterruptedException {
    Thread.sleep(1000);
    WebElement AdverseYes = driver.findElement(Locators.ADVERSE_YES);
    AdverseYes.click();
    WebElement AdverseNO = driver.findElement(Locators.ADVERSE_NO);
    AdverseYes.click();

    if(AdverseYes.isSelected()){
      List<WebElement> Adverselist = driver
          .findElements(Locators.ADVERSE_EVENT_LIST);

        for(WebElement Adverselistvalue : Adverselist) {
          if (Adverselistvalue.getText()
              .equalsIgnoreCase("Code Arrest")) {
            Adverselistvalue.click();
            break;
          }
          driver
              .manage()
              .timeouts()
              .implicitlyWait(Duration.ofSeconds(8));
          driver
              .findElement(Locators.UPLOAD_PAGE);
        }
    }
    else
      if (AdverseNO.isSelected()) {
          Thread.sleep(1000);
          driver
              .findElement(Locators.UPLOAD_PAGE);
          }
      }
  public void ORsiteQAflowNO() throws InterruptedException {
    Thread.sleep(1000);
    WebElement AdverseYes = driver.findElement(Locators.ADVERSE_YES);
    WebElement AdverseNO = driver.findElement(Locators.ADVERSE_NO);
    WebElement DocumentYes = driver.findElement(Locators.DOCUMENT_EMERGENCY_YES);
    DocumentYes.click();
    WebElement DocumentNO = driver.findElement(Locators.DOCUMENT_EMERGENCY_NO);
    DocumentNO.click();
    if (DocumentYes.isSelected()) {
      driver
          .manage()
          .timeouts()
          .implicitlyWait(Duration.ofSeconds(8));
      AdverseYes.click();
      if (AdverseYes.isSelected()) {
        List<WebElement> Adverselist = driver
            .findElements(Locators.ADVERSE_EVENT_LIST);

        for (WebElement Adverselistvalue : Adverselist) {
          if (Adverselistvalue.getText()
              .equalsIgnoreCase("Code Arrest")) {
            Adverselistvalue.click();
            break;
          }
          driver
              .manage()
              .timeouts()
              .implicitlyWait(Duration.ofSeconds(8));
          driver
              .findElement(Locators.UPLOAD_PAGE);
        }
      }
      AdverseNO.click();
      if(AdverseNO.isSelected()){
        Thread.sleep(1000);
        driver
            .findElement(Locators.UPLOAD_PAGE);
      }
    }
    if (DocumentNO.isSelected()) {
      driver
          .manage()
          .timeouts()
          .implicitlyWait(Duration.ofSeconds(8));
      AdverseYes.click();
      if (AdverseYes.isSelected()) {
        List<WebElement> Adverselist = driver
            .findElements(Locators.ADVERSE_EVENT_LIST);

        for (WebElement Adverselistvalue : Adverselist) {
          if (Adverselistvalue.getText()
              .equalsIgnoreCase("Code Arrest")) {
            Adverselistvalue.click();
            break;
          }
          driver
              .manage()
              .timeouts()
              .implicitlyWait(Duration.ofSeconds(8));
          driver
              .findElement(Locators.UPLOAD_PAGE);
        }
      }
      AdverseNO.click();
      if(AdverseNO.isSelected()){
        Thread.sleep(1000);
        driver
            .findElement(Locators.UPLOAD_PAGE);
      }
    }
  }
}
