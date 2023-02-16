package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	XSSFSheet sh;
	
public ExcelRead() throws IOException
{
	FileInputStream f=new FileInputStream("C:\\eclipse new\\My_maven\\src\\main\\resources\\Book1.xlsx");
	XSSFWorkbook w=new XSSFWorkbook(f);  
	sh=w.getSheet("Sheet1");
}
public void readFile()
{
	for(Row r: sh)     //foreach loop
	{
		for(Cell c:r)
		{
			System.out.print(c+ " ");
		}
		System.out.println();
	}
}
}