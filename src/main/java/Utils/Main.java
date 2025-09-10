package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public  WebDriver driver;

    public By Username = By.id("inputUsername");
    public By Password = By.id("inputPassword");
    public By Loginbtn = By.tagName("button");
    public By LinkQA = By.xpath("//span[normalize-space(text())='QA Measures']");
    public By Addshift = By.id("addShift");
    public By providerinput = By.id("providerInput");
    //By providersearch = By.id("providerSearch");
    public By providerDropdown = By.id("dynamicProviderList");
    public By procedureinput = By.id("procedureInput");
    public By proceduredropdown = By.id("procedureDropdown");
    public By positioninput = By.id("positionInput");
    public By positiondropdown = By.id("positionDropdown");
    public By fromdateinput =By.id("fromDateInput");
    public By Todateinput = By.id("toDateInput");
    public By AddBtn = By.id("modalAddBtn");
    public By clearbtn = By.id("modalClearBtn");
    public By Addshiftclosebtn = By.id("closeModal");
    public By Previousbtn = By.id("prevBtn");
    public By nextbtn = By.id("nextBtn");
    public By Monthviewbtn = By.id("monthViewBtn");
    public By Weekviewbtn = By.id("weekViewBtn");
    public By Dayviewbtn = By.id("dayViewBtn");
    public By Alltoggle = By.id("changeprovider");
    public By Gasfilter = By.xpath("(//div[contains(@class,'col-2 col-sm-3')]//button)[2]");
    public By filterfacilitydropdown = By.id("facilityFilterInput-ts-control");
    public By filterproviderdropdown = By.id("providerFilterInput-ts-control");
    public By facilitydropdownclearbtn = By.xpath("(//div[@class='ts-control']//div)[2]");
    public By providerdropdownclearbtn = By.xpath("(//div[@class='ts-control']//div)[3]");
    public By filterclearbtn = By.id("filterClearBtn");
    public By filterclosebutton = By.xpath("//h5[text()='Filters']/following-sibling::button");
    public By moreshift = By.xpath("(//div[contains(@class,'event shift-border-purple')]/following-sibling::div)[2]");
    public By backbtn = By.xpath("(//div[contains(@class,'col-2 col-sm-3')]//button)[1]");
    public By batch = By.id("batchQuality");
    public By batchfacility = By.id("batchProcedureLocation");
    public By batchsubmitbutton = By.id("multiQaSubmitButton");
    public By batchclosepopup = By.xpath("//h5[text()='Batch Quality']/following-sibling::button");
    public By Emptyshift = By.id("shiftConfirmation");
    public By Emptyshiftselect = By.id("emptyShiftFacility");
    public By Emprtshiftclear = By.id("emptyShiftClear");
    public By Emptyclose = By.id("closeModel");
    By others = By.id("otherSection");
    By Gascalenadr = By.id("addShiftLink");
    public By Gasshift = By.id("GasShifts");
    public By FromShift = By.id("fromShift");
    public By ToShift = By.id("toShift");
    public By Gasfaciities = By.id("facilities");
    public By Shiftdropdown =By.id("shifts");
    public By Gasshiftclosebtn = By.xpath("//div[@id='mySchedule']/div[1]/div[1]/div[1]/button[1]/span[1]");
    public By GasSubmit = By.id("findSchedule");
    public By GasClear = By.id("upcomingClearBtn");
    public By Gashistory = By.id("GasHistory");
    public By Transfertab = By.linkText("Transfer History");
    public By Swaptab =By.linkText("Swap History");
    public By Sharetab = By.linkText("Share History");
    public By QAtab = By.linkText("QA History");
    public By MissingQAtab = By.linkText("Missing QA");
    public By gashistorybackbtn =  By.xpath("//a[@class='back-button']//button[1]");
    public String applicationURL = "https://qa-dataportal.greatergas.com/";
    public String username = "test_cl";
    public String password = "password";
    public String Filtervalue = "ABRAZO ARROWHEAD";
    public String Providervalue = "test_ob";
    public String Providername = "Aaron Moulton";
    public String Facilityname ="ABRAZO ARROWHEAD";
    public String Positionname = "AAC WD Additional OT (8)";
    public String Loginvalidation = "Onboarding page opened successfully!!!";
    public String QAmeasuresvalidation = "QAMeasures page opened successfully!!!";
    public String Batchqualityvalidation = "The Batchquality page opened successfully!!!";
    public String Emptyshiftvalidation = "Empty shift confirmation page opened successfully!!!";
    public String CalendarValidation = "GasCalendar page opened successfully!!!";
    public String Filtervalidation = "Filter opened successfully";
    public String Addshiftvalidation = "Add shift pop-up opened successfully";
    public String Providervalidation = "The provider page has been displayed!!!";
    public String Moreshiftvalidation = "The moreshift hasn't been opened";
    public String Addshiftclosemodel = "The addshift pop-up closed successfully!";
    public String Gasshiftvalidation = "The Gas shift pop-up opened successfully";
    public String Shiftclosevalidation = "The Gas shift pop-up closed successfully!!!";
    public String Gashistoryvalidation = "Gas shift history page opened successfully";
    public String Historyclosevalidation = "Gas shift history page closed successfully";
    public String Fromdate = "06-09-2025"; //Changeable
    public String Fromatime = "17:20"; //Changeable
    public String Todate = "07-09-2025"; //Changeable
    public String Totime = "17:20";//Changeable
    public String Gasfromdate = "09-09-2025";
    public String Gastodate = "10-09-2025";

    public void setup(){
        ChromeOptions options = new ChromeOptions();
        Map<String,Object>prefs = new HashMap<>();
        prefs.put("profile.default_content_setting_values.notifications",1);
        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(applicationURL);
    }
    public void OthersClickservice(){
        driver.findElement(others).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    public void Gascalendarservice(){
        driver.findElement(Gascalenadr).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
}
