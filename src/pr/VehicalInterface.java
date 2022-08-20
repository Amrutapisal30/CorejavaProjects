package pr;
interface Movable
{
	int avg_speed=40;
	void move();
}
public class VehicalInterface implements Movable
{
	public void move()
	{
		System.out.println("Avg- speed is=  "+avg_speed);
	}
	public static void main(String[] args)
	{
		VehicalInterface v1=new VehicalInterface();
		v1.move();
		
	}

}
