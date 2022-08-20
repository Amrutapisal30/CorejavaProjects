package pr;
import java.util.*;
public class mapexample {
	public static void main(String[] args)
	{
		
		Map m=new HashMap();
		m.put(1, "Rahul");
		m.put(2, "Amit");
		m.put(3, "Jai");
		m.put(4, "Amit");
		
		Set s=m.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			
			Map.Entry e=(Map.Entry)itr.next();  
	        System.out.println(e.getKey()+" "+e.getValue());  
		}
		
	}

}
