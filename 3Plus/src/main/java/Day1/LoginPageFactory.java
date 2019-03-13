package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageFactory {
	
	//WebDriver driver;
	
@FindBy(how=How.NAME, using="userName")
WebElement firstname;
@FindBy(how=How.NAME, using="password")
WebElement Password;
@FindBy(how=How.NAME, using="login")
WebElement signin;
	
/*public LoginPageFactory (WebDriver driver)

{
	this.driver= driver;

}*/

public void form (String username,String password)

{
	firstname.sendKeys(username);
	Password.sendKeys(password);

}

public void sigin ()
{
	signin.click();

}

}
