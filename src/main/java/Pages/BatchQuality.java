package Pages;

import Utils.Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;


public class BatchQuality extends Main {

    public BatchQuality(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @Override
    public void OthersClickservice(){
        super.OthersClickservice();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    public void batchqulaityclick(){
        driver.findElement(batch).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        WebElement facilitychoose = driver.findElement(batchfacility);
        facilitychoose.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        Select batchfacilitychoose = new Select(facilitychoose);
        batchfacilitychoose.selectByIndex(1);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(batchsubmitbutton).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(batchclosepopup).click();

    }

}
