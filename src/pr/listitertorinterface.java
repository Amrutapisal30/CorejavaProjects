package pr;

import java.util.*;

public class listitertorinterface {
	public static void main(String args[])
	{
		ArrayList<String> ar=new ArrayList<String> ();
		ar.add("ab");
		ar.add("bc");
		ar.add("cd");
		ar.add("de");
		
		ListIterator itr=ar.listIterator();
		while(itr.hasNext())   //forward direction
		{
			System.out.print(itr.next() +" ");
		}
		System.out.println(" ");
		while(itr.hasPrevious())  //backward direction
		{
			System.out.print(itr.previous() +" ");
		}
		
		
	}
}
