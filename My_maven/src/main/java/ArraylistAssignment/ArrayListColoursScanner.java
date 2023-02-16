package ArraylistAssignment;
import java.util.*;
public class ArrayListColoursScanner 
{	
	ArrayList<String> obj = new ArrayList<String>();  //to get in every method
	Scanner sc=new Scanner(System.in);
	public void display()
	{
		
		System.out.println("Enter 6 colours");
	String a=sc.nextLine();
	String b=sc.nextLine();
	String c=sc.nextLine();
	String d=sc.nextLine();
	String e=sc.nextLine();
	String f=sc.nextLine();
		
	obj.add(a);
	obj.add(b);
	obj.add(c);
	obj.add(d);
	obj.add(e);
	obj.add(f);
    System.out.println("ARRAY LIST of colours:"+obj);
}
		public void retreive() 
		{ 
			System.out.println("Enter the index of element to be retreived");                                          
	      int h = sc.nextInt();
		  obj.get(h);
		  System.out.println(" element retreived: "+obj.get(h));
		
	}
	public void iterate()
	{ 
		System.out.println("Array elements are :");       //iterate through all elements
		  for (String el : obj) 
		  {
		    System.out.println(el);        //by for each loop
		  }
		    
	} 
	public void removing()
	{
		System.out.println("Enter the index of element to be removed"); 
		    System.out.println("arraylist before removal:"+obj);      
		    int rem=sc.nextInt();                            
		    obj.remove(rem);
		    System.out.println("After removing element from the list:"+obj);
	}
	 public void search() 
	 { 
		 System.out.println("Enter the element to be searched");  
		String se=sc.nextLine();        
	    if (obj.contains(se)) 
	    {
	    System.out.println("Found the colour");
	    }
	    else
	    {
	    System.out.println("There is no such colour");
         }
	 }
	 
	  public static void main(String[] args) 
	{ 
		 ArrayListColoursScanner ls=new ArrayListColoursScanner();
		ls.display();
		ls.retreive();
		ls.iterate();
		ls.removing();
		ls.search(); 
	}
	}
		

