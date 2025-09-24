package Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DriverManager {

  public static WebDriver driver;

  public void Setup() {
    ChromeOptions options = new ChromeOptions();
    Map<String, Object> prefs = new HashMap<>();
    prefs.put("profile.default_content_setting_values.notifications", 1);
    options.setExperimentalOption("prefs", prefs);

    driver = new ChromeDriver(options);
    driver.manage()
        .window()
        .maximize();
    driver.get(config.APPLICATION_URL);

  }
  public void OthersClickservice() throws InterruptedException {
    driver.findElement(Locators.OTHERS)
        .click();
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
  }
  public void Gascalendarservice() {
    driver.findElement(Locators.GAS_CALENDAR)
        .click();
    driver.manage()
        .timeouts()
        .implicitlyWait(Duration.ofSeconds(8));
  }

  public void choosefacility() {
    WebElement choose = driver.findElement(Locators.CHOOSE_FACILITY);
    choose.click();
    List<WebElement> choosefacilities = driver.findElements(Locators.SELECT_FACILITY);
    for (WebElement choosing : choosefacilities) {
      if (choosing.getText()
          .equalsIgnoreCase("Select All")) {
        choosing.click();
        break;
      }
    }
    WebElement submit = driver.findElement(Locators.HOME_SUBMIT_BTN);
    submit.click();
  }
}

