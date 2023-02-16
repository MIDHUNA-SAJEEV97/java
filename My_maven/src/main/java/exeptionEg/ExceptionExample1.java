package exeptionEg;

public class ExceptionExample1 {
public void operations(int n1,int n2)
{
	int res;
	try 
	{
		res=n1/n2;
		System.out.println("sum :"+res);
	}
	catch(ArithmeticException m)
	{
		System.out.println("division by zero not possible");
	}
}
	public static void main(String[] args) {
		ExceptionExample1 obj=new ExceptionExample1();
				//obj.operations(16,2);
				obj.operations(10,0);
	}

}
