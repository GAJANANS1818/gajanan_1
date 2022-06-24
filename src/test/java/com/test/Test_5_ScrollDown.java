package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_5_ScrollDown {
	@Test
	public void Test_scrollDown() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/login/");
		driver.manage().window().maximize();
		
		JavascriptExecutor JS=(JavascriptExecutor) driver;
		JS.executeScript("window.scrollBy(0,500)","");
		WebElement mrt_txt=driver.findElement(By.xpath("//a[@title='Marathi']"));
		JS.executeScript("arguments[0].scrollIntoView();", mrt_txt);
		JS.executeScript("window.scrollTo(0,document.body.scrollHeight)");
}
}