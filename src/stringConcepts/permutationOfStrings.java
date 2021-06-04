package stringConcepts;

import java.util.Scanner;

public class permutationOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String s = "A";
		
		
		System.out.println("Enter String: ");
		
		String s = new Scanner(System.in).nextLine();
		
		int n = s.length();
		
		permute(s,0,n-1);

	}

	private static void permute(String s, int start, int end) {
		// TODO Auto-generated method stub
		
		if(start==end) {
			System.out.println(s);
		}
		else {
			for(int i=start;i<=end;i++) {
				s = swap(s,start,i);
				permute(s,start+1,end);
				s = swap(s,start,i);
			}
		}
		
	}

	private static String swap(String s, int i, int j) {
		// TODO Auto-generated method stub
		
		char temp;
		
		char[] a= s.toCharArray();
		
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
		return String.valueOf(a);		
		
		
		
	}
	
	
	//O(n*n!)

}
