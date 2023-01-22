package Project.Programs;

import java.util.Scanner;

public class SampleEx 
{
	
	
	static String s = "This is a class";
	
	int a;
	
	SampleEx(int c)
	{
		a=c;
		System.out.println("a value: "+a);
	}
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		System.out.println(s);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value for a");
		int c=input.nextInt();
		SampleEx se  = new SampleEx(c);
		
	

	}

}
