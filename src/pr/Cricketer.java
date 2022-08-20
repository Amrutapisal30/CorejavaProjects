package pr;

public class Cricketer {
	String name;
	String team;
	int age;
	public
	Cricketer()  //default constructor
	{
		name=" ";
		team="";
		age=0;
	}
	Cricketer(String n,String t,int a) //parameterised
	{
		name=n;
		team=t;
		age=a;
	}
	Cricketer(Cricketer ckt) //copy 
	{
		name=ckt.name;
		team=ckt.team;
		age=ckt.age;
	}
	public String toString()
	{
		return "name= "+name+" team= "+team+" age= "+age;
	}
	
public static void main(String[] args)
{
	Cricketer c1=new Cricketer();
	c1.name="virat";
	c1.team="india";
	c1.age=43;
	System.out.println(c1);
	
	Cricketer c2=new Cricketer("sachin","india",46);
	System.out.println(c2);
	
	Cricketer c3=new Cricketer(c2);
	System.out.println(c3);
}


}
