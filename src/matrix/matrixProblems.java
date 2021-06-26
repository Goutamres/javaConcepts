package matrix;

public class matrixProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char[][] a = {{'a','b','c','d','e'},{'f','a','b','c','d'},{'g','f','a','b','c'},{'h','g','f','a','b'}};
		
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a[i].length-1;j++) {
				if(a[i][j]!= a[i+1][j+1])
				{
					System.out.println( false);
					break;
				}
				
			}
			System.out.println(true);
		}
		

	}

}
