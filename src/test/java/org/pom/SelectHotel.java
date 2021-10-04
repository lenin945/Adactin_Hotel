package org.pom;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {

	public SelectHotel() {
	PageFactory.initElements(driver , this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement btnSelect;
	
	@FindBy(id="continue")
	private WebElement btnContinue;

	public WebElement getBtnSelect() {
		return btnSelect;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}
	
	
}
