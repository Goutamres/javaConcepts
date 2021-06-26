package interviewJavaPrograms;

import java.util.Arrays;
import java.util.Collections;

public class sortByLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[] = {"z","abcde","abcd","abc","ab","a","jgewycgreuycriyv"};
		
		
		//Arrays.parallelSort(a,Collections.reverseOrder());
		
		//Arrays.sort(a);
		
		
		Arrays.sort(a,(b,c) ->Integer.compare(c.length(), b.length()));
		
		
		System.out.println(Arrays.toString(a));
		
		for(String i:a) {
			System.out.println(i);
		}
		
//		Integer[] b = new Integer[a.length];
//		
//		for(int i=0;i<a.length;i++) {
//			b[i] = a[i].length();
//		}
//		
//		Arrays.sort(b,Collections.reverseOrder());
//		
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a.length;j++) {
//				if(b[i]==a[j].length()) {
//					System.out.println(a[j]);
//				}
//			}
//		}

		
		
		
		
	}

}
