package pr;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filecopy {
	public static void main(String[] args)
	{

	try
	{
//File infile=new File("C:\\Users\\Administrator\\Desktop\\java/file1.txt  ");
//File outfile=new File("C:\\Users\\Administrator\\Desktop\\java/file2.txt");	
				FileInputStream ins=new FileInputStream("C:\\Users\\Administrator\\Desktop\\java/file1.txt" );
				FileOutputStream outs=new FileOutputStream("C:\\Users\\Administrator\\Desktop\\java/file2.txt");
	
			byte byteread;
			
				do
	{
					byteread=(byte)ins.read();
					outs.write(byteread);
		
	}while(byteread!=-1);		
		/*int ch;
		while((ch=ins.read())!=-1)
		{
			outs.write(ch);
		}*/
		System.out.println("data write to file2.txt");
	}
	catch(IOException e)
	{
		System.out.println(e);
	}
	
	
	
	}
	
}
