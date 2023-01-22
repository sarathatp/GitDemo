package Project.Programs;

public class Test2 
{

	public static void main(String[] args)	
	{
		
		/*
		 * System.out.println(10 + 20 + "Javatpoint");
		 * System.out.println("Javapoint"+10+20);
		 * 
		 * System.out.println(10*20+"Java"); System.out.println("Java"+10*20);
		 */
		
//		for(int i =0;0;i++)
//		{
//			System.out.println("Hello Java");
//		}
		
		
		/*
		 * Student3 s1 = new Student3(); Student3 s2 = new Student3();
		 * 
		 * s1.display(); s2.display();
		 */
		
		/*
		 * Student3 s1 = new Student3(true); s1.display();
		 */
		byte a=10;
		byte b=15;
		byteTest bt = new byteTest(a,b);
	}

}

/*
 * class Student3 { int id; String name; boolean say;
 * 
 * Student3() {
 * 
 * }
 * 
 * Student3(int id) { this.id=id; }
 * 
 * Student3(int id, String name) { this.id=id; this.name=name; }
 * 
 * Student3(boolean say) { this.say=say; }
 * 
 * void display() { System.out.println(id+" "+name+" "+say); }
 * 
 * 
 * 
 * }
 */


class byteTest
{
	
	
	
	byteTest(int a,int b)
	{
		System.out.println(a+" "+b);
	}
	
	byteTest(int a, float b)
	{
		System.out.println(a+" "+b);
	}
}




















