package Day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Robots {
	WebDriver driver;
	
  @Test
  public void test1() throws InterruptedException, AWTException {
	  
      driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/ul[1]/li[3]/a")).click();            
          Robot robot = new Robot();            
          Thread.sleep(2000); // Thread.sleep throws InterruptedException    
          robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key of keyboard to navigate and select Save radio button               
          Thread.sleep(2000);  
          robot.keyPress(KeyEvent.VK_TAB);      
          Thread.sleep(2000);    
          robot.keyPress(KeyEvent.VK_TAB);      
          Thread.sleep(2000);    
          robot.keyPress(KeyEvent.VK_TAB);      
          Thread.sleep(2000);    
          robot.keyPress(KeyEvent.VK_ENTER); 
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	 /* System.setProperty("webdriver.gecko.driver", "C:\\Users\\training_C2D.02.12\\Documents\\Prabhu\\geckodriver.exe");
		 driver=new FirefoxDriver();*/
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\training_C2D.02.12\\Documents\\Prabhu\\MicrosoftWebDriver.exe");
		 driver=new EdgeDriver();
	  
		 driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/"); 
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
