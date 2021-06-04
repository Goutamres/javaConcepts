package stringConcepts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class consonentsAndVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "I am Goutam";
		
		int v=0,c=0;

		for(int i=0;i<s.length();i++) {
			switch(s.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				v++;
				break;
			case ' ':
				break;
			default:
				c++;
			}
		}
		
		System.out.println(c+" "+v);
		
		v=0;
		c=0;
		
		
		for(int i=0;i<s.length();i++) {
			if(Pattern.matches("[aeiou]",Character.toString(s.charAt(i)))) {
				v++;
			}
			else if(Pattern.matches("[a-z,A-z]",Character.toString(s.charAt(i)))) {
				c++;
			}
			else {
			
			}
		}
		
		System.out.println(c+" "+v);
		
		
		
		
	}

}
