package Services;

import Pages.Createcasepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Createacase extends Createcasepage {

    public Createacase(WebDriver driver){
        super(driver);
    }
    @Override
    public void Addcaseclick(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        super.Addcaseclick();
    }
    public void CreateORdata(String firstname , String lastname) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(NotObFirstName).sendKeys(firstname);
        Thread.sleep(1000);
        driver.findElement(NotObLastName).sendKeys(lastname);

        WebElement Gender = driver.findElement(NotObGender);
        Gender.click();
        Select Genderselect = new Select(Gender);
        Genderselect.selectByIndex(1);

        WebElement Faciility = driver.findElement(Notobfacilitydrop);
        Faciility.click();
        Select Facilityselect = new Select(Faciility);
        Facilityselect.selectByIndex(1);

        WebElement OutofOrservice1 = driver.findElement(NotObOption);
        OutofOrservice1.click();
        Select OutOrserviceSelect1 = new Select(OutofOrservice1);
        OutOrserviceSelect1.selectByIndex(1);

        WebElement OutofOrservice2 = driver.findElement(NotObOption);
        OutofOrservice2.click();
        Select OutOrserviceSelect2 = new Select(OutofOrservice2);
        OutOrserviceSelect2.selectByIndex(2);

        if(OutofOrservice1.isDisplayed()){
            driver.findElement(NotObService).click();
        }
        else if (OutofOrservice2.isSelected()) {
            driver.findElement(NotObSite).click();
        }
        else{
            System.out.println("Please select any one service");
        }

        Thread.sleep(1000);
        driver.findElement(NotObDob).sendKeys("18-09-2025");
    }

}
