package interviewJavaPrograms;

public class swapTwoChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] ab = {'A' , ' ', 'B', ' ', 'C', 'D', ' ', 'E', 'F'};
		
		
		int i=0, j= ab.length-1;
		
		while(i<j) {
			
			if(ab[i]==' ') {
				i++;
			}
			else if(ab[j]==' ') {
				j--;
			}
			
			else {
				ab[i] = (char) ((int) ab[i] + (int) ab[j]);
				
				ab[j] = (char) ((int) ab[i] - (int) ab[j]);
				
				ab[i] = (char) ((int) ab[i] - (int) ab[j]);
				
				i++;
				j--;
			}
			
			
		}
		
		
		for(char k:ab) {
			System.out.println(k);
		}
		
		
		
//		char a = 'a';
//		
//		char b = 'b';
//		
//		a = (char) ((int) a + (int) b);
//		
//		b = (char) ((int) a - (int) b);
//		
//		a = (char) ((int) a - (int) b);
//		
//		System.out.println(a);
//		
//		System.out.println(b);

	}

}
