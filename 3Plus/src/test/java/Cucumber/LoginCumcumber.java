package Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginCumcumber {

	WebDriver driver;
	String Expected = "Home";

@Given("^user is on the homepage$")
public void user_is_on_the_homepage() throws Throwable {
    
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_C2D.02.12\\Documents\\Prabhu\\chromedriver.exe");
	 driver= new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");  
}

@When("^user enters username and password and clicks submit button$")
public void user_enters_username_and_password_and_clicks_submit_button() throws Throwable {
    
	driver.findElement(By.linkText("SignIn")).click();
	  driver.findElement(By.name("userName")).sendKeys("lalitha");
	  driver.findElement(By.name("password")).sendKeys("Password123");
	  driver.findElement(By.name("Login")).click();
}

@Then("^login is successful$")
public void login_is_successful() throws Throwable {
    
	Assert.assertEquals(Expected, driver.getTitle());
	driver.close();
}

	
}
