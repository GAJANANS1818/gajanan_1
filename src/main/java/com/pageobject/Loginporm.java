
	package com.pageobject;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;

	public class Loginporm {
		WebElement driver;
	@FindBy(how=How.XPATH,using="//input[@name='email']")
	private WebElement txt_email;
	@FindBy(how=How.XPATH,using="//input[@name='pass']")
	private WebElement txt_pass;
	 
	public WebElement gettext_email() {
		return txt_email;
		
		
	}
	public WebElement gettxt_pass() {
		return txt_pass;
		
	}
	}


