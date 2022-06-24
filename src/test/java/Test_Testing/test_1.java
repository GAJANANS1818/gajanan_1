package Test_Testing;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test_1 {
	@BeforeSuite
	public void BS() {
		System.out.println("Before Suite");
		
	}
	@BeforeClass
	public void BC() {
		System.out.println("Before Class");
	}
	@BeforeTest
	public void BT() {
		System.out.println("Before Test");
	}
	@BeforeMethod
	public void BM() {
		System.out.println("Before Method");
	}
	@Test
	public void test_1(){
		System.out.println("Test_1");
	}
	@AfterMethod
	public void AM() {
		System.out.println("After Method");
	}
	@AfterSuite
	public void AS() {
	System.out.println("After Suite");
	}

}
