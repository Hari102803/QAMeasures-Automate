package Tests;

import Pages.*;
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
        batch.OthersClickservice();
        batch.batchqulaityclick();
        System.out.println("The Batchquality page opened successfully!!!");

        //Emptyshift confirmation click
        EmptyShiftpage shift = new EmptyShiftpage(driver);
        shift.OthersClickservice();
        shift.Emptyshiftclick();
        shift.Emptyshiftfacilty();
        shift.Closeclick();
        System.out.println("Empty shift confirmation page opened successfully!!!");

        //GasCalendarUI click //GasCalendar filtercllick //Moreshift click
        GasCalendar calendar = new GasCalendar(driver);
        calendar.OthersClickservice();
        calendar.Gascalendarservice();
        calendar.GasUIbuttonclick();
        System.out.println("GasCalendar page opened successfully!!!");
        calendar.filterclick("ABRAZO ARROWHEAD","test_ob");
        System.out.println("Filter opened successfully");
        calendar.Moreshiftclick();
        //System.out.println("More shift opened successfully");

        //Add shift click
        AddShift add = new AddShift(driver);
        add.OthersClickservice();
        add.Gascalendarservice();
        System.out.println("Add shift pop-up opened successfully");
        add.Addshiftclick("06-09-2025" ,"17:20","07-09-2025" , "17:20");


    }
  }


