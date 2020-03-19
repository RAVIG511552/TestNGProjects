package gridpackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class GridDemo {
  
  WebDriver driver;
  String baseurl,nodeurl;
  
  @BeforeTest
  public void beforeSimpleTest() throws MalformedURLException {
	  baseurl="http://newtours.demoaut.com/";
	  nodeurl="http://172.24.78.43:4444/wd/hub";
	  
	  DesiredCapabilities caps=DesiredCapabilities.chrome();
	  caps.setBrowserName("chrome");
	  caps.setPlatform(Platform.WINDOWS);
	
	  driver=new RemoteWebDriver(new URL(nodeurl),caps);
  }
  
  @Test
  public void simpleTest() {
	  driver.get(baseurl);
	  Assert.assertEquals("Welcome: Mercury Tours",driver.getTitle());
  }
  
  @AfterTest
  public void afterTest() {
	  //driver.quit();
  }

}
