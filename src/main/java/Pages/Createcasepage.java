package Pages;

import Utils.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import Services.Createacase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    // AddCase buttons
    public String firstdata = "Automate";
    public String lastdata = "test";
    public String Date = "19-09-2025";

    public Createcasepage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void choosefacility(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        super.choosefacility();
    }
    @Override
    public void OthersClickservice() throws InterruptedException {
        Createacase caseData = new Createacase(driver);

        WebElement OBsite = driver.findElement(Obtoggle);
        WebElement ORsite = driver.findElement(Ortoggle);

        if (ORsite.isDisplayed()) {
            super.OthersClickservice();
            Addcaseclick(true);
            caseData.CreateORdata(firstdata, lastdata, Date);
        }
        else if (OBsite.isDisplayed()) {
            super.OthersClickservice();
            Addcaseclick(false);
            caseData.CreateOBData(firstdata, lastdata, Date);
        }
    }
    public void Addcaseclick(boolean isOR) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        if (isOR) {
            WebElement addCaseBtn = wait.until(ExpectedConditions.elementToBeClickable(AddcaseORsite));
            addCaseBtn.click();
        } else {
            WebElement addCaseBtn = wait.until(ExpectedConditions.elementToBeClickable(AddcaseOBsite));
            addCaseBtn.click();
        }
    }
    public void Addcloseclick(){
        driver.findElement(Addcaseclosebtn).click();
    }
}
