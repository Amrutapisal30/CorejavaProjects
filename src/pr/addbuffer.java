package pr;

import java.io.*;

public class addbuffer {
	public static void main(String[] args) throws IOException
	{

String text;
		int a,b,c;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter a =");
	a=Integer.parseInt(br.readLine());
	System.out.println("enter b =");
	b=Integer.parseInt(br.readLine());
	c=a+b;
	System.out.println("add= "+c);
	
	System.out.println("enter  string= ");
	text=br.readLine();
	System.out.println("string is= "+text);
	
	}
}
