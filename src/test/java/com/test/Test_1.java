package com.test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageobject.Loginporm;
import com.utility.BaseClass;


public class Test_1 extends BaseClass {
@Test
public void test_001()  {

	Loginporm login=PageFactory.initElements(driver, Loginporm.class);
	login.gettext_email().sendKeys("Gajanan");
	login.gettxt_pass().sendKeys("Sawale");
	
	
}
@Test
public void test_002() {
	
	Loginporm login=PageFactory.initElements(driver, Loginporm.class);
	login.gettext_email().sendKeys("Gajanan");
	login.gettxt_pass().sendKeys("Sawale");	
}
@Test
public void test_003() {
	Loginporm login=PageFactory.initElements(driver, Loginporm.class);
	login.gettxt_pass().sendKeys("Gajanan");
	login.gettxt_pass().sendKeys("Sawale");
}
@Test
public void AfterMethod() {
	driver.quit();
}
}
