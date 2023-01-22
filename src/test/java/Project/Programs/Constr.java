package Project.Programs;

public class Constr 
{

	public static void main(String[] args)
	{
		Chain obj = new Chain(101,32,"Sarath","Atp");
		
		System.out.println("ID: "+obj.a+" Name: "+obj.c+" Age: "+obj.b+" City: "+obj.d);
		
	}

}



class Chain
{
	
	int a,b;
	String c,d;
	
	Chain(int a)
	{
		//this.a=a;
	}
	
	Chain(int a, int b)
	{
		this(a);
		//this.b=b;
	}
	
	Chain(int a, int b, String c, String d)
	{
		this(a,b);
		this.c=c;
		this.d=d;
	}

}