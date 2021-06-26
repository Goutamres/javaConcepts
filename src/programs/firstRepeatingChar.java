package programs;

import java.util.HashSet;
import java.util.Set;

public class firstRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "babcdeabcde";
		
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
		
		Set<Character> z = new HashSet<Character>();
		
		for(int i=0;i<str.length();i++) {
			if(z.add(str.charAt(i))== false){
				System.out.println("first repeated "+str.charAt(i));
				break;
			}
		}
		

	}

}
