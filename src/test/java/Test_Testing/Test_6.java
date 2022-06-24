package Test_Testing;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_6 {
  @BeforeMethod
  public void BS() {
	  System.out.println("Browser Open");
  }
  @Test(groups= {"Sanity"})
  public void Test_A() {
	  System.out.println("Test_A");
  }
@Test(groups= {"Regression"})
public void Test_B() {
	System.out.println("Test_B");
}
@Test(groups= {"Sanity"})
public void Test_C() {
	System.out.println("Test_c");
}
@AfterMethod
public void AM() {
	System.out.println("Browser Close");
}
}

