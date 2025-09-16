package Pages;

import Utils.Main;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Createcasepage extends Main {

    public Createcasepage(WebDriver driver){
        this.driver =driver;
    }
    @Override
    public void choosefacility(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        super.choosefacility();

    }
}
