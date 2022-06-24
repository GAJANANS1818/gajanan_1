package Test_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_script1 {
WebDriver driver;
@BeforeMethod
public void BM() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.netflix.com/in/Login");
	driver.manage().window().maximize();
	
}
@Test(priority=-1)
public void Test_a() throws InterruptedException {
	WebElement txt_username=driver.findElement(By.xpath("//input[@name='userLoginId']"));
	txt_username.sendKeys("Gajanan18");
	Thread.sleep(2000);
	System.out.println("a");
	
}
@Test(priority=0)
public void Test_b() throws InterruptedException {
	WebElement txt_password=driver.findElement(By.xpath("//input[@id='id_password']"));
	txt_password.sendKeys("9112791370");
	Thread.sleep(2000);
	System.out.println("b");
	
}
@Test
public void Test_c() throws InterruptedException {
	WebElement btn_signin=driver.findElement(By.xpath("//input[@name='userLoginId']"));
	btn_signin.click();
	Thread.sleep(2000);
	System.out.println("c");
	
}
@AfterMethod
public void AM() {
	driver.quit();
}
}
