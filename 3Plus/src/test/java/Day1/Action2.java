package Day1;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

 
public class Action2 {
	
	WebDriver driver;
	String Expected = "Home";
	
  @Test(priority=1)
  public void SigIn() {
	  
	  driver.findElement(By.linkText("SignIn")).click();
	  driver.findElement(By.name("userName")).sendKeys("lalitha");
	  driver.findElement(By.name("password")).sendKeys("Password123");
	  driver.findElement(By.name("Login")).click();
	  Assert.assertEquals(Expected, driver.getTitle());
  }
  
  @Test(priority=2)
public void CartValidation() {
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  WebElement menu1= driver.findElement(By.linkText("All Categories"));
	  Actions act= new Actions(driver);
	  act.moveToElement(menu1).click().build().perform();
	  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a/span"))).click().build().perform();
	  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"submenuul11290\"]/li[1]/a/span"))).click().build().perform();
	  WebDriverWait wait= new WebDriverWait(driver,10);
	  WebElement addtocart= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")));
	  act.moveToElement(addtocart).click().build().perform();
	
	  driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
	  WebElement quantity=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"quantity_1\"]")));
			  String value= quantity.getAttribute("value");
	  Assert.assertEquals(value,"1");
	  
  }
  
  @BeforeClass
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_C2D.02.12\\Documents\\Prabhu\\chromedriver.exe");
		 driver= new ChromeDriver();
			driver.get("http://10.232.237.143:443/TestMeApp");  
	  
  }

  @AfterClass
  public void afterMethod() {
	  
	  driver.close();
  }

}
