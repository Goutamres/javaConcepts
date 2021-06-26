
public class mergeSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = {9,7,5,3,1,8,6,4,2};
		
		
		divide(a);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		

	}

	private static void divide(int[] a) {
		// TODO Auto-generated method stub
		
		int n = a.length;
		
		if(n>=2) {
			
			int mid = a.length/2;
			int[] left = new int[mid];
			
			int[] right = new int[n-mid];
			
			for(int i=0;i<mid;i++) {
				left[i] = a[i];
			}
			
			for(int i=mid;i<n;i++) {
				right[i-mid] = a[i];
			}
			
			divide(left);
			
			divide(right);
			
			merge(a,left,right);
			
			
		}
		
		
		
	}

	private static void merge(int[] a, int[] left, int[] right) {
		// TODO Auto-generated method stub
		
		int l= left.length;
		int r = right.length;
		
		int i=0,j=0,k=0;
		
		while(i<l&& j<r) {
			if(left[i]<right[j]) {
				a[k]= left[i];
				i++;
			}
			else {
				a[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i<l) {
			a[k]= left[i];
			i++;
			k++;
		}
		
		while(j<r) {
			a[k] = right[j];
			j++;
			k++;
		}
		
		
		
	}

}
