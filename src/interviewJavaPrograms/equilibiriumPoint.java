package interviewJavaPrograms;

public class equilibiriumPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,3,2,5,2,-3};
		
		int[] b = new int[a.length];
		
		int c=0;
		
		for(int i=0;i<a.length;i++) {
			c+=a[i];
			b[i] = c;
		}
		
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
			
		for(int i=1;i<a.length-1;i++) {
			if((b[i]-a[i])== b[b.length-1] - b[i]) {
				System.out.println("Answer "+ a[i]+ " at Position:"+i);
				break;
			}
				
				//lsum = sum[i] -a[i]
				//rsum = sum[b.length] - sum[i];
		}
	}

}
