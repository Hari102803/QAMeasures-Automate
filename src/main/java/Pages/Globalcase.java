package Pages;

import Utils.Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Globalcase  extends Main {

    public Globalcase(WebDriver driver) {
        this.driver = driver;
    }
    @Override
    public void OthersClickservice() {
        super.OthersClickservice();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    public void Globalcaseclick() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(Globalcase).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        WebElement organize = driver.findElement(Organizationdrop);
        organize.click();
        Select organizedrop = new Select(organize);
        organizedrop.selectByIndex(1);

        if (organize.isSelected()) {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
            WebElement facility = driver.findElement(Globalfacility);
            facility.click();
            Select facilitydrop = new Select(facility);
            facilitydrop.selectByIndex(2);

            if (facility.isSelected()) {
               // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
                WebElement site = driver.findElement(Globalsite);
                site.click();
                Select sitedrop = new Select(site);
                sitedrop.selectByIndex(1);

                if (site.isSelected()) {
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
                    driver.findElement(Globasurgeon).click();
                    List<WebElement> surgeonlist = driver.findElements(globalSurgeondropdown);
                    for (WebElement surgeonslist : surgeonlist) {
                        if (surgeonslist.getText().equals("ALLEN, AGAPAY")) {
                            surgeonslist.click();
                            break;
                        }
                    }
                }
            }
        }
        if(organize.isSelected()){
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
            driver.findElement(Globalsubmitbtn).click();

            driver.findElement(Globalclearbtn).click();
        }
    }
    public void Globalclose(){
        driver.findElement(Globalclosebtn).click();
    }
}
