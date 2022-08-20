package pr;

public class call_by_value {
	public void callbyvalue(int x)
	{
		x=560;
	}
	public static void main(String[] args)
	{
		int x=50;
		call_by_value c1=new call_by_value();
		c1.callbyvalue(x);
		System.out.print(x);
		
	}
	
}
