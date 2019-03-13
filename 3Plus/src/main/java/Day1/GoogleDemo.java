package Day1;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_C2D.02.12\\Documents\\Prabhu\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium");	
		Actions act= new Actions(driver);
		WebElement submit =driver.findElement(By.name("btnK"));
		act.clickAndHold(submit).release(submit);
		act.build().perform();

	}

}
