package Pages;

import Utils.Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class GasShift extends Main {

    public GasShift(WebDriver driver) {

        this.driver = driver;
    }
    @Override
    public void OthersClickservice() {
        super.OthersClickservice();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    public void Gasshiftclick(String fromdate , String todate){

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(Gasshift).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(FromShift).sendKeys(fromdate);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(ToShift).sendKeys(todate);

        WebElement facility = driver.findElement(Gasfaciities);
        facility.click();
        Select facilityselect = new Select(facility);
        facilityselect.selectByIndex(1);

        WebElement shift = driver.findElement(Shiftdropdown);
        shift.click();
        Select shiftselect = new Select(shift);
        shiftselect.selectByIndex(1);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        WebElement submit =  driver.findElement(GasSubmit);
        submit.click();

         if(submit.isEnabled()){
             driver.findElement(GasClear).click();
         }
        driver.findElement(Gasshiftclosebtn).click();
    }
}