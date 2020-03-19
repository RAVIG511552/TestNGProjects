package TestNGPackage;

import org.testng.annotations.Test;

public class PriorityDemo {
	
  @Test(priority=1,description="Test case to check login")
  public void loginapp() {
	  System.out.println("Login successful");
  }
  
  @Test(description="Test case to start application") //default priority=0
  public void startapp() {
	  System.out.println("Start application");
  }
  
  @Test(priority=2,description="Test case to verify logout")
  public void signoff() {
	  System.out.println("Logout successfull");
  }
}
