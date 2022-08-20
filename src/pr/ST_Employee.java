package pr;

public class ST_Employee {
	int eid;
	String name;
	static String company_name="spark";
	public 
	  void show()
	{
System.out.println("eid= "+eid +" name = "+name+" company_name= "+company_name);
	}
	
	public static void main(String[] args)
	{
		 ST_Employee e1=new  ST_Employee();
		 e1.eid=1;
		 e1.name="Abhijit";
		 e1.show();
		 
		 ST_Employee e2=new  ST_Employee();
		 e2.eid=2;
		 e2.name="Aniket";
		 e2.show();
	}

}
