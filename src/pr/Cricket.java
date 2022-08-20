package pr;
class Game
{
	public void type()
	{
		System.out.println("Indoor & Outdoor");
	}
}
public class Cricket extends Game
{
	
	public void type()
	{
		System.out.println("Outdoor games");
	}
	public static void main(String[] args)
	{
		Game gm=new Game();
		gm.type();
		 Cricket ck=new  Cricket();
		 ck.type();
		 
		 //Game gm=new  Cricket();
		 gm=ck;
		 gm.type();
		
		
	}
	
}
