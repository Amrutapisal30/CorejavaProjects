package pr;
class Mythread3 implements Runnable
{
	int i;
	public
	void run()
	{
		for(i=1;i<=5;i++)
		{
			System.out.println("i= "+i);
		}
	}
}
public class Mythreaddemo {
	
	public static void main(String args[])
	{
		 Mythread3 m1=new  Mythread3();
		 Thread t1=new Thread(m1);
		 t1.start();
		
	}

}
