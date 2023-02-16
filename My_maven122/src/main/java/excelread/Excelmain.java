package excelread;
import java.io.IOException;

public class Excelmain
{
	public static void main(String[] args) throws IOException 
	{
	  ExcelRead obj=new ExcelRead();
		obj.readFile();
		String data;
		data=obj.readData(3,0);
		System.out.println("data :"+data);
		//System.out.println("data :"+obj.readData(3,0));
	}

}




