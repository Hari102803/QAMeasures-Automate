package Pages;

import Utils.Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;

public class Transfercasepage extends Main {

    public Transfercasepage(WebDriver driver){
        this.driver = driver;
    }
    @Override
    public void choosefacility(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        super.choosefacility();
    }
    @Override
    public void OthersClickservice(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        super.OthersClickservice();
    }
    public void Transfercaseclick(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        WebElement Transfercase = driver.findElement(transfercase);
        Transfercase.click();
        if(Transfercase.isDisplayed()){
            System.out.println(Transfercsevalidation);
        }
    }
    public void Transferclosebtn(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        WebElement transferclose = driver.findElement(transferclosebtn);
        transferclose.click();
    }
}
