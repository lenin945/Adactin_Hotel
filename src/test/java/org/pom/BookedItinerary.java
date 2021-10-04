package org.pom;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItinerary extends BaseClass {

	public BookedItinerary() {
	PageFactory.initElements(driver , this);
	}
	
	@FindBy(id="order_id_text")
	private WebElement txtSearchBox;
	
	@FindBy(id="search_hotel_id")
	private WebElement btnGo;
	
	@FindBy(name="ids[]")
	private WebElement checkBox;
	
	@FindBy(name="cancelall")
	private WebElement btnCancel;

	public WebElement getTxtSearchBox() {
		return txtSearchBox;
	}

	public WebElement getBtnGo() {
		return btnGo;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}
	

}
