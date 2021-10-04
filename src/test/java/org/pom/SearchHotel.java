package org.pom;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {

	public SearchHotel() {
	PageFactory.initElements(driver , this);
	}
	
	@FindBy(id="location")
	private WebElement dropDownLocation;
	
	@FindBy(id="hotels")
	private WebElement dropDownHotels;
	
	@FindBy(id="room_type")
	private WebElement dropDownRoomType;

	@FindBy(id="room_nos")
	private WebElement dropDownNoOfRooms;
	
	@FindBy(id="datepick_in")
	private WebElement txtCheckIn;
	
	@FindBy(id="datepick_out")
	private WebElement txtCheckOut;
	
	@FindBy(id="adult_room")
	private WebElement dropDownAdults;
	
	@FindBy(id="child_room")
	private WebElement dropDownChildren;
	
	@FindBy(id="Submit")
	private WebElement btnSearch;
	
	@FindBy(xpath="//a[text()='Search Hotel']")
	private WebElement btnSearchHotel;
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement btnBookedItinery;
	
	@FindBy(xpath="//a[text()='Change Password']")
	private WebElement btnChangePassword;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement btnLogout;
	
	

	public WebElement getBtnSearchHotel() {
		return btnSearchHotel;
	}

	public WebElement getBtnBookedItinery() {
		return btnBookedItinery;
	}

	public WebElement getBtnChangePassword() {
		return btnChangePassword;
	}

	public WebElement getBtnLogout() {
		return btnLogout;
	}

	public WebElement getDropDownLocation() {
		return dropDownLocation;
	}

	public WebElement getDropDownHotels() {
		return dropDownHotels;
	}

	public WebElement getDropDownRoomType() {
		return dropDownRoomType;
	}

	public WebElement getDropDownNoOfRooms() {
		return dropDownNoOfRooms;
	}

	public WebElement getTxtCheckIn() {
		return txtCheckIn;
	}

	public WebElement getTxtCheckOut() {
		return txtCheckOut;
	}

	public WebElement getDropDownAdults() {
		return dropDownAdults;
	}

	public WebElement getDropDownChildren() {
		return dropDownChildren;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
	
}
