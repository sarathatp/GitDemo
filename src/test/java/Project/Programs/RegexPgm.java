package Project.Programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPgm 
{

	public static void main(String[] args) 
	{
		String re = "\\W";
		String text = "%"; 
		
		Pattern pt = Pattern.compile(re);

	   Matcher mt = pt.matcher(text);
	   
	   Boolean result = mt.matches();
	   
	   System.out.println(result);

	}

}
