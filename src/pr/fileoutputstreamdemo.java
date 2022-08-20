package pr;

import java.io.FileOutputStream;
import java.io.IOException;

public class fileoutputstreamdemo {
	public static void main(String[] args)throws IOException
	{
		byte b[]=new byte[100];
		System.out.println("Enter text to be saved in file");
		int bytes=System.in.read(b);
		FileOutputStream fo=new FileOutputStream("C:\\\\Users\\\\Administrator\\\\Desktop\\\\java/write.txt");
	fo.write(b,0,bytes);
	System.out.println("data written to file named write.txt");
	fo.close();
	
	}

}
