package interviewJavaPrograms;

public class arrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int a[] = {1,2,3,4,5,6,7,8,9};
		
		int n = a.length;
		int t = 3;
		
		//method1
		
		int[] temp = new int[3];
		
		for(int i=0;i<t;i++) {
			temp[i]= a[i];
		}
		
		for(int i=t;i<n;i++) {
			a[i-t] = a[i];
		}
		
		for(int i=n-t;i<n;i++) {
			a[i] = temp[i-(n-t)];
		}
		
		for(int i:a) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		//method 2 
		
		int b[]= {1,2,3,4,5,6,7,8,9};
		
		int m = b.length;
		
		int q=2;
		
		
		for(int i=0;i<q;i++) {
			rotateByOne(b,m);
		}
		
		for(int i:b) {
			System.out.print(i+" ");
		}
		
		

	}

	private static void rotateByOne(int[] b, int m) {
		// TODO Auto-generated method stub
		int temp = b[0];
		for(int i=0;i<m-1;i++) {
			b[i]=b[i+1];
			
		}
		b[m-1]= temp;
		
		
	}

}
