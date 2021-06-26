package interviewJavaPrograms;

public class spiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = {{1,2,3,4,1,2},{5,6,7,8,5,6},{9,10,11,12,9,10},{13,14,15,16,13,14}};
//		        top    1  2  3  4 1 2
//					   5  6  7  8 5 6
//					   9 10 11 12 9 10
//		bottom		  13 14 15 16 13 14
//					left       right
		
		
		
		int top = 0, bottom = a.length-1, left =0, right = a[0].length-1;
		
		System.out.println("top "+top+" bottom "+bottom+" left "+left+" right "+right);
		
		int dir = 0;
		
		while(top<=bottom && left<=right) {
			
			if(dir==0) {
				for(int i= left;i<=right;i++) {
					System.out.print(a[top][i]+" ");
				}
				
				top++;
			}
			
			else if(dir==1) {
				for(int i=top;i<=bottom;i++) {
					System.out.print(a[i][right]+" ");
				}
				
				right--;
			}
			
			else if(dir==2) {
				for(int i=right;i>=left;i--) {
					System.out.print(a[bottom][i]+" ");
				}
				
				bottom--;
			}
			
			else if(dir==3) {
				for(int i=bottom;i>=top;i--) {
					System.out.print(a[i][left]+" ");
				}
				left++;
			}
			
			
			dir= (dir+1)%4;
						
			
		}
	}

}
