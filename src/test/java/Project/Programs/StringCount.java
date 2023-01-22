package Project.Programs;

import java.util.StringTokenizer;

public class StringCount 
{

	public static void main(String[] args) 
	{
		String words = "word word2 word3 word4";
		
		words.contains("word2");
		
		
		
		
		StringTokenizer st = new StringTokenizer(words);
		
		System.out.println(st.countTokens());
		

	}

}
