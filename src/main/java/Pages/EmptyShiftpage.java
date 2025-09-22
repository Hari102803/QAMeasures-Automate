package Pages;

import Utils.Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;


public class EmptyShiftpage extends Main {

    public EmptyShiftpage(WebDriver driver){
        this.driver = driver;

    }
    @Override
    public void OthersClickservice()throws InterruptedException{
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
