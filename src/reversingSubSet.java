
public class reversingSubSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5,6,7,8,9,0};
		int k = 4;
		
		reverseSubset(a,k);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}
	
	public static void reverseSubset(int[] a,int k) {
		
		for(int i=0;i<a.length;i+=k) {
			int start =i;
			
			int end = Math.min(i+k-1, a.length-1);
			int temp;
			
			while(start<=end) {
				temp = a[start];
				a[start] = a[end];
				a[end] = temp;
				start++;
				end--;
			}
			
			
			
			
			
		}
		
		
	}

}
