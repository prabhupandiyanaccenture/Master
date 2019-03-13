package Day1;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_C2D.02.12\\Documents\\Prabhu\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://jqueryui.com/resources/demos/resizable/default.html");
		WebElement resize= driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		Actions drag= new Actions(driver);
		drag.dragAndDropBy(resize, 400, 200);
		drag.build().perform();
		drag.wait(2);
		driver.close();
	}

}
