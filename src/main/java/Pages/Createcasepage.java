package Pages;

import Utils.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import Services.Createacase;
import org.openqa.selenium.WebElement;

public class Createcasepage extends Main {
    //CreatecaseOR
    public By NotObFirstName = By.id("notObFirstName");
    public By NotObLastName = By.id("notObLastName");
    public By NotObGender = By.id("notObGender");
    public By Notobfacilitydrop = By.id("notObProcedureLocationAddField");
    public By NotObOption = By.id("notObOption");
    public By NotObService = By.id("notObService");
    public By NotObSite = By.id("notObSite");
    public By NotObDob = By.id("notObDob");
    //CreatecaseOB
    public By Firstname = By.id("firstname");
    public By Lastname = By.id("lastname");
    public By GenderOB = By.id("gender");
    public By Site = By.id("site");
    public By facilityOBdrop = By.id("procedureLocationAddField");
    public By Procedure = By.id("procedure");
    public By SubProcedure = By.id("subProcedure");
    public By Dob = By.id("dob");
    public String firstdata = "Automate";
    public String lastdata = "test";
    public String ORDate = "19-09-2025";
    public String OBDate = "19-09-2025";

    public Createcasepage(WebDriver driver) {
        this.driver = driver;
    }
    @Override
    public void choosefacility(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        super.choosefacility();
    }

    @Override
    public void OthersClickservice(){
        WebElement OBsite = driver.findElement(Obtoggle);
        WebElement ORsite = driver.findElement(Ortoggle);
        if(ORsite.isEnabled()){
            OBsite.click();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        super.OthersClickservice();
    }
    public void Addcaseclick(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(Addcase).click();
    }
    public void CreateData() throws InterruptedException {
        Createacase create =  new Createacase(driver);
        //create.CreateORdata(firstdata,lastdata,ORDate);
        create.CreateOBData(firstdata,lastdata,OBDate);
    }
    public void Addcloseclick(){
        driver.findElement(Addcaseclosebtn).click();
    }
}


