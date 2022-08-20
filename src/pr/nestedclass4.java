package pr;

class Outer2
{
int count;
public void display()
{
Inner2 in=new Inner2();
in.show();
}
class Inner2
{
public void show()
{
System.out.println("Inside inner "+(++count));
}
}
}


public class nestedclass4 {
	public static void main(String[] args)
	{
	Outer2 ot=new Outer2();
	Outer2.Inner2 in= ot.new Inner2();
	in.show();
	}

}
