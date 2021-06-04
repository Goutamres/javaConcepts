
public class diagonalMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					//00,01,02,10,11,12, 20,21,22
		int[][] a = {{1, 1, 1},{1, 1,1},{1,1,1}};
		
		int z=0,y=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i==j) {
					z+=a[i][j];
					System.out.println("i "+i+" j "+j+" z "+z);
				}
				if((i+1)==(a.length-j)) {
					y+=a[i][j];
					System.out.println("i "+i+" j "+j+" y "+y);
				}
			}
		}
		
		System.out.println("Answer: "+Math.abs(y-z));
		
	}

}
