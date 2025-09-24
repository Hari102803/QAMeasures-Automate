package Pages;

import Config.DriverManager;
import Config.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static Config.DriverManager.driver;

public class Loginpage {

  public Loginpage(WebDriver driver) {
    DriverManager.driver=driver;
  }

  public void enterUsername(String username) {

    driver.findElement(Locators.USERNAME)
        .sendKeys(username);
  }

  public void enterPassword(String password) {

    driver.findElement(Locators.PASSWORD)
        .sendKeys(password);
  }

  public void clicklogin() {

    WebElement onboard = driver.findElement(Locators.LOGIN_BTN);
    onboard.click();
  }
}

