package pr;

import java.util.Scanner;

public class Employee {
	private
	   int eid;
	   String ename;
	   float esalary;
	
	public
	   void accept()
	   {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter eid: ");
		eid=obj.nextInt();
		System.out.println("enter ename: ");
		ename=obj.next();
		System.out.println("enter esalry: ");
		esalary=obj.nextFloat();
		
		
	   }
	/*public String toString()
	{
		return "EId=" +eid +"ename= "+ename+"esalary ="+esalary;
	}*/
	void display()
	{
		System.out.println("eid = "+eid);
		System.out.println("ename = "+ename);
		System.out.println("esalary = "+esalary);
	}
	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.accept();
		
		
		e1.display();
		Employee e2=new Employee();
		e2.accept();
		
		
		e2.display();
		
		//System.out.println(e1);
	}

}
