package pr;
import java.util.*;
public class mapexample1
{
	public static void main(String[] args)
	{
	Map<String,Integer> map=new HashMap<String,Integer>();  
	  map.put("Amit",101);  
	  map.put("Vijay",102);  
	  map.put("Rahul",103);  
	  //Elements can traverse in any order  
	  for(Map.Entry m:map.entrySet())
	  {  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  }  
	}
}
