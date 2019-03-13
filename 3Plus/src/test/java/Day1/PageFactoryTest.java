package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PageFactoryTest {
	
	 
	@Test
  public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_C2D.02.12\\Documents\\Prabhu\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
	  driver.get("http://newtours.demoaut.com/mercurywelcome.php");
	  LoginPageFactory login = PageFactory.initElements(driver,LoginPageFactory.class);
	  login.form("Prabhu","Password");
	  login.sigin();
	  driver.quit();
  }
  
}
