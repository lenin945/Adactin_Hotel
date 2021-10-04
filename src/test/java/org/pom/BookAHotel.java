package org.pom;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel extends BaseClass {

	public BookAHotel() {
	PageFactory.initElements(driver , this);
	}
	
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	
	@FindBy(id="last_name")
	private WebElement txtLastName;
	
	@FindBy(id="address")
	private WebElement txtAddress;

	@FindBy(id="cc_num")
	private WebElement txtCardNumber;
	
	@FindBy(id="cc_type")
	private WebElement dropDownCardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement dropDownMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement dropDownYear;
	
	@FindBy(id="cc_cvv")
	private WebElement txtCvv;
	
	@FindBy(id="book_now")
	private WebElement btnBookNow;
	

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCardNumber() {
		return txtCardNumber;
	}

	public WebElement getDropDownCardType() {
		return dropDownCardType;
	}

	public WebElement getDropDownMonth() {
		return dropDownMonth;
	}

	public WebElement getDropDownYear() {
		return dropDownYear;
	}

	public WebElement getTxtCvv() {
		return txtCvv;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}

}
