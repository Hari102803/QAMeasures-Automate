package Pages;

import Utils.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class AddShift extends Main {

    By Addshift = By.id("addShift");
    By providerinputdrop = By.id("providerDropdown");
    By provider = By.id("providerInput");
    By procedureinput = By.id("procedureInput");
    By positioninput = By.id("positionInput");
    By fromdateinput =By.id("fromDateInput");
    By Todateinput = By.id("toDateInput");
    By AddBtn = By.id("modalAddBtn");
    By clearbtn = By.id("modalClearBtn");


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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(provider).click();
        WebElement provider = driver.findElement(providerinputdrop);
        provider.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Select providerdrop = new Select(provider);
        provider.sendKeys(""+Keys.ENTER);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        WebElement procedure = driver.findElement(procedureinput);
        procedure.click();
        Select proceduredrop = new Select(procedure);
        procedure.sendKeys(""+Keys.ENTER);

        if(procedure.isSelected()){
            WebElement position = driver.findElement(positioninput);
            position.click();
            Select positiondrop = new Select(position);
            positiondrop.selectByIndex(2);
        }
        else{
            System.out.println("Please select the any one faciility!!!");
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(fromdateinput).sendKeys("06-09-2025" , "17:20");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(Todateinput).sendKeys("07-09-2025" , "17:20");

        //driver.findElement(AddBtn).click();
        driver.findElement(clearbtn).click();

    }

}


