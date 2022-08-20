package pr;
class super1
{
	public void show()
	{
		System.out.println("parent class");
	}
}
public class sub1 extends super1
{
	public void show()throws ArithmeticException
	{
		System.out.println("child class");
	}
	public static void main(String[] args)
	{
		sub1 s1=new sub1();
		s1.show();
	}

}
