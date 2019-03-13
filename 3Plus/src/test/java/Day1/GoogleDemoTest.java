package Day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class GoogleDemoTest {
	WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_C2D.02.12\\Documents\\Prabhu\\chromedriver.exe");
	 driver= new ChromeDriver();
		driver.get("https://www.google.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }


  @Test
  public void main() {
    
	  driver.findElement(By.name("q")).sendKeys("Selenium");	
		driver.findElement(By.name("q")).submit();
	String s2=	driver.getTitle();
	System.out.print(s2);
	String s1= "Selenium - Google Search";
	Assert.assertEquals(s2, s1);
  }
}
