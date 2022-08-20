package pr;
class Bike1
{
	public 
	 void run()
	{
		System.out.println("Running");
	}
}
public class Honda extends Bike1
{
  public
	void run()
	{
		System.out.println("Running  safely with 100kmph");
	}
  public static void main(String[] args)
  {
	  Honda h1=new Honda();
	  h1.run();
  }
}
