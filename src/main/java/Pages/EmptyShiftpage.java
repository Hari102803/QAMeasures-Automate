package Pages;

import Utils.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import javax.crypto.Mac;
import java.time.Duration;


public class EmptyShiftpage extends Main {

    By Emptyshift = By.id("shiftConfirmation");
    By Emptyshiftselect = By.id("emptyShiftFacility");
    By Emprtshiftclear = By.id("emptyShiftClear");
    By Emptyclose = By.id("closeModel");

    public EmptyShiftpage(WebDriver driver){
        this.driver = driver;

    }
    @Override
    public void OthersClickservice(){
        super.OthersClickservice();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    public void Emptyshiftclick(){
        driver.findElement(Emptyshift).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    public void Emptyshiftfacilty(){
        WebElement shiftfacility = driver.findElement(Emptyshiftselect);
        shiftfacility.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        Select choosefacility = new Select(shiftfacility);
        choosefacility.selectByIndex(1);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        if(shiftfacility.isSelected()){
            driver.findElement(Emprtshiftclear).click();
        }

    }
    public void Closeclick(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(Emptyclose).click();
    }

}
