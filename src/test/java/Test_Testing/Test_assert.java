package Test_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_assert {
@Test
public void Test_A() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.netflix.com/in/Login");
	driver.manage().window().maximize();
	
WebElement txt_email=driver.findElement(By.xpath("//input[@name='userLoginId']"));

String actual="Test";
String expected="Test";

Assert.assertEquals(actual, expected);
Assert.assertEquals(txt_email.isEnabled(), true);
System.out.println("Test");
System.out.println("Hello");

	
	
	
}
	

	
}



