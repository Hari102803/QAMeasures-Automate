package Pages;

import Utils.Main;
import java.util.List;
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
        List<WebElement> providerdrops =  driver.findElements(providerDropdown);
        for(WebElement providers : providerdrops ) {
            if (providers.getText().equals(Providername)) {
                providers.click();
                break;
            }
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(AddBtn).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(clearbtn).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(Addshiftclosebtn).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(backbtn).click();
    }

}


