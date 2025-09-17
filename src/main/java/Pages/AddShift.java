package Pages;

import Utils.Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;

public class AddShift extends Main {

    public AddShift(WebDriver driver){

        this.driver = driver;
    }

    @Override
    public void OthersClickservice(){
        super.OthersClickservice();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    @Override
    public void Gascalendarservice(){
        super.Gascalendarservice();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void Addshiftclick(String fromDate ,String fromtime , String Todate , String Totime){

        driver.findElement(Addshift).click();
        //Search Optional
//        driver.findElement(providersearch).sendKeys("test_ob");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement provider = driver.findElement(providerinput);
        provider.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement providerdrops =  driver.findElement(providerDropdown);
        providerdrops.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(procedureinput).click();
        WebElement facility = driver.findElement(proceduredropdown);
        facility.click();

        if(facility.isDisplayed()){
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
            driver.findElement(positioninput).click();
            WebElement position = driver.findElement(positiondropdown);
            position.click();
        }
        else{
            System.out.println(NotSelectvalidation);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(fromdateinput).sendKeys(fromDate,fromtime);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(Todateinput).sendKeys(Todate,Totime);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(AddBtn).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(clearbtn).click();

    }
    public void addshiftclose(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement close = driver.findElement(Addshiftclosebtn);
        close.click();
        if(close.isEnabled()){
            System.out.println(Addshiftclosemodel);
        }
        else{
            System.out.println(PopupNotSelectvalidation);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(backbtn).click();
    }

}


