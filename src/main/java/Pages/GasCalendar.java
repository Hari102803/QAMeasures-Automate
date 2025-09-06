package Pages;

import Utils.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.time.Duration;

public class GasCalendar extends Main {

    By Previousbtn = By.id("prevBtn");
    By nextbtn = By.id("nextBtn");
    By Monthviewbtn = By.id("monthViewBtn");
    By Weekviewbtn = By.id("weekViewBtn");
    By Dayviewbtn = By.id("dayViewBtn");
    By Alltoggle = By.id("changeprovider");
    By Gasfilter = By.xpath("(//div[contains(@class,'col-2 col-sm-3')]//button)[2]");
    By filterfacilitydropdown = By.id("facilityFilterInput-ts-control");
    By filterproviderdropdown = By.id("providerFilterInput-ts-control");
    By facilitydropdownclearbtn = By.xpath("(//div[@class='ts-control']//div)[2]");
    By providerdropdownclearbtn = By.xpath("(//div[@class='ts-control']//div)[3]");
    By filterclearbtn = By.id("filterClearBtn");
    By filterclosebutton = By.xpath("//h5[text()='Filters']/following-sibling::button");
    By moreshift = By.xpath("(//div[contains(@class,'event shift-border-purple')]/following-sibling::div)[2]");
    By backbtn =  By.xpath("(//div[contains(@class,'col-2 col-sm-3')]//button)[1]");


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
    public void filterclick(String filtervalue, String providervalue){
        driver.manage() .timeouts().implicitlyWait(Duration.ofSeconds(25));
        WebElement toggle = driver.findElement(Alltoggle);
        //toggle.click();
        if(toggle.isSelected()){
            driver.findElement(Gasfilter).click();
        }
        else{
            System.out.println("The provider page has been displayed!!!");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

        WebElement facilitydropdown = driver.findElement(filterfacilitydropdown);
        facilitydropdown.click();
        facilitydropdown.sendKeys("ABRAZO ARROWHEAD"+ Keys.ENTER);

        if(facilitydropdown.isSelected()){
            driver.findElement(facilitydropdownclearbtn).click();
        }

        WebElement providerdropdown = driver.findElement(filterproviderdropdown);
        providerdropdown.click();
        providerdropdown.sendKeys("test_ob"+Keys.ENTER);

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
            System.out.println("The moreshift hasn't been opened");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(backbtn).click();
    }



}
