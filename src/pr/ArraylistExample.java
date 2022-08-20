package pr;
import java.util.*;


public class ArraylistExample {
	public static void main(String args[])
	{
		ArrayList<String> l1=new ArrayList<String>();
		l1.add("Mango");
		l1.add("Apple");
		l1.add("Banana");
		l1.add("Grapes");
		
		System.out.println(l1);
		 l1.add(1, "Orange"); 
		 System.out.println(l1);
		 
		 ArrayList<String> l3=new ArrayList<String>();
		 l3.add("Sonoo");  
        l3.add("Hanumat");  
         //Adding second list elements to the first list  
         l1.addAll(l3); 
         System.out.println(l1);
         
         l1.remove("Apple");
         System.out.println(l1);
         
         l1.removeAll(l3); 
         System.out.println(l1);
		
		ArrayList<Integer> l2=new ArrayList<Integer>();
		l2.add(23);
		l2.add(24);
		l2.add(25);
		l2.add(23);
		System.out.println(l2);
		
	}

}
