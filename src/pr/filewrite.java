package pr;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filewrite
{
	public static void main(String[] args)
	{
	try
	{
	File fl = new File("C:\\Users\\Administrator\\Desktop\\java/write.txt");
	String str="Write this string to my file";
	FileWriter fw = new FileWriter(fl) ;
	fw.write(str);
	fw.close();

	}
	catch (IOException e)
	{
		e.printStackTrace(); 
	}
	}

}
