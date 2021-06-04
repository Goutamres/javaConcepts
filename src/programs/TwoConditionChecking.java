package programs;

public class TwoConditionChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2,4};
		int b[] = {16,32,96};
		
		int c=0;
		
		for(int i=1;i<=100;i++) {
			boolean k = true;
			
			for(int j=0;j<a.length&&k;j++) {
				if(i%a[j]!=0) {
					k=false;
				}
			}
			
			for(int j=0;j<b.length&&k;j++) {
				if(b[j]%i!=0) {
					k=false;
				}
			}
			
			if(k) {
				c++;
			}
		}
		
		System.out.println(c);

	}

}
