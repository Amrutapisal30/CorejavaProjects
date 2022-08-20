package pr;
import java.io.*;
public class ReadTest {
	public static void main(String[] args)
	{
	try
	{
	File fl = new File("C:\\Users\\Administrator\\Desktop\\java/file.txt");
	BufferedReader br = new BufferedReader(new FileReader(fl)) ;
	String str;
	while ((str=br.readLine())!=null)
	{
	System.out.println(str);
	}
	br.close();
	
	}
	catch (IOException e)
	{ e.printStackTrace(); }
	}
}
