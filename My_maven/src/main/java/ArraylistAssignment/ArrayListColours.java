/*Collection a) Write a Java program to create a new array list, 
add some colors (string) and
 print out the collection. b) Write a Java program to retrieve an element
(at a specified index) from a given array list. c) Write a Java program to iterate 
through all elements in a array list. d) Write a Java program to remove
the third element from a arraylist. 
e) Write a Java program to search an element in a array list.*/

package ArraylistAssignment;
import java.util.*;
public class ArrayListColours
{	
	ArrayList<String> obj = new ArrayList<String>();  //to get in every method
	
	public void display()
	{
	obj.add("Red");
	obj.add("Green");
	obj.add("Orange");
	obj.add("White");
	obj.add("Black");
	obj.add("Yellow");
    System.out.println("ARRAY LIST of colours:"+obj);
}
		public void retreive() { 
	                                                  // Retrive the first and third element
		  String element = obj.get(0);
		  System.out.println("First element Retreived: "+element);
		  element = obj.get(3);
		  System.out.println("fourth element retreived: "+element);
		
	}
	public void iterate()
	{ 
		                                    //iterate through all elements
		  for (String el : obj) 
		  {
		    System.out.println(el);        //by for each loop
		  }
		    
	} 
	public void removing()
	{ 
		    System.out.println("arraylist:"+obj);      
		                                // removing third element from the list
		    obj.remove(2);
		    System.out.println("After removing third element from the list:"+obj);
	}
	 public void search() 
	 { 
	                                      // Search the colour yellow
	    if (obj.contains("Yellow")) 
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
	ArrayListColours ls=new ArrayListColours();
	ls.display();
	ls.retreive();
	ls.iterate();
	ls.removing();
	ls.search(); 
}
}
	
	
		 


