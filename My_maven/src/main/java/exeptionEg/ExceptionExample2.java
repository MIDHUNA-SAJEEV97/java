package exeptionEg;

public class ExceptionExample2 {
	public void operations(int n1,int n2)
	{
		int res;
		int[] arr=new int[5];
		try 
		{
			res=n1/n2;
			System.out.println("sum :"+res);
	
		for (int i=0;i<=arr.length;i++) 
		{
			arr[i]=i+1;
			System.out.println(" "+arr[i]);
		}
		//System.exit(0);
		}
		catch(ArithmeticException s)
		{
			System.out.println("division by zero not possible");
		}
		catch(ArrayIndexOutOfBoundsException m)
	
		{
			System.out.println(" array size is 5");
		}
	catch(Exception ex)
		{
			System.out.println("exception occured");
		}
		finally
		{
			System.out.println("finally block execution");
		}
		System.out.println("end ");
	}
		public static void main(String[] args)
		{
			ExceptionExample2 obj=new ExceptionExample2();
					obj.operations(16,2);
				//obj.operations(10,0);
		}


}
