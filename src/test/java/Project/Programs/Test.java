package Project.Programs;



//Program to find count of "td" text in a given string.
public class Test 
{

	public static void main(String[] args) 
	{
		String str = "This is td bank interview td";
					
		Str_Count obj = new Str_Count();  
		int td_count=obj.stringCount(str); //returned td_count value collected
		System.out.println("");
		System.out.println("td word count: "+td_count); // td_count displayed
		
		
	}
}


class Str_Count
{
	int td_count=0;   
	int stringCount(String str) 
	{
		if(str == null || str.isEmpty()) //null or empty check
		{
			return 0;
		}
		String[] str_words = str.split("\\s+"); //Regular expression \\s+ with "split" method is used to 
		                                        //separate each word and store in a String array str_words. 
		                                         
//		for(int i=0;i<str_words.length;i++)     //for loop to loop through the array str_words
//		{
//			
//			System.out.println(str_words[i]);
//			if(str_words[i].contains("td"))     //if condition to check if "td" word is present or not
//			{
//				
//				td_count++;                     //increments td_count variable if td word is present
//			}
//			
//		}
		
		for(String s: str_words)
		{
			if(s.equals("td"))
				td_count++;
		}
		
		return td_count;      // return count of td words collected.
	}
}









