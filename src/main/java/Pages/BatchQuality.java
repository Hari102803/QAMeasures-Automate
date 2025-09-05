package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class BatchQuality {

    WebDriver driver;

    By others = By.id("otherSection");
    By batch = By.id("batchQuality");
    By batchfacility = By.id("batchProcedureLocation");
    By batchsubmitbutton = By.id("multiQaSubmitButton");
    By batchclosepopup = By.xpath("//h5[text()='Batch Quality']/following-sibling::button");

    public BatchQuality(WebDriver driver){
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void othersbuttonclick(){
        driver.findElement(others).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    public void batchqulaityclick(){
        driver.findElement(batch).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement facilitychoose = driver.findElement(batchfacility);
        facilitychoose.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Select batchfacilitychoose = new Select(facilitychoose);
        batchfacilitychoose.selectByIndex(1);

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(batchsubmitbutton).click();

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(batchclosepopup).click();

    }

}
