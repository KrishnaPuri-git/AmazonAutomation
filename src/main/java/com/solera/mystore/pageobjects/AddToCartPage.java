package com.solera.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solera.mystore.actiondriver.Action;
import com.solera.mystore.base.Base;

public class AddToCartPage extends Base{
	@FindBy(xpath = "//*[@id='sc-buy-box-ptc-button']/span")
	// //*[@id="buy-now-button"]
	// //*[@id="add-to-cart-button"]
	// //*[@id="add-to-cart-button"]
	WebElement ProceedToBuy;
	

	
	public AddToCartPage() throws Exception {
		PageFactory.initElements(driver, this);

	}
	
	public CheckOut ClickOnProceedToBuy() throws Throwable {
		
		
		Action.click(driver, ProceedToBuy);
		return new CheckOut();
	}

}
