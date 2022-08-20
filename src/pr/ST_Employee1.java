package pr;

public class ST_Employee1 {
	int eid;
	String name;
	static String company_name;
	static
	{
		company_name="spark";
		
	}
	public 
	  void show()
	{
System.out.println("eid= "+eid +" name = "+name+" company_name= "+company_name);
	}
	
	public static void main(String[] args)
	{
		 ST_Employee1 e1=new  ST_Employee1();
		 e1.eid=1;
		 e1.name="Abhijit";
		 e1.show();
		 
}
}
