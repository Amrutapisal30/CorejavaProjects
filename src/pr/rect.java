package pr;

import java.util.Scanner;

class rectangle
{
	private
		int len, bre,area;
		
	public
	void accept()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter len: ");
		len=obj.nextInt();
		System.out.println("enter bre: ");
		bre=obj.nextInt();
		
	}
	void calculate()
	{
		area=len*bre;
		System.out.println("area of rectangle="+area);
	}

	
}


public class rect {
	public static void main(String[] args)
	{
		rectangle[] r=new rectangle[3];
		int i;
		for(i=0;i<=2;i++)
		{
		 r[i]=new rectangle();
		}
		for(i=0;i<=2;i++)
		{
			r[i].accept();
		}
		for(i=0;i<=2;i++)
		{
			r[i].calculate();
		}
		
	}

}
