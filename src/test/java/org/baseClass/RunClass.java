package org.baseClass;

import org.pom.BookAHotel;
import org.pom.BookingConfirmation;
import org.pom.LoginPage;
import org.pom.SearchHotel;
import org.pom.SelectHotel;

public class RunClass extends BaseClass {

		public static void main(String[] args) {
			
			launchChromeBrowser();
			launchUrl("https://adactinhotelapp.com/");
			implicitWait();
			LoginPage l = new LoginPage();
			fillTextBox(l.getTxtUser(), "lenin1904");
			fillTextBox(l.getTxtPass(), "9943680807");
			btnClick(l.getBtnLogin());
			SearchHotel sh= new SearchHotel();
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
			SelectHotel s = new SelectHotel();
			btnClick(s.getBtnSelect());
			btnClick(s.getBtnContinue());
			BookAHotel b = new BookAHotel();
			fillTextBox(b.getTxtFirstName(), "Lenin");
			fillTextBox(b.getTxtLastName(), "Raju");
			fillTextBox(b.getTxtAddress(), "Kullathupadai Street, Sankarapuram. PIN - 606401");
			fillTextBox(b.getTxtCardNumber(), "1234567891234567");
			select(b.getDropDownCardType(), "VISA");
			select(b.getDropDownMonth(), "6");
			select(b.getDropDownYear(), "2022");
			fillTextBox(b.getTxtCvv(), "4564");
			btnClick(b.getBtnBookNow());
			BookingConfirmation bc=new BookingConfirmation();
			String orderID = getAttribute(bc.getTxtOrderNo());
			System.out.println("Order ID is "+orderID);
		
		}
}
