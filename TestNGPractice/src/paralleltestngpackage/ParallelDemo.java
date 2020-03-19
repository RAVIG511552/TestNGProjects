package paralleltestngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelDemo {
  
  @Test
  public void orangelogin() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\Jarfiles\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println("I am test1"+Thread.currentThread().getId());
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		System.out.println("I am test1"+Thread.currentThread().getId());
		driver.findElement(By.className("button")).click();
  }
  
  @Test
  public void demowebshoplogin() {
	  System.setProperty("webdriver.gecko.driver", "E:\\Jarfiles\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		driver1.get("http://demowebshop.tricentis.com/login");
		System.out.println("I am test2: "+Thread.currentThread().getId());

		driver1.findElement(By.id("Email")).sendKeys("naniravi4664@gmail.com");
		driver1.findElement(By.name("Password")).sendKeys("pwd@123");
		driver1.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
  }
  
  @Test
  public void demowebshoplogin2() {
	  System.setProperty("webdriver.gecko.driver", "E:\\Jarfiles\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		driver1.get("http://demowebshop.tricentis.com/login");
		System.out.println("I am test3: "+Thread.currentThread().getId());

		driver1.findElement(By.id("Email")).sendKeys("chetan.prf55@gmail.com");
		driver1.findElement(By.name("Password")).sendKeys("chetan");
		driver1.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
  }
}
