package stringConcepts;

import java.util.Arrays;

public class checkValidShuffleTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "abcde";
		
		String b = "abcdefg";
		
		String c = "abcdeabcdefgcibc";
		
		char[] d = new char[256];
		
		char[] e = new char[256];
		
		for(int i=0;i<a.length();i++) {
			d[a.charAt(i)]++;
		}
		
		for(int i=0;i<b.length();i++) {
			d[b.charAt(i)]++;
		}
		
		for(int i=0;i<c.length();i++) {
			e[c.charAt(i)]++;
		}
		
		
		boolean f = Arrays.equals(d, e);
		
		System.out.println(f);
		
		

	}

}
