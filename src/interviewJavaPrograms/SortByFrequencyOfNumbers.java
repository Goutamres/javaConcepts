package interviewJavaPrograms;

public class SortByFrequencyOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,1,3,4,2,3,1,4,4,4,4,3,3,3,3,3};
		
		//3 3 3 3 3 3 3 4 4 4 4 4 1 1 1 2 2 
		
		int[][] b = new int[a.length][2];
		
		a = sort(a);
		
		displayArray(a);
		
		int x=0;
		
		b[x][0] = a[0];
		b[x][1] = 1;
		
		for(int i=1;i<a.length;i++) {
			
			if(a[i]==a[i-1]) {
				b[x][1] = b[x][1]+1;
			}
			else {
				x++;
				b[x][0]= a[i];
				b[x][1]=1;
			}						
		}
		
		displayDobleArray(b, x);
		
		for(int i=0;i<=x;i++) {
			for(int j=i;j<=x;j++) {
				if(b[i][1]<b[j][1]) {
					int temp;
					temp = b[i][1];
					b[i][1] = b[j][1];
					b[j][1]= temp;
					
					temp = b[i][0];
					b[i][0] = b[j][0];
					b[j][0]= temp;
					
				}
			}
		}
		
		System.out.println("Sorted 2D");
		
		displayDobleArray(b, x);
		
		System.out.println("x: "+x);
		
		for(int j=0;j<=x;j++) {
			for(int i=0;i<b[j][1];i++) 	{
				System.out.print(b[j][0]+" ");
			}
		}		

	}

	private static int[] sort(int[] a) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp;
					temp = a[i];
					a[i]= a[j];
					a[j] = temp;
				}
			}
		}
		
		
		
		return a;
	}
	
	public static void displayArray(int[] a) {
		for(int i:a) {
			System.out.print(i+" ");
		}
		
		System.out.println();
	}
	
	public static void displayDobleArray(int[][] b,int x) {
		for(int i=0;i<=x;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	

}
