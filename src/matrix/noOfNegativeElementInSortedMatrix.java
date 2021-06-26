package matrix;

public class noOfNegativeElementInSortedMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][] a = {{-7,-5,-1,0},{-6,-3,1,2},{-4,-2,2,4}};
		
		int c=0;
		
		int n= a.length;
		
		int m= a[0].length;
		
		int i=0 ,j=m-1;
		
		while(i<n&&j>=0) {
			System.out.println(a[i][j]);
			if(a[i][j]<0) {
				c = c+j+1;
				i++;
			}
			else {
				j--;
			}
			
		}
		
		System.out.println("Count: "+c);
		
		

	}

}
