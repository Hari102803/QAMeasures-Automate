package Pages;

import Utils.Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.NoSuchElementException;

public class PeeloffOrder extends Main {

    public PeeloffOrder(WebDriver driver) {
        this.driver = driver;
    }
    @Override
    public void OthersClickservice() {
        super.OthersClickservice();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    public void Peelofforderclick(String filterdate) throws NoSuchElementException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(Peeofforder).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(Orderfacility).click();
        WebElement Facilitylist = driver.findElement(Orderfacilitydrop);
        Facilitylist.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
            WebElement time = driver.findElement(SearchDate);
            time.clear();
            time.sendKeys(filterdate);

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
            driver.findElement(Ordersubmit).click();
        }

    public void orderclose() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(Orderbackbutton).click();

    }

}
