package Day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataExcel {
	

	public static void main(String[] args) throws IOException 
	
	{
	
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
	
	}
	}
}
