package com.Pom;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class PomClass extends BaseClass {

	public PomClass()
	{
		PageFactory.initElements(wd,this);
	}
	
	@FindBy(xpath = "//a[text()='Have an account? Log in']")
	private WebElement login;
	
	public WebElement getLogin() {
		return login;
	}

	@FindBy(id = "emph")
	private WebElement mobileNum;
	
	public WebElement getMobileNum() {
		return mobileNum;
	}

	@FindBy(xpath = "//input[@value='NEXT']")
	private WebElement clickNext;
	
	public WebElement getClickNext() {
		return clickNext;
	}

	
	@FindBy(id = "men_category")
	private WebElement SelectMen;

	public WebElement getSelectMen() {
		return SelectMen;
	}

	@FindBy(xpath = "//a[text()='Suits & Blazers']")
	private WebElement TopWearItem;

	public WebElement getTopWearItem() {
		return TopWearItem;
	}
	
	@FindBy(xpath = "(//img[@class='dB h412 w310 mA pR prdI gtm-p an-ll o0'])[3]")
	private WebElement wishedItem;

	public WebElement getWishedItem() {
		return wishedItem;
	}
	
//	@FindBy(xpath = "//span[text()=' 38 ']")
//	private WebElement selectsize_M;
//
//	public WebElement getSelectsize_M() {
//		return selectsize_M;
//	}
	
	@FindBy(xpath = "//div[text()='ADD TO CART']")
	private WebElement itemAdded;

	public WebElement getItemAdded() {
		return itemAdded;
	}
		
	@FindBy(xpath = "//span[text()=' 40 ']")
	private WebElement selectsize_L;

	public WebElement getSelectsize_L() {
		return selectsize_L;
	}
	
//	
	
}
