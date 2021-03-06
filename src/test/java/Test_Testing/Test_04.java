package Test_Testing;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test_04 {
	@Parameters({"BrowserName"})
  @BeforeMethod
  public void BS(String BrowserName) {
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			System.out.println("Browser Open -Chrome");
		}
		else if(BrowserName.equalsIgnoreCase("Edge")) {
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
	System.out.println("Browser Close");
}
}

