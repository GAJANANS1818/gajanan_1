package Test_Testing;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildWindow {
	@Test
	public void verifyTest_A() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://guru99.com/popup.php");
		driver.manage().window().maximize();
		String parentaddress=driver.getWindowHandle();
		System.out.println(parentaddress);
		driver.findElement(By.xpath("//a[@target='_blank']")).click();
		Set<String> AllAddress=driver.getWindowHandles();
		System.out.println(AllAddress);
		Iterator<String> Iterator=AllAddress.iterator();
		while(Iterator.hasNext()) {
			String ChildAddress=Iterator.next();
			if(!parentaddress.equalsIgnoreCase(ChildAddress)) {
				driver.switchTo().window(ChildAddress);
				WebElement txt_id=driver.findElement(By.xpath("//input[@name='emailid']"));
				txt_id.sendKeys("Gajanan18");
				WebElement btn_submit=driver.findElement(By.xpath("//input[@name='btnLogin']"));
				btn_submit.click();
				driver.close();
				
				
				
			}
		}
		driver.switchTo().window(parentaddress);
		driver.close();
		
	}
}