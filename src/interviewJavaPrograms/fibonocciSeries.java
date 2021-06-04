package interviewJavaPrograms;

import java.util.Arrays;

public class fibonocciSeries {
	
	 static int a1=0,a2=1,a3;
	
	
	public static void main(String args[]) {
		
		int limit = Integer.parseInt(args[0]);

		
		System.out.print(0+" ");
		
		for(int i=1;i<8;i++) {
			System.out.print(printfibbo(i)+" ");
		}
		
		
		
		
		
		
	}

	private static int printfibbo(int limit) {
		// TODO Auto-generated method stub
//		if(limit == 1) {
//			return 1;
//		}
//		
//		if(limit==2) {
//			return 1;
//		}
//		return printfibbo(limit-1)+printfibbo(limit-2);
		
		int[] a= {1,2,3};
		
		Arrays.sort(a);
		
		
		return limit==1 || limit==2 ? 1 : printfibbo(limit-1)+printfibbo(limit-2);
		
	}

}
