ackage com.testng.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {

	
	@BeforeMethod
	public void login() {
		System.out.println("Application Login");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Application Logout");
	}
	
	
	
	@Test(priority=3) 
	public void TC01() {
		System.out.println("TC01 is executed");
	}
	@Test(invocationCount=5)
	private void TC02() {
		System.out.println("TC02 is executed");
	}
