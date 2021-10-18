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
	public void before() throws IOException {
		System.out.println("Test Strat Time " + date());
		launchUrl("https://adactinhotelapp.com/");
		implicitWait();
		l = new LoginPage();
		fillTextBox(l.getTxtUser(), readCell("adactin_login_details", 2, 0));
		fillTextBox(l.getTxtPass(), readCell("adactin_login_details", 2, 1));
		btnClick(l.getBtnLogin());
	}

	@After
	public void after() {
		System.out.println("Test End Time " + date());
	}

	@AfterClass
	public static void afterClass() {
		//quitBrowser();
	}

	@Test
	public void hotelBooking() throws IOException {
		sh = new SearchHotel();
		select(sh.getDropDownLocation(), readCell("adactin_login_details", 2, 2));
		select(sh.getDropDownHotels(), readCell("adactin_login_details", 2, 3));
		select(sh.getDropDownRoomType(), readCell("adactin_login_details", 2, 4));
		select(sh.getDropDownNoOfRooms(), readCell("adactin_login_details", 2, 5));
		clearTxtBox(sh.getTxtCheckIn());
		fillTextBox(sh.getTxtCheckIn(), readCell("adactin_login_details", 2, 6));
		clearTxtBox(sh.getTxtCheckOut());
		fillTextBox(sh.getTxtCheckOut(), readCell("adactin_login_details", 2, 7));
		select(sh.getDropDownAdults(), readCell("adactin_login_details", 2, 8));
		select(sh.getDropDownChildren(), readCell("adactin_login_details", 2, 9));
		btnClick(sh.getBtnSearch());
		 s = new SelectHotel();
		btnClick(s.getBtnSelect());
		btnClick(s.getBtnContinue());
		 b = new BookAHotel();
		fillTextBox(b.getTxtFirstName(), readCell("adactin_login_details", 2, 10));
		fillTextBox(b.getTxtLastName(), readCell("adactin_login_details", 2, 11));
		fillTextBox(b.getTxtAddress(), readCell("adactin_login_details", 2, 12));
		fillTextBox(b.getTxtCardNumber(), readCell("adactin_login_details", 2, 13));
		select(b.getDropDownCardType(), readCell("adactin_login_details", 2, 14));
		select(b.getDropDownMonth(), readCell("adactin_login_details", 2, 15));
		select(b.getDropDownYear(), readCell("adactin_login_details", 2, 16));
		fillTextBox(b.getTxtCvv(), readCell("adactin_login_details", 2, 17));
		btnClick(b.getBtnBookNow());
//		bc = new BookingConfirmation();
//		String orderIDNo = getAttribute(bc.getTxtOrderNo());
//		System.out.println("Order ID is " + orderIDNo);
//		createCell("Adactin", "OrderNo", 1, 1, orderIDNo);
	}

	@Ignore
	@Test
	public void cancelBooking() throws IOException {
		sh = new SearchHotel();
		btnClick(sh.getBtnBookedItinery());
		BookedItinerary bi=new BookedItinerary();
		String id = readCell("OrderNo", 1, 1);
		System.out.println(id);
		fillTextBox(bi.getTxtSearchBox(), id );
		btnClick(bi.getBtnGo());
		btnClick(bi.getBtnCancel());
		alertAccept();
		System.out.println("Canceled Last Generated Order ID");
	}
}






