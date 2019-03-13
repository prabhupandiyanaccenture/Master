package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExec {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_C2D.02.12\\Documents\\Prabhu\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.allstate.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String stext = js.executeScript("return document.title;").toString();
		System.out.println(stext);
		
		WebElement contacticon = driver.findElement(By.linkText("Contact Us"));
		JavascriptExecutor js1= (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();",contacticon);
		
		JavascriptExecutor js2= (JavascriptExecutor)driver;
		js2.executeScript("alert('Hello prabhu');",driver.findElement(By.xpath("/html/body")));

	}

}
