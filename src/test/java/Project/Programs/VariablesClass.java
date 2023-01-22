package Project.Programs;

public class VariablesClass 
{

	public static void main(String[] args) 
	{
		
		Sample.b=10;
		
		Sample s = new Sample();
		Sample k = new Sample();
		
		s.a=5;
		s.accessMethod();
		
		System.out.println("");
		
		k.a=15;
		k.b=30;
		k.accessMethod();
		

	}

}


class Sample
{
	
	int a;
	
	static int b;
	
	
	void accessMethod()
	{
		
		
		System.out.println("a is: "+a);
		System.out.println("b is: "+b);
		
		
	}
	
	
	
	
	
	
	
	
}