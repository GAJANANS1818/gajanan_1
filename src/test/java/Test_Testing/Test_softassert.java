package Test_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_softassert {
@Test
public void TestB() {
	WebDriverManager.chromedriver().setup();
	WebDriver Driver=new ChromeDriver();
	SoftAssert soft=new SoftAssert();
	Driver.get("https://www.netflix.com/in/Login");
	Driver.manage().window().maximize();
	WebElement txt_email=Driver.findElement(By.xpath("//input[@name='userLoginId']"));
	
	soft.assertEquals(txt_email.isEnabled(), true);
	System.out.println("Test");
	soft.assertTrue(true);
	System.out.println("Test_2");
	soft.assertAll();
}
}
