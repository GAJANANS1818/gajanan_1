package Test_Testing;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_03 {
  @BeforeMethod
  public void BS() {
	  System.out.println("Browser Open");
  }
  @Test(priority=1,enabled=false)
  public void Test_A() {
	  System.out.println("Test_A");
  }
@Test(priority=0,invocationCount=2)
public void Test_B() {
	System.out.println("Test_B");
}
@Test(priority=2)
public void Test_C() {
	System.out.println("Test_c");
}
@AfterMethod
public void AM() {
	System.out.println("Browser Close");
}
}
