package pr;
class outer
{
	public
	 void display()
	 {
		Inner in=new Inner();
		in.show();
	 }
	    class Inner
	    {
	    	public
	    	  void show()
	    	  {
	    		System.out.println("Inside Inner");
	    	  }
	    }
}
public class netsedclass1 
{
   public static void main(String[] args)
	{
		outer ot=new outer();
		ot.display();
	}
}
