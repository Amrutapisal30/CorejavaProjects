package pr;

class Parentr{ }
public class Childr extends Parentr
{
	public void check()
	{
	System.out.println("Sucessfull Casting");
	}
	public static void show(Parentr p)
	{
	if(p instanceof Childr)
	{
	Childr b1=(Childr)p;
	b1.check();
	}
	}
	public static void main(String[] args)
	{
	Parentr p=new Childr();
	Childr.show(p);
	}
}
