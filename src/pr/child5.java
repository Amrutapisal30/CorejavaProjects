package pr;
class parent5
{
	String name;
	
}

public class child5 extends parent5
{
	String name;
	public void Details()
	{
		super.name="parent";
		name="child";
		System.out.println(super.name+" "+name);
	}
	public static void main(String[] args)
	{
		child5 cobj=new child5();
		cobj.Details();
	}
	

}
