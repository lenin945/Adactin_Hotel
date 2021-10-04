package org.pom;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation extends BaseClass {

	public BookingConfirmation() {
	PageFactory.initElements(driver , this);
	}
	
	@FindBy(id="order_no")
	private WebElement txtOrderNo;
	
	@FindBy(id="search_hotel")
	private WebElement btnSearchHotel;
	
	@FindBy(id="my_itinerary")
	private WebElement btnMyItinery;

	@FindBy(id="logout")
	private WebElement btnLogOut;

	public WebElement getTxtOrderNo() {
		return txtOrderNo;
	}

	public WebElement getBtnSearchHotel() {
		return btnSearchHotel;
	}

	public WebElement getBtnMyItinery() {
		return btnMyItinery;
	}

	public WebElement getBtnLogOut() {
		return btnLogOut;
	}


	
}
