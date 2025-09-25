package Services;

import Config.DriverManager;
import Config.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Config.DriverManager.driver;

public class Createacase{

  public Createacase(WebDriver driver) {
    DriverManager.driver =driver;
  }
  public void CreateORdata(String firstname, String lastname, String ORdob) throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(Locators.NOT_OB_FIRST_NAME)
        .sendKeys(firstname);
    Thread.sleep(1000);
    driver.findElement(Locators.NOT_OB_LAST_NAME)
        .sendKeys(lastname);

    Thread.sleep(1000);
    WebElement Gender = driver.findElement(Locators.NOT_OB_GENDER);
    Gender.click();
    Select Genderselect = new Select(Gender);
    Genderselect.selectByIndex(1);

    Thread.sleep(1000);
    WebElement Faciility = driver.findElement(Locators.NOT_OB_FACILITY_DROP);
    Faciility.click();
    Select Facilityselect = new Select(Faciility);
    Facilityselect.selectByIndex(1);

    Thread.sleep(1000);
    WebElement OutofOrservice1 = driver.findElement(Locators.NOT_OB_OPTION);
    OutofOrservice1.click();
    Select OutOrserviceSelect1 = new Select(OutofOrservice1);
    OutOrserviceSelect1.selectByIndex(1);
//
//        Thread.sleep(1000);
//        WebElement OutofOrservice2 = driver.findElement(Locators.NOT_OB_OPTION);
//        OutofOrservice2.click();
//        Select OutOrserviceSelect2 = new Select(OutofOrservice2);
//        OutOrserviceSelect2.selectByIndex(2);

    if (OutofOrservice1.isDisplayed()) {
      WebElement YesOptions = driver.findElement(Locators.NOT_OB_SERVICE);
      YesOptions.click();
      Select YesSelect = new Select(YesOptions);
      YesSelect.selectByIndex(2);
//    }
//         else if(OutofOrservice2.isDisplayed()){
//            WebElement NoOptions = driver.findElement(Locators.NOT_OB_SITE);
//            NoOptions.click();
//            Select NoSelect = new Select(NoOptions);
//            NoSelect.selectByIndex(3);
//        }
      Thread.sleep(1000);
      driver
          .findElement(Locators.NOT_OB_DOB)
          .sendKeys(ORdob);
    }
  }
  public void  ButtonsORclick() throws InterruptedException {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement Savebutton = wait
        .until(ExpectedConditions.elementToBeClickable(Locators.NOT_OB_SAVE_BUTTON));
    //Seavebutton.click();
    WebElement SaveCompleteQA = wait
        .until(ExpectedConditions.elementToBeClickable(Locators.NOT_OB_COMPLETEQA_BUTTON));
    SaveCompleteQA.click();
    WebElement SaveUpload = wait
        .until(ExpectedConditions.elementToBeClickable(Locators.NOT_OB_UPLOAD_BUTTON));
    //SaveUpload.click();
    if(Savebutton.isEnabled()){
      driver
          .manage()
          .timeouts()
          .implicitlyWait(Duration.ofSeconds(8));
      driver.findElement(Locators.POPUP_CONFIRM)
          .click();
    }
    else
    if(SaveCompleteQA.isDisplayed()){
      driver.findElement(Locators.POPUP_CONFIRM)
          .click();
      driver.findElement(Locators.CLOSE_MODEL)
          .click();
      QAflow flow = new QAflow(driver);
      flow.ORsiteQAflowYES();
      flow.ORsiteQAflowNO();
    }
    else
      if(SaveUpload.isEnabled()){
        driver.findElement(Locators.POPUP_CONFIRM)
            .click();
        driver
            .manage()
            .timeouts()
                .implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(Locators.UPLOAD_PAGE).click();
      }
  }
  public void CreateOBData(String firstname, String lastname, String dob) throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(Locators.FIRST_NAME_OB)
        .sendKeys(firstname);
    Thread.sleep(1000);
    driver.findElement(Locators.LAST_NAME_OB)
        .sendKeys(lastname);

    Thread.sleep(1000);
    WebElement Gender = driver.findElement(Locators.GENDER_OB);
    Gender.click();
    Select GenderSelect = new Select(Gender);
    GenderSelect.selectByIndex(1);

    Thread.sleep(1000);
    WebElement OBSites = driver.findElement(Locators.SITE_OB);
    OBSites.click();
    Select OBsiteSelect = new Select(OBSites);
    OBsiteSelect.selectByIndex(1);

    Thread.sleep(1000);
    WebElement FacilityOB = driver.findElement(Locators.FACILITY_OB_DROP);
    FacilityOB.click();
    Select OBfacilitySelect = new Select(FacilityOB);
    OBfacilitySelect.selectByIndex(1);

    Thread.sleep(1000);
    WebElement procedure = driver.findElement(Locators.PROCEDURE_OB);
    procedure.click();
    Select ProcedureSelect = new Select(procedure);
    ProcedureSelect.selectByIndex(1);

    if (procedure.isDisplayed()) {
      Thread.sleep(1000);
      WebElement Technique = driver.findElement(Locators.SUB_PROCEDURE_OB);
      Technique.click();
      Select TechniqueSelect = new Select(Technique);
      TechniqueSelect.selectByIndex(1);
    }
    Thread.sleep(1000);
    driver.findElement(Locators.DOB_OB)
        .sendKeys(dob);
  }
  public void OBButtonclick(){
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement SavebuttonOB = wait
        .until(ExpectedConditions.elementToBeClickable(Locators.SAVE_BTN));
    //SavebuttonOB.click();
    WebElement SaveCompleteQAOB = wait
        .until(ExpectedConditions.elementToBeClickable(Locators.SAVE_AND_QA));
    //SaveCompleteQAOB.click();
    WebElement SaveUploadOB = wait
        .until(ExpectedConditions.elementToBeClickable(Locators.UPLOAD_RECORDS_BTN));
    SaveUploadOB.click();

    if(SavebuttonOB.isEnabled()){
      driver.findElement(Locators.POPUP_CONFIRM)
          .click();
    }
    else
      if(SaveCompleteQAOB.isEnabled()){
        driver.findElement(Locators.POPUP_CONFIRM)
            .click();
        driver
            .manage()
            .timeouts()
            .implicitlyWait(Duration.ofSeconds(10));

      }
      else
        if(SaveUploadOB.isEnabled()){
          driver.findElement(Locators.POPUP_CONFIRM)
              .click();
          driver
              .manage()
              .timeouts()
              .implicitlyWait(Duration.ofSeconds(10));
          driver.findElement(Locators.UPLOAD_PAGE).click();
        }
  }
}
