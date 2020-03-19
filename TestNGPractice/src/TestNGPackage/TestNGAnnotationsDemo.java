package TestNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationsDemo {
	@BeforeSuite
	public void setProperty(){
		System.out.println("Set the property");
	}
	@BeforeTest
	public void checkURL(){
		System.out.println("Check URL");
	}
	@BeforeClass
	public void launchBrowser(){
		System.out.println("URL Launched");
	}
	@BeforeMethod
	public void getTitle(){
		System.out.println("Fetch title");
	}
	@Test
	public void verifyURL(){
		System.out.println("URL verified");
	}
	@AfterMethod
	public void checkLogin(){
		System.out.println("Logged in successfully");
	}
	@AfterClass
	public void logout(){
		System.out.println("Logged out successfully");
	}
	@AfterTest
	public void checkPage(){
		System.out.println("correct page");
	}
	@AfterSuite
	public void getProperty(){
		System.out.println("Get property");
	}
}
