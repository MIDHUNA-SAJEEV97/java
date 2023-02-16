package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelRead{
	XSSFSheet sh;
	
public ExcelRead() throws IOException
{
	FileInputStream f=new FileInputStream("C:\\eclipse new\\My_maven122\\src\\main\\resources\\Book1.xlsx");
	XSSFWorkbook w=new XSSFWorkbook(f);  
	sh=w.getSheet("Sheet");
}
public void readFile()
{
	for(Row r: sh)     //foreach loop
	{
		for(Cell c:r)
		{
			System.out.print(c+" ");
		}
		System.out.println();
	}
}
	public String readData(int i,int j) {
		Row r=sh.getRow(i);
		Cell c=r.getCell(j);
		int cellType=c.getCellType();
		switch(cellType)
		{
		case Cell.CELL_TYPE_STRING:
			String data;
			data=c.getStringCellValue();
	 		return data;
			
		case Cell.CELL_TYPE_NUMERIC:
			double value;
			value=c.getNumericCellValue();
			return String.valueOf(value);
			default:
				return null;
				
		}
	}
}



