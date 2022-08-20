package pr;
abstract class AbstractA
{
	abstract void callme();
	public void normal()
	{
		System.out.println("normal method");
	}
	
}
public class AbstractB extends AbstractA
{
 
	void callme()
	{
		System.out.println("this is callme");
	}
	public static void main(String[] args)
	{
		AbstractB b1=new AbstractB();
		b1.callme();
		b1.normal();
		
	}
}
