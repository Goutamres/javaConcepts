package stringConcepts;

import java.util.Arrays;

public class sortUsingLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] w = {"abcde","abcd","abc","ab","a","jgewycgreuycriyv"};
		
		
		Arrays.sort(w,(a,b)->Integer.compare(b.length(), a.length()));
		
//		Arrays.sort(w,(a,b)-> b.length()-a.length());
		
		int[] b = {2,6,4,3,1};
		
		
		
		for(String i:w) {
			System.out.println(i);
		}
		

		int a = Integer.compare(w[1].length(), w[2].length());
		
		System.out.println(a);

	}

}
