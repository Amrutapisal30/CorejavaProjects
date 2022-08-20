package pr;

public class Test1 {
	static int x=100;
	int y=100;
	public
	 void increment()
	 {
		x++;
		y++;
		
	 }
	public static void main(String[] args)
	{
		Test1 t1=new Test1();
		Test1 t2=new Test1();
		System.out.println(Test1.x);
		System.out.println(t1.y);
		t1.increment();
		t2.increment();
		System.out.println(Test1.x);
		System.out.println(t1.y);
		
		
		
	}

}
