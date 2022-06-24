package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		//WebElement selenium_btn=driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[1]"));
		Actions act=new Actions(driver);
		//act.moveToElement(selenium_btn).click().build().perform();
		
		WebElement src_element=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement dest_element=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Thread.sleep(2000);
		
		
		WebElement src_amt=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement dest_amt=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		Thread.sleep(2000);
		
		
		WebElement src_sales=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement dest_sales=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		Thread.sleep(2000);
		
		WebElement src_salesamt=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement dest_salesamt=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		act.dragAndDrop(src_element, dest_element).perform();
		act.dragAndDrop(src_amt,dest_amt).perform();
		act.dragAndDrop(src_sales, dest_sales).perform();
		act.dragAndDrop(src_salesamt, dest_salesamt).perform();
		
		Thread.sleep(2000);
	WebElement perfect_btn=driver.findElement(By.xpath("//a[@class='button button-green']"));
	Actions a=new Actions(driver);
	act.moveToElement(perfect_btn).click().build().perform();
	Thread.sleep(2000);
	}

}
