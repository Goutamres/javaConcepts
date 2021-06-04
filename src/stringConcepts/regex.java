package stringConcepts;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern p = Pattern.compile("^\\d.*\\.$");
		
		System.out.println(p.matcher("1acbfhb.").matches());
		
		System.out.println(p.matcher("2r").matches());
		
		
		
		
		
		
		
     

	}

}
