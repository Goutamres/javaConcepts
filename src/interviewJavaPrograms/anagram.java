package interviewJavaPrograms;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "peeksq";
		String s2 = "keeps";
		
		
		char[] a = s1.toLowerCase().toCharArray();
		
		
		//65 A  97 a  48 0
		char[] b = s2.toLowerCase().toCharArray();
		
		Arrays.sort(a);
		
		Arrays.sort(b);
		
		if(Arrays.equals(a, b)) {
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}

	}

}
