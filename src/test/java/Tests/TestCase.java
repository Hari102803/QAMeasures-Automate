package Tests;

import Pages.*;
import Utils.Main;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase extends Main {

  @BeforeMethod
    public void setuptest(){

      setup();
    }
    @Test
    public void Storyvalidation(){

        Loginpage login = new Loginpage(driver);
        login.enterUsername(username);
        login.enterPassword(password);
        login.clicklogin();
        System.out.println(Loginvalidation);

        Homepage home = new Homepage(driver);
        home.QALink();
        System.out.println(QAmeasuresvalidation);

        //Others button click  //Batchquality button click
        BatchQuality batch = new BatchQuality(driver);
        batch.OthersClickservice();
        batch.batchqulaityclick();
        System.out.println(Batchqualityvalidation);

        //Emptyshift confirmation click
        EmptyShiftpage shift = new EmptyShiftpage(driver);
        shift.OthersClickservice();
        shift.Emptyshiftclick();
        shift.Emptyshiftfacilty();
        shift.Closeclick();
        System.out.println(Emptyshiftvalidation);

        //GasCalendarUI click //GasCalendar filtercllick //Moreshift click
        GasCalendar calendar = new GasCalendar(driver);
        calendar.OthersClickservice();
        calendar.Gascalendarservice();
        calendar.GasUIbuttonclick();
        System.out.println(CalendarValidation);
        calendar.filterclick(Filtervalue,Providervalue);
        System.out.println(Filtervalidation);
        calendar.Moreshiftclick();

        //Add shift click
        AddShift add = new AddShift(driver);
        add.OthersClickservice();
        add.Gascalendarservice();
        System.out.println(Addshiftvalidation);
        add.Addshiftclick(Fromdate,Fromtime,Todate, Totime);
        System.out.println(Addshiftclosemodel);

        //GasShiftclick
        GasShift shiftclick = new GasShift(driver);
        shiftclick.OthersClickservice();
        shiftclick.Gasshiftclick(Gasfromdate,Gastodate);
        System.out.println(Gasshiftvalidation);
        System.out.println(Shiftclosevalidation);

        //GasshiftHistory click
        Gasshifthistory history = new Gasshifthistory(driver);
        history.OthersClickservice();
        System.out.println(Gashistoryvalidation);
        history.gasshifthistorryclick();
        history.GashifttabsClick();
        history.Historybackbtn();
        System.out.println(Historyclosevalidation);

        //Globalcase click
        Globalcase global = new Globalcase(driver);
        global.OthersClickservice();
        global.Globalcaseclick();
        System.out.println(Globalcasevalidation);
        global.Globalclose();
        System.out.println(Globalclosevalidation);

        //Peeloff Order click
        PeeloffOrder order = new PeeloffOrder(driver);
        order.OthersClickservice();
        System.out.println(Peeloffordervalidation);
        order.Peelofforderclick(Orderdate);
        order.orderclose();
        System.out.println(Orderclosevalidation);

        //Transfer case page click
        Transfercasepage transfer = new Transfercasepage(driver);
        transfer.choosefacility();
        transfer.OthersClickservice();
        transfer.Transfercaseclick();
        System.out.println(Transfercsevalidation);

    }

}
