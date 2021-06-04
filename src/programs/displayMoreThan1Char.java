package programs;

import java.util.HashMap;

public class displayMoreThan1Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="geeksgeeksabcdeabcdezxa#.\"\"";
		
		int ch[] = new int[256];
		
		for(int i:ch) {
			System.out.println(i);
		}
		
		
		
		
		int c=0;
		
		for(int i=0;i<s.length();i++) {
			
			
			ch[s.charAt(i)]++;
			c++;
			
			
		}
		
		System.out.println(ch['a']);
		
//		
//		for(int i:ch) {
//			System.out.println(i);
//		}
		
		
		
		
		HashMap<Character,Integer> m = new HashMap<Character,Integer>();
		
		
		for(char i=0;i<s.length();i++ ) {
			if(ch[s.charAt(i)]>=1) {
				m.put(s.charAt(i),ch[s.charAt(i)]);
				
			}
		}
		
		
		System.out.println(m);
		

	}

}
