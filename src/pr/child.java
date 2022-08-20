package pr;
class parent
{
	public
	  void p1()
	  {
		System.out.println("parent class");
	  }
}
public class child extends parent
{
	 void c1()
	  {
		System.out.println("child class");
	  }
	 public static void main(String[] args)
	 {
		 child cobj=new child();
		 cobj.c1();
		 cobj.p1();
		 
	 }
}
