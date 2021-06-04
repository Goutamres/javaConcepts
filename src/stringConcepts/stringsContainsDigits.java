package stringConcepts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class stringsContainsDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "126";
		
		String r = "abcdA/";
		
		String regex = "[a-z,A-Z,?,/]+";
		
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(s);
		
		System.out.println(m.matches());
		
		Matcher q = p.matcher(r);
		
		System.out.println(q.matches());

	}

}
