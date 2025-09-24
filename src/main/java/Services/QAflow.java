package Services;


import Config.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import static Config.DriverManager.driver;

public class QAflow extends Createacase {

  public QAflow(WebDriver driver) {
    super(driver);
  }
  public void ORsiteQAflow() throws InterruptedException {
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
        }
    }
    else
      if (AdverseNO.isSelected()) {
          Thread.sleep(1000);
          driver
              .findElement(Locators.UPLOAD_PAGE);
          }
      }

}
