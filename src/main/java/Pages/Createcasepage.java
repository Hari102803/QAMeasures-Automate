package Pages;

import Utils.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import Services.Createacase;

public class Createcasepage extends Main {

    public By NotObFirstName = By.id("notObFirstName");
    public By NotObLastName = By.id("notObLastName");
    public By NotObGender = By.id("notObGender");
    public By Notobfacilitydrop = By.id("notObProcedureLocationAddField");
    public By NotObOption = By.id("notObOption");
    public By NotObService = By.id("notObService");
    public By NotObSite = By.id("notObSite");
    public By NotObDob = By.id("notObDob");
    public String firstdata = "Automate";
    public String lastdata = "test";

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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        super.OthersClickservice();
    }
    public void Addcaseclick(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(Addcase).click();
    }
    public void CreateData() throws InterruptedException {
        Createacase create =  new Createacase(driver);
        create.CreateORdata(firstdata,lastdata);
    }
    public void Addcloseclick(){
        driver.findElement(Addcaseclosebtn).click();
    }
}


