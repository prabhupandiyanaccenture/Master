package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObj {

	//http://newtours.demoaut.com/mercurywelcome.php
	WebDriver driver;
	By Firstname = By.name("userName");
	By Password = By.name("password");
	By signin = By.name("login");
	
	public PageObj (WebDriver driver)
	
	{
		this.driver= driver;

	}

public void firstname (String name)
	
	{
		driver.findElement(Firstname).sendKeys(name);
	}

public void password (String password)

{
	driver.findElement(Password).sendKeys(password);

}

public void sigin ()

{
	driver.findElement(signin).click();

}
	
}
