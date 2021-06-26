package interviewJavaPrograms;

import java.util.Arrays;

public class minimumPlatformRequired {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {900,950,940,1100,1500,1800};
		int[] b = {910,1200,1120,1130,1900,2000};
		
		Arrays.sort(a);
		
		Arrays.sort(b);
		
		int max = 1,answer =1 ;
		
		int i=1,j=0;
		
		while(i<a.length) {
			if(a[i]<b[j]) {
				i++;
				max++;
			}
			else {
				j++;
				max--;
			}
			if(answer<max) {
				answer = max;
			}
		}
		
		System.out.println("Answer "+answer);

	}

}
