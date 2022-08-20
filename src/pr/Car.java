package pr;
abstract class Vehical
{
	public abstract void engine();
}
public class Car extends Vehical {
	public 
	  void engine()
	  {
		System.out.println("car engine");
	  }
	public static void main(String[] args)
	{
		Vehical v=new Car();
		v.engine();
	}
	

}
