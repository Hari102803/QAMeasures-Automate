package Pages;

import Utils.Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage extends Main {

   public Loginpage(WebDriver driver){

       this.driver =driver;
   }

   public void enterUsername(String username){

       driver.findElement(Username).sendKeys(username);
   }
   public void enterPassword(String password){

       driver.findElement(Password).sendKeys(password);
   }
   public void clicklogin(){

       WebElement onboard = driver.findElement(Loginbtn);
       onboard.click();
   }
}

