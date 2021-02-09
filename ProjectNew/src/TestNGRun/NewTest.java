package TestNGRun;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class NewTest {
	WebDriver driver;
	private String Url="https://www.grootan.com";
  @Test
  public void f() {
	  System.out.println("Hello");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Murugavel-pc\\Desktop\\eclipse project\\chromedriver_win32_88\\chromedriver.exe");  
		driver=new ChromeDriver();  
		Url="window.open(\""+Url+"\",\"_self\")";
//		closeTabs();
//		ClearBrowserCache();
		((JavascriptExecutor)driver).executeScript(Url);
		driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
		driver.manage().window().maximize();
  }
   @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
