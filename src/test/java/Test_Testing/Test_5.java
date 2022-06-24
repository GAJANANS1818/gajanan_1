package Test_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_5 {
	WebDriver driver;
	@Parameters({"BrowserName"})
  @BeforeMethod
  public void BS(String BrowserName) {
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://www.netflix.com/in/Login");
			System.out.println("Browser Open -Chrome");
		}
		else if(BrowserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.get("https://www.netflix.com/in/Login");
			System.out.println("Browser Open -Edge");
		}
  }
  @Test(priority=1,enabled=false)
  public void Test_A() {
	  System.out.println("Test_A");
  }
@Test(priority=0,invocationCount=2)
public void Test_B() {
	System.out.println("Test_B");
}
@Test(priority=2,dependsOnMethods="Test_B")
public void Test_C() {
	System.out.println("Test_c");
	Assert.assertTrue(false);
}
@AfterMethod
public void AM() {
	driver.quit();
	System.out.println("Browser Close");
}
}


