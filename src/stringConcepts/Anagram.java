package stringConcepts;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = new String("abcd");
		
		String r = new String("race");
		
		char[] a = s.toLowerCase().toCharArray();
		
		char[] b = r.toLowerCase().toCharArray();
		
		Arrays.sort(a);
		
		Arrays.sort(b);
		
		boolean status = Arrays.equals(a,b);
		
		System.out.println(status);
		
		

	}

}
