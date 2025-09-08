package Pages;

import Utils.Main;
import org.openqa.selenium.WebDriver;

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

       driver.findElement(Loginbtn).click();
   }
}

