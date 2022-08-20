package pr;
class Employeea
{
	int eid;
	String ename;
	public
	
	Employeea(int i,String n)
	{
		eid=i;
		ename=n;
	}
	  
}
public class Department extends Employeea
{
  String designation;
  double salary;
  
  public 
  Department(int i,String n,String d,double s)
  
  {
	  super(i,n);
	  this.designation=d;
	  this.salary=s;
	  
  }
  void display()
  {
	  System.out.println("eid= "+eid);
	  System.out.println("ename= "+ename);
	  System.out.println("Designation= "+designation);
	  System.out.println("slary= "+salary);
  }
	public static void main(String[] args)
	{
		 Department d1=new 	Department(1,"sonal","developer",67899.4);
		 d1.display();
	}
}
