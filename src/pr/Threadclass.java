package pr;

class MyThread extends Thread
{
	int i;
	public void run()
	{
		for(i=1;i<=5;i++)
		{
			System.out.println("i= "+i);
		}
	}
}

public class Threadclass
{
	public static void main(String args[])
			{
		MyThread t1=new MyThread();
		t1.start();
		}
}
