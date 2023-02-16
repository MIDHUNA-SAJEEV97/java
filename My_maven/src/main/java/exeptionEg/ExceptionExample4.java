package exeptionEg;

public class ExceptionExample4
{
	int res;
	public void operations(int n1,int n2)
	{
		res=n1+n2;
	
		if(res>10)
		{
			throw new ArrayIndexOutOfBoundsException("new exception");
		}
		else 
		{
			throw new ArithmeticException();
		}
	}
	public void display()
	{
		operations(15,2);
		System.out.println("sum:"+res);
	}	


public static void main(String[] args)
{
	ExceptionExample4 obj=new ExceptionExample4();
	try
	{
		obj.display();
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("result greater than 10");
	}
	catch(ArithmeticException e)
	{
		System.out.println("result less than 10");
	}
}
}


	
	
	
	
	
	
	
	
	

