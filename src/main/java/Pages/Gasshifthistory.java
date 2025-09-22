package Pages;

import Utils.Main;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Gasshifthistory extends Main {

    public Gasshifthistory(WebDriver driver){
    this.driver = driver;
    }
    @Override
    public void OthersClickservice()throws InterruptedException{
        super.OthersClickservice();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    public void gasshifthistorryclick() {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
            driver.findElement(Gashistory).click();
    }
    public void GashifttabsClick(){
        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
            WebElement transfer = driver.findElement(Transfertab);
            if(transfer.isEnabled()){
                WebElement pagenumber =  driver.findElement(paginationnumber);
                pagenumber.click();
                if(pagenumber.isEnabled()){
                    driver.findElement(Previous).click();
                }
            }
            else{
                System.out.println("No pages are displayed");
            }
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
            WebElement Swap = driver.findElement(Swaptab);
            Swap.click();
            if(Swap.isEnabled()){
                WebElement pagenumber =  driver.findElement(paginationnumber);
                pagenumber.click();
                if(pagenumber.isEnabled()){
                    driver.findElement(Previous).click();
                }
            }
            else{
                System.out.println("No pages are displayed");
            }

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
            WebElement share = driver.findElement(Sharetab);
            share.click();
            if(share.isEnabled()){
                WebElement pagenumber =  driver.findElement(paginationnumber);
                pagenumber.click();
                if(pagenumber.isEnabled()){
                    driver.findElement(Previous).click();
                }
            }
            else{
                System.out.println("No pages are displayed");
            }

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement missingQa = wait.until(ExpectedConditions.elementToBeClickable(MissingQAtab));
            missingQa.click();
        }
        catch (ElementClickInterceptedException e){
            System.out.println(e);
        }
    }
        public void Historybackbtn(){
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
            driver.findElement(gashistorybackbtn).click();
        }
}



