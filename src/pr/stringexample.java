package pr;
import java.util.*;

public class stringexample {
	public static void main(String[] args)
	{
		String s = "Hello";
		String str = "Java";
		String str2 = s.concat(str);
		String str1 = "Hello".concat("Java");

		System.out.println(str1);
		
		String st = "Rahul";
		String st1 = "Dravid";
		String st2 = str + str1;
		String st3 = "Rahul"+"Dravid";
		System.out.println(st3);
		
		String s1,s2,s3;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter 1st string");
		s1=obj.next();
		
		System.out.println("enter 2nd string");
		s2=obj.next();
		
		s3=s1+s2;
		s3=s1.concat(s2);
		System.out.println("concatinate string = "+s3);
		
	}

}
