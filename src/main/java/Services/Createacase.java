package Services;

import Pages.Createcasepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Createacase extends Createcasepage {

    public Createacase(WebDriver driver){
        super(driver);
    }
    public void CreateORdata(String firstname , String lastname, String ORdob) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(NotObFirstName).sendKeys(firstname);
        Thread.sleep(1000);
        driver.findElement(NotObLastName).sendKeys(lastname);

        Thread.sleep(1000);
        WebElement Gender = driver.findElement(NotObGender);
        Gender.click();
        Select Genderselect = new Select(Gender);
        Genderselect.selectByIndex(1);

        Thread.sleep(1000);
        WebElement Faciility = driver.findElement(Notobfacilitydrop);
        Faciility.click();
        Select Facilityselect = new Select(Faciility);
        Facilityselect.selectByIndex(1);

        Thread.sleep(1000);
        WebElement OutofOrservice1 = driver.findElement(NotObOption);
        OutofOrservice1.click();
        Select OutOrserviceSelect1 = new Select(OutofOrservice1);
        OutOrserviceSelect1.selectByIndex(1);

        Thread.sleep(1000);
        WebElement OutofOrservice2 = driver.findElement(NotObOption);
        OutofOrservice2.click();
        Select OutOrserviceSelect2 = new Select(OutofOrservice2);
        OutOrserviceSelect2.selectByIndex(2);

        if(OutofOrservice1.isDisplayed()){
            WebElement YesOptions = driver.findElement(NotObService);
            YesOptions.click();
            Select YesSelect = new Select(YesOptions);
            YesSelect.selectByIndex(2);
        }
         if(OutofOrservice2.isDisplayed()){
            WebElement NoOptions = driver.findElement(NotObSite);
            NoOptions.click();
            Select NoSelect = new Select(NoOptions);
            NoSelect.selectByIndex(3);
        }
        Thread.sleep(1000);
        driver.findElement(NotObDob).sendKeys(ORdob);
    }
    public void CreateOBData(String firstname, String lastname, String dob) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(Firstname).sendKeys(firstname);
        Thread.sleep(1000);
        driver.findElement(Lastname).sendKeys(lastname);

        Thread.sleep(1000);
        WebElement Gender = driver.findElement(GenderOB);
        Gender.click();
        Select GenderSelect = new Select(Gender);
        GenderSelect.selectByIndex(1);

        Thread.sleep(1000);
        WebElement OBSites = driver.findElement(Site);
        OBSites.click();
        Select OBsiteSelect = new Select(OBSites);
        OBsiteSelect.selectByIndex(1);

        Thread.sleep(1000);
        WebElement FacilityOB = driver.findElement(facilityOBdrop);
        FacilityOB.click();
        Select OBfacilitySelect = new Select(FacilityOB);
        OBfacilitySelect.selectByIndex(1);

        Thread.sleep(1000);
        WebElement procedure = driver.findElement(Procedure);
        procedure.click();
        Select ProcedureSelect = new Select(procedure);
        ProcedureSelect.selectByIndex(1);

        if(procedure.isDisplayed()){
            Thread.sleep(1000);
            WebElement Technique = driver.findElement(SubProcedure);
            Technique.click();
            Select TechniqueSelect = new Select(Technique);
            TechniqueSelect.selectByIndex(1);
        }

        Thread.sleep(1000);
        driver.findElement(Dob).sendKeys(dob);
    }
}
