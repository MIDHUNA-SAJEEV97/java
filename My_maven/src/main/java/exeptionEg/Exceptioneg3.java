package exeptionEg;

public class Exceptioneg3 {
	
		public void operations(int n1,int n2)throws ArrayIndexOutOfBoundsException
		{
			int res;
			
			try 
			{
				res=n1+n2;
				System.out.println("sum :"+res);
		
		if(res>10)
		{
			throw new ArrayIndexOutOfBoundsException("new exception");
		}
		else 
		{
			throw new ArithmeticException();
		}
		}
			catch(ArithmeticException e)
			{
				System.out.println("not possible");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("no possible");
			}
		}
	
public static void main(String[] args)
{
	Exceptioneg3 obj=new Exceptioneg3();
			obj.operations(16,2);
		//obj.operations(10,0);
}}


