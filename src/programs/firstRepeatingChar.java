package programs;

public class firstRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcdeabcde";
		
		char s = 0 ;
		
		char c[] = new char[256];
		
		for(int i=0;i<str.length();i++) {
			c[str.charAt(i)]++;
			
		}
		
		for(int i=0;i<str.length();i++) {
			if(c[str.charAt(i)]==1) {
				s= str.charAt(i);
//				break;
				System.out.println(c[str.charAt(i)]);
			}
		}
		System.out.println(s);	
		

	}

}
