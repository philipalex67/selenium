package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
WebDriver driver;
	
	@BeforeMethod
	public void launch () 
	{
		  
		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		  driver =new ChromeDriver();
		   driver.get("http://34.71.190.204:32768/addressbook/");
	 		driver.manage().window().maximize();
	 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
	}
  @Test
  public void verifysite() {
	  
	 //iring x = driver.getTitle();
	//ystem.out.println(x);
	//ssert.assertEquals(x, x);
	  
	driver.findElement(By.xpath("//div[@class='v-button v-widget']")).click();
//river.findElement(By.id("login")).sendKeys("philip");
	driver.findElement(By.id("gwt-uid-5")).sendKeys("philip");
	driver.findElement(By.id("gwt-uid-7")).sendKeys("alexander");
	driver.findElement(By.id("gwt-uid-9")).sendKeys("9717272886");
	driver.findElement(By.id("gwt-uid-11")).sendKeys("alexander.philip1@gmail.com");
	driver.findElement(By.id("gwt-uid-13")).sendKeys("06/06/1988");
	driver.findElement(By.xpath("//div[@class='v-button v-widget primary v-button-primary']")).click();
	//v-button v-widget primary v-button-primary
	//driver.findElement(By.name("login")).sendKeys("philip");
	//driver.findElement(By.name("login")).sendKeys("philip");
	//driver.findElement(By.name("login")).sendKeys("philip");
	  
  }
@AfterMethod
  
  public void close () {
	  driver.close();
  }
  
}
