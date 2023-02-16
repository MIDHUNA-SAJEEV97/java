package ArraylistEg;
import java.util.*;

public class ArrayListexample2 {
	
		public static void main(String args[]){
			ArrayList<Integer> obj=new ArrayList<Integer>();
			
			obj.add(10);
			obj.add(20);
			obj.add(30);
			obj.add(null);
			obj.add(101);
			obj.add(2);
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
		for(Integer element:obj)
		{
			System.out.println(element);
		}

		}
	}


