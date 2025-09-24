package Tests;

import Config.DriverManager;
import Config.config;
import Pages.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static Config.config.*;

public class TestCase extends DriverManager {

  @BeforeMethod
  public void setuptest() {
    super.Setup();
  }
  @Test
  public void Storyvalidation() throws InterruptedException {

    Loginpage login = new Loginpage(driver);
    login.enterUsername(config.USERNAME);
    login.enterPassword(config.PASSWORD);
    login.clicklogin();
    System.out.println(config.ONBOARDING_VALIDATION);

    Homepage home = new Homepage(driver);
    home.QALink();
    System.out.println(config.QA_MEASURES_VALIDATION);
//
    //Create case click
    Createcasepage create = new Createcasepage(driver);
    create.choosefacility();
    create.OthersClickservice();
    create.Addcloseclick();

    //Others button click  //Batchquality button click
    BatchQuality batch = new BatchQuality(driver);
    batch.OthersClickservice();
    batch.batchqulaityclick();
    batch.batchclosebtn();

    //Emptyshift confirmation click
    EmptyShiftpage shift = new EmptyShiftpage(driver);
    shift.OthersClickservice();
    shift.Emptyshiftclick();
    shift.Emptyshiftfacilty();
    shift.Closeclick();
    System.out.println(config.EMPTY_SHIFT_VALIDATION);

    //GasCalendarUI click //GasCalendar filtercllick //Moreshift click
    GasCalendar calendar = new GasCalendar(driver);
    calendar.OthersClickservice();
    calendar.Gascalendarservice();
    calendar.GasUIbuttonclick();
    System.out.println(config.CALENDAR_VALIDATION);
    // calendar.filterclick(Filtervalue,Providervalue);
    System.out.println(config.FILTER_VALIDATION);
    calendar.Moreshiftclick();

    //Add shift click
    AddShift add = new AddShift(driver);
    add.OthersClickservice();
    add.Gascalendarservice();
    System.out.println(config.ADD_SHIFT_VALIDATION);
    add.Addshiftclick(FROM_DATE_DEFAULT,FROM_TIME_DEFAULT,TO_DATE_DEFAULT,TO_TIME_DEFAULT);
    add.addshiftclose();

    //GasShiftclick
    GasShift shiftclick = new GasShift(driver);
    shiftclick.OthersClickservice();
    shiftclick.Gasshiftclick(config.GAS_FROM_DATE_DEFAULT,config.GAS_TO_DATE_DEFAULT);
    System.out.println(config.GAS_SHIFT_VALIDATION);
    System.out.println(config.SHIFT_CLOSE_VALIDATION);

    //GasshiftHistory click
    Gasshifthistory history = new Gasshifthistory(driver);
    history.OthersClickservice();
    System.out.println(config.GAS_HISTORY_VALIDATION);
    history.gasshifthistorryclick();
    history.GashifttabsClick();
    history.Historybackbtn();
    System.out.println(config.HISTORY_CLOSE_VALIDATION);

    //Globalcase click
    Globalcase global = new Globalcase(driver);
    global.OthersClickservice();
    global.Globalcaseclick();
    System.out.println(config.GLOBAL_CASE_VALIDATION);
    global.Globalclose();
    System.out.println(config.GLOBAL_CLOSE_VALIDATION);

    //Peeloff Order click
    PeeloffOrder order = new PeeloffOrder(driver);
    order.OthersClickservice();
    System.out.println(config.PEEL_OFF_ORDER_VALIDATION);
    order.Peelofforderclick(config.ORDER_DATE_DEFAULT);
    order.orderclose();
    System.out.println(config.ORDER_CLOSE_VALIDATION);

    //Transfer case page click
    Transfercasepage transfer = new Transfercasepage(driver);
    transfer.choosefacility();
    transfer.OthersClickservice();
    transfer.Transfercaseclick();
    transfer.Transferclosebtn();
  }
}
