package TestNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstDemoWebShop {
	
	WebDriver driver;
	 
	@Test(description="Test case to start application") //default priority=0
	  public void startapp() {
		  System.setProperty("webdriver.chrome.driver", "E:\\Jarfiles\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://demowebshop.tricentis.com/login");
		  driver.manage().window().maximize();
		  System.out.println("start application");
	 }
	
	@Test(priority=1,description="Test to check title")
	  public void checktitle() {
		  String title=driver.getTitle();
		  String acttitle="Demo Web Shop. Login";
		  System.out.println("Title is: "+title);
		  if(title.equals(acttitle))
		  {
			  System.out.println("correct website");
		  }
		  else
		  {
			  System.out.println("incorrect website");
		  }
	  }
	@Test(priority=2,description="Test case to check login")
	  public void loginapp() {
		  driver.findElement(By.id("Email")).sendKeys("naniravi4664@gmail.com");
		  driver.findElement(By.name("Password")).sendKeys("pwd@123");
		  driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		  System.out.println("Successfully logged in");
	  }
	
	@Test(priority=3,description="Test case to check logout")
	  public void signoff() {
		  driver.findElement(By.linkText("Log out")).click();
		  System.out.println("Successfully logged out");
		  driver.close();
	  }
	
}
