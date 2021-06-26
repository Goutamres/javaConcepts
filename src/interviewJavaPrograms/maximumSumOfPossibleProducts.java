package interviewJavaPrograms;

import java.util.Arrays;
import java.util.Collections;

public class maximumSumOfPossibleProducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum =0;
		
		Integer a[] = {9,8,7,6,5,4};
		Integer b[] = {9,8,7,6,5,4};
		
		 Arrays.sort(a,Collections.reverseOrder());
		 Arrays.sort(b,Collections.reverseOrder());
		 
		 for(int i=0;i<a.length;i++) {
			 sum+=a[i]*b[i];
		 }
		 
		 System.out.println(sum);

		

	}

}
