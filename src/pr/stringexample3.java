package pr;

public class stringexample3 {
	public static void main(String args[])
	{
		String str = "Spark";
		System.out.println(str.charAt(4));
		
		String str1 = "java";
		System.out.println(str1.equalsIgnoreCase("JAVA"));
		
		String s1 = "Count me";
		System.out.println(s1.length());
		
		String s2 = "Change me";
		System.out.println(s2.replace('m','M'));
		
		String s3 = "0123456789";
		System.out.println(s3.substring(4));
	
		System.out.println(s3.substring(4,7));
		
		String s4 = "ABCDEF";
		System.out.println(s4.toLowerCase());
		
		String s5 = "abcdef";
		System.out.println(s5.toLowerCase());
		
		String s6 = " hello ";
		System.out.println(s6.trim());
	}

}
