package programs;

import java.util.HashMap;

public class hashMapStringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "geeksgeeks";
		
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
		
		
		char[] a = s.toCharArray();
		
		for(char i:a) {
			
			Integer j = m.get(i);
			
			
			if(j==null) {
				m.put(i, 1);
			}
			
			else {
				m.put(i,j+1);
			}			
		}
		
		System.out.println(m);

	}

}
