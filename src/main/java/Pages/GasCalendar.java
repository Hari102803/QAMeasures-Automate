package Pages;

import Utils.Main;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.time.Duration;

public class GasCalendar extends Main {

    public GasCalendar(WebDriver driver) {

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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    public void GasUIbuttonclick(){
        driver.findElement(nextbtn).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(Monthviewbtn).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(Weekviewbtn).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(Dayviewbtn).click();
    }
    public void filterclick(String Filtervalue, String providervalue){
        driver.manage() .timeouts().implicitlyWait(Duration.ofSeconds(25));
        WebElement toggle = driver.findElement(Alltoggle);
        //toggle.click();
        if(toggle.isSelected()){
            driver.findElement(Gasfilter).click();
        }
        else{
            System.out.println(Providervalidation);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

        WebElement facilitydropdown = driver.findElement(filterfacilitydropdown);
        facilitydropdown.click();
        facilitydropdown.sendKeys(Filtervalue+ Keys.ENTER);

        if(facilitydropdown.isSelected()){
            driver.findElement(facilitydropdownclearbtn).click();
        }

        WebElement providerdropdown = driver.findElement(filterproviderdropdown);
        providerdropdown.click();
        providerdropdown.sendKeys(providervalue+Keys.ENTER);

        if(providerdropdown.isSelected()){
            driver.findElement(providerdropdownclearbtn).click();
        }

        driver.findElement(filterclearbtn).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(filterclosebutton).click();
    }
    public void Moreshiftclick(){

        WebElement monthview = driver.findElement(Monthviewbtn);
        monthview.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1500));
        driver.findElement(Previousbtn).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1500));
        if(monthview.isSelected()){
            driver.findElement(moreshift).click();
        }
        else{
            System.out.println(Moreshiftvalidation);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(backbtn).click();
    }



}
