package pr;
import java.util.*;
public class foreachdemo {
	public static void main(String[] args)
	{
		LinkedList<String> li=new LinkedList<String>();
		li.add("a");
		li.add("b");
		li.add("c");
		li.add("d");
		
		for(String str:li)
		{
			System.out.println(str);
		}
		
	}

}
