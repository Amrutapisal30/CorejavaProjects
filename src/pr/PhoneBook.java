package pr;
import java.util.*;
class Contact
{
	String fname;
	String lname;
	String ph_no;
	public 
	Contact(String f,String l,String p)
	{
		fname=f;
		lname=l;
		ph_no=p;
		
	}
	public String toString()
	{
  return "\n firstname="   +fname+ " lastname= "+lname +" ph_no= "+ph_no;

	}
		
	
}
public class PhoneBook {
	public static void main(String args[])
	{
		Contact c1 = new Contact("Ricky", "Pointing","999100091");
		Contact c2 = new Contact("David", "Beckham","998392819");
		Contact c3 = new Contact("Virat", "Kohli","998131319");
		
		ArrayList< Contact> al = new ArrayList< Contact>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		System.out.println(al);
	
		
	}

}
