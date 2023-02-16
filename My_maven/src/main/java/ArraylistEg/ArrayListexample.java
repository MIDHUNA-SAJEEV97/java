package ArraylistEg;
import java.util.*;
//import java.util.Collections;
public class ArrayListexample{
	

	public static void main(String[] args)
	{
		
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("midhuna");
		obj.add("vishnu ");
		obj.add("saanvi");
		obj.add(" ");
		System.out.println(obj);
		System.out.println("ARRAY LIST: "+obj);
		obj.remove(3);
		System.out.println("after removal: "+ obj);
		Collections.sort(obj);
		System.out.println("after sorting: "+ obj);
		
		/*for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}*/
	System.out.println("for each loop");
	for(String element:obj)
	{
		System.out.println(element);
	}

	}
}
