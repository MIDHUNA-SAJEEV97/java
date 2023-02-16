package exeptionEg;

import java.io.IOException;

public class ExceptionExample5 
	{
		int res;
		public void operations(int n1,int n2) throws IOException
		{
			res=n1+n2;
		
			if(res>10)
			{
				throw new IOException("new exception");
			}
			else 
			{
				throw new ArithmeticException();
			}
		}
		public void display() throws IOException
		{
			operations(15,2);
			System.out.println("sum:"+res);
		}	


	public static void main(String[] args)
	{
		ExceptionExample5 obj=new ExceptionExample5();
		try
		{
			obj.display();
		}
		catch(IOException e)
		{
			System.out.println("result greater than 10");
		}
		catch(ArithmeticException e)
		{
			System.out.println("result less than 10");
		}
	}
	}

