package interviewJavaPrograms;

public class arrayRotationJuggling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		
		int n = a.length;
		int t = 21;
		
		if(t>n) {
			t=t%n;
		}
		
		int gcd = gcdV(n,t);
		
		int i,j,k,temp;
		
		for(i=0;i<gcd;i++) {
			temp = a[i];
			j=i;
			while(true) {
				k=j+t;
				if(k>=n) {
					k=k-n;
				}
				if(k==i) {
					break;
				}
				a[j]= a[k];
				j=k;
			}
			a[j] =  temp;
		}
		
		for(int q:a) {
			System.out.print(q+" ");
		}

	}

	private static int gcdV(int a, int b) {
		// TODO Auto-generated method stub
		
		if(b==0) {
			return a;
		}
		else {
			return gcdV(b,a%b);
		}
	}
	
	

}
