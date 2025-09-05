package Tests;

import Pages.BatchQuality;
import Pages.EmptyShiftpage;
import Pages.Homepage;
import Pages.Loginpage;
import Utils.Main;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test extends Main {

  @BeforeMethod
    public void setuptest(){
        setup();

    }

    @Test
    public void Storyvalidation(){

        Loginpage login = new Loginpage(driver);
        login.enterUsername("test_cl");
        login.enterPassword("password");
        login.clicklogin();
        System.out.println("Onboarding page opened successfully!!!");

        Homepage home = new Homepage(driver);
        home.QALink();
        System.out.println("QAMeasures page opened successfully!!!");

        //Others button click  //Batchquality button click
        BatchQuality batch = new BatchQuality(driver);
        batch.othersbuttonclick();
        batch.batchqulaityclick();
        System.out.println("The Batchquality page opened successfully!!!");

        //Emptyshift confirmation click
        EmptyShiftpage shift = new EmptyShiftpage(driver);
        shift.othersbuttonclick();
        shift.Emptyshiftclick();
        shift.Emptyshiftfacilty();
        shift.Closeclick();
        System.out.println("Empty shift confirmation page opened successfully!!!");

    }
  }


