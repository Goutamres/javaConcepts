package interviewJavaPrograms;

public class secondLargestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,1,2,4};
		
		int f= Integer.MAX_VALUE, s = Integer.MAX_VALUE;
		
		
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]<f) {
				s = f;
				f = a[i];
			}
			
			else if(a[i] < s && a[i]!= f) {
				s= a[i];
			}
		
			
		}
		
		
		System.out.println("Second "+s);

	}

}
