package org.junit;

import java.io.IOException;

import org.baseClass.BaseClass;
import org.pom.BookAHotel;
import org.pom.BookedItinerary;
import org.pom.BookingConfirmation;
import org.pom.LoginPage;
import org.pom.SearchHotel;
import org.pom.SelectHotel;

public class OrderID extends BaseClass {

	 LoginPage l;
	 BookingConfirmation bc;
	 SearchHotel sh;
	 SelectHotel s;
	 BookAHotel b;
	 BookedItinerary bi;
	 
	@BeforeClass
	public static void beforClass() {
		launchChromeBrowser();
	}

	@Before
	public void before() {
		System.out.println("Test Strat Time " + date());
		launchUrl("https://adactinhotelapp.com/");
		implicitWait();
		l = new LoginPage();
		fillTextBox(l.getTxtUser(), "lenin1904");
		fillTextBox(l.getTxtPass(), "9943680807");
		btnClick(l.getBtnLogin());
	}

	@After
	public void after() {
		System.out.println("Test End Time " + date());
	}

	@AfterClass
	public static void afterClass() {
		quitBrowser();
	}

	@Test
	public void hotelBooking() throws IOException {
		sh = new SearchHotel();
		select(sh.getDropDownLocation(), "London");
		select(sh.getDropDownHotels(), "Hotel Sunshine");
		select(sh.getDropDownRoomType(), "Double");
		select(sh.getDropDownNoOfRooms(), "4");
		clearTxtBox(sh.getTxtCheckIn());
		fillTextBox(sh.getTxtCheckIn(), "12/10/2021");
		clearTxtBox(sh.getTxtCheckOut());
		fillTextBox(sh.getTxtCheckOut(), "13/10/2021");
		select(sh.getDropDownAdults(), "3");
		select(sh.getDropDownChildren(), "3");
		btnClick(sh.getBtnSearch());
		 s = new SelectHotel();
		btnClick(s.getBtnSelect());
		btnClick(s.getBtnContinue());
		 b = new BookAHotel();
		fillTextBox(b.getTxtFirstName(), "Lenin");
		fillTextBox(b.getTxtLastName(), "Raju");
		fillTextBox(b.getTxtAddress(), "Kullathupadai Street, Sankarapuram. PIN - 606401");
		fillTextBox(b.getTxtCardNumber(), "1234567891234567");
		select(b.getDropDownCardType(), "VISA");
		select(b.getDropDownMonth(), "6");
		select(b.getDropDownYear(), "2022");
		fillTextBox(b.getTxtCvv(), "4564");
		btnClick(b.getBtnBookNow());
		bc = new BookingConfirmation();
		String orderIDNo = getAttribute(bc.getTxtOrderNo());
		System.out.println("Order ID is " + orderIDNo);
		createCell("Adactin", "OrderNo", 1, 1, orderIDNo);
	}

	
	@Test
	public void cancelBooking() throws IOException {
		sh = new SearchHotel();
		btnClick(sh.getBtnBookedItinery());
		BookedItinerary bi=new BookedItinerary();
		String id = readCell("Adactin", "OrderNo", 1, 1, "dd-MM-YYYY");
		System.out.println(id);
		fillTextBox(bi.getTxtSearchBox(), id );
		btnClick(bi.getBtnGo());
		btnClick(bi.getBtnCancel());
		alertAccept();
		System.out.println("Canceled Last Generated Order ID");
	}
}






