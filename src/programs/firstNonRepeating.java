package programs;

public class firstNonRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "abcdeabdefibeuvgahsbc,jhvdjervchdsbzhsdvcuwvcjbchbchbvcuhdvc";
		
		int[] b = new int[256];
		
		for(int i=0;i<256;i++) {
			b[i]= -1;
		}
		
		for(int i=0;i<a.length();i++) {
			if(b[a.charAt(i)]==-1) {
				b[a.charAt(i)]=i;
			}
			else {
				b[a.charAt(i)]=-2;
			}
		}
		
		
		for(int i:b) {
			System.out.println(i);
		}
		
		int min = Integer.MAX_VALUE;
		for(int i=0;i<256;i++) {
			if(b[i]>0&& b[i]<min) {
				min = b[i];
			}
		}
		
		System.out.println(a.charAt(min));

	}

}
