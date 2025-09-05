package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

   WebDriver driver;


   By Username = By.id("inputUsername");
   By Password = By.id("inputPassword");
   By Loginbtn = By.tagName("button");

   public Loginpage(WebDriver driver){
       this.driver =driver;
   }

   public void enterUsername(String username){
       driver.findElement(Username).sendKeys("test_cl");
   }
   public void enterPassword(String password){
       driver.findElement(Password).sendKeys("password");
   }
   public void clicklogin(){
       driver.findElement(Loginbtn).click();
   }
}

