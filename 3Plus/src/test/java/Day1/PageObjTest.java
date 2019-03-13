package Day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PageObjTest {

  @Test
  public void Login() throws Throwable {

	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_C2D.02.12\\Documents\\Prabhu\\chromedriver.exe");
  WebDriver driver= new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("http://newtours.demoaut.com/mercurywelcome.php");
  File src= new File("C:\\Users\\training_C2D.02.12\\Documents\\Prabhu\\Data driven.xlsx");
	FileInputStream fis= new FileInputStream(src);
	XSSFWorkbook wb= new XSSFWorkbook(fis);
	XSSFSheet sheet= wb.getSheetAt(1);
	
	for(int i=0;i<3;i++)
	{
	
	String data0= sheet.getRow(i).getCell(0).getStringCellValue();
	System.out.println("Data from excel"+ data0);
	
	sheet.getRow(i).getCell(1).setCellType(Cell.CELL_TYPE_STRING);

	String data1= sheet.getRow(i).getCell(1).getStringCellValue();
	System.out.println("Data from excel"+ data1);
	
  PageObj login = new PageObj(driver);
  login.firstname(data0);
  login.password(data1);
  login.sigin();
  driver.navigate().back();
  WebDriverWait wait= new WebDriverWait(driver,10);
  wait.until(ExpectedConditions.titleIs("Welcome: Mercury Tours"));
	}
  driver.quit();
  }


}
