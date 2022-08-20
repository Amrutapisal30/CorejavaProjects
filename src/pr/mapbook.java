package pr;
import java.util.*;    
class Booka1 
{    
	public
int id;    
String name,author,publisher;    
int quantity;    
public 
Booka1(int id, String name, String author, String publisher, int quantity)
{    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
}

}    
public class mapbook {
	public static void main(String args[]) {    
	    //Creating map of Books    
	    Map<Integer,Booka1> map=new LinkedHashMap<Integer,Booka1>();    
	    //Creating Books    
	    Booka1 b1=new Booka1(101,"LetusC","YashwantKanetkar","BPB",8);    
	    Booka1 b2=new Booka1(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	    Booka1 b3=new Booka1(103,"Operating System","Galvin","Wiley",6);    
	    //Adding Books to map   
	    map.put(2,b2);  
	    map.put(1,b1);  
	    map.put(3,b3);  
	      
	    //Traversing map  
	    for(Map.Entry<Integer, Booka1> entry:map.entrySet()){    
	        int key=entry.getKey();  
	        Booka1 b=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
	    }    
	}    

}
