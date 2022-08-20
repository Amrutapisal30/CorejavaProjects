package pr;
class Mythreadi extends Thread
{
	public void run()
	{
		System.out.println("r1");
		try
		{
			Thread.sleep(500);
			
		}catch(InterruptedException e)
		{
		}
		System.out.println("r2");
	}	
}
public class Isalivemethod {
	public static void main(String args[])
	{
		Mythreadi t1=new Mythreadi();
		Mythreadi t2=new Mythreadi();
		t1.start();
		
		try{
			t1.join(); //Waiting for t1 to finish
			}catch(InterruptedException ie){}
		t2.start();
		
		//System.out.println(t1.isAlive());
		//System.out.println(t2.isAlive());
		
	}

}
