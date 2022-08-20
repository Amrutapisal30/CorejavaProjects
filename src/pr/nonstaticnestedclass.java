package pr;
class A1
{
static 	int i;
	static class B1
	{
		int j;
	}
}

public class nonstaticnestedclass 
{
	public static void main(String[] args)           
	{
		A1.i=5;
		System.out.println("i= "+A1.i);
		
		A1.B1 obj1=new A1.B1();
		obj1.j=10;
		System.out.println("j= "+obj1.j);
		
	}

}
