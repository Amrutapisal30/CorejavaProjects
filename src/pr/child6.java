package pr;
class parent6
{
	String name;
	public
	  void Details()
	  {
		name="parent";
		System.out.println(name);
	  }
}
public class child6 extends parent6
{
	String name;
	public
	   void Details()
	   {
		super.Details();

		name="child";
		System.out.println(name);
		
	   }
	public static void main(String[] args)
	{
		child6 co=new child6();
		co.Details();
	}
}
