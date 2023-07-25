package com.solera.mystore.pageobjects;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solera.mystore.actiondriver.Action;
import com.solera.mystore.base.Base;

public class HomePage  extends Base{
	
	@FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
	WebElement searchBar;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement searchSubmitBtn;
	
//	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div")
//	WebElement firstProduct;
	//*[@id="search"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span
				   
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")
	WebElement firstProduct;
	// //*[@id="buy-now-button"]
	// //input[@id='add-to-cart-button']
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement AddToCart;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void SearchProduct() throws Throwable {
		Action.type(searchBar, "Nothing Phone (2) 5G (Dark Grey, 12GB RAM, 256GB Storage)");
		Action.click(driver, searchSubmitBtn);
	}
	
	public AddToCartPage SelectFirstProduct() throws Exception {
		Action.click(driver, firstProduct);
	      Action.Wait(driver, 10);
	      
//	      ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	      List<String> newTb = new ArrayList<String>(driver.getWindowHandles());

	      driver.switchTo().window(newTb.get(1));
	      System.out.println("tab switched");
	      Action.Wait(driver, 7);	  
	      Action.click(driver, AddToCart);	
	      return new AddToCartPage();
	}
}
