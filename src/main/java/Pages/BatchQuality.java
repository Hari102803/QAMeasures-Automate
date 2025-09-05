package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;


public class BatchQuality {

    WebDriver driver;

    By others = By.id("otherSection");
    By batch = By.id("batchQuality");
    By batchfacility = By.id("batchProcedureLocation");
    By batchsubmitbutton = By.id("multiQaSubmitButton");
    By batchclosepopup = By.xpath("//h5[text()='Batch Quality']/following-sibling::button");

    public BatchQuality(WebDriver driver){
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public BatchQuality() {
    }

    public void othersbuttonclick(){
        driver.findElement(others).click();
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
