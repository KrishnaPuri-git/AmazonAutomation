package com.solera.mystore.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solera.mystore.actiondriver.Action;
import com.solera.mystore.base.Base;

public class IndexPage extends Base {
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement navToSignIn;
	
//	@FindBy(xpath="//div[@id='nav-flyout-ya-signin']//span[text()='Sign in']")
//	WebElement signInBtn;
	
	public IndexPage() {
		PageFactory.initElements(driver, this);
	}
	
	public SignInPage clickOnSignInBtn() throws Throwable{
		Action.click(driver,navToSignIn);
//		Action.click(driver, signInBtn);
		return new SignInPage();		
	}
}