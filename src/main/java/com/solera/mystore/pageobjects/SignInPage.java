package com.solera.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solera.mystore.actiondriver.Action;
import com.solera.mystore.base.Base;

public class SignInPage extends Base{
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement emailTextbox;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement continueBtn;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement passwordTextbox;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement signInSubmitBtn;
	
	public SignInPage() { 
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String uname,String pwd) throws Throwable{
		Action.type(emailTextbox, uname);
		Action.click(driver, continueBtn);
		Action.Wait(driver, 5);
		Action.type(passwordTextbox, pwd);
		Action.click(driver, signInSubmitBtn);
		Action.Wait(driver, 40);
		return new HomePage();
	}

}
