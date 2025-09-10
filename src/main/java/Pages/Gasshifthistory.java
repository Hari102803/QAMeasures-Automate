package Pages;

import Utils.Main;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Gasshifthistory extends Main {

    public Gasshifthistory(WebDriver driver){
    this.driver = driver;
    }

    @Override
    public void OthersClickservice(){
        super.OthersClickservice();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    public void gasshifthistorryclick(){
        try{
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
            driver.findElement(Gashistory).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
            driver.findElement(Transfertab).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
            driver.findElement(Swaptab).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
            driver.findElement(Sharetab).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.findElement(QAtab).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
            driver.findElement(MissingQAtab).click();
        }
        catch (ElementClickInterceptedException e){
            System.out.println(e.getMessage());
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(gashistorybackbtn).click();

    }
}
