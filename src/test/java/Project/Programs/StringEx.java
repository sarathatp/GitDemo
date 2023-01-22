package Project.Programs;

public class StringEx 
{
	public static void main(String args[])
	{
		String greeting = "Hello World";
		
		char[] helloArray = {'h','e','l','l','o','.'};
		
		String helloString = new String(helloArray);
		
		System.out.println(helloString);
		
		String palindrome = "Dot saw I was Tod";
		int len = palindrome.length();
		
		System.out.println(len);
		
		
		String s="Hello";
		
		String s1 = new String("Hello");
		System.out.println("s1 has: "+s1);
		
		char c[]= {'s','m','i','l','e'};
		String s2=new String(c);
		System.out.println("s2 has: "+s2);
		
		String s3=s2.concat(s);
		String s4=s2+s1;
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println(s3.length());
		
		s2.charAt(1);
		System.out.println(s2.charAt(1));
	}

}
