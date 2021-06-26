package interviewJavaPrograms;

import java.util.HashSet;
import java.util.Set;

public class removesDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char[] a = {'a','a','a','b','b','c','c','d'} ;
		
		Set<Character> s = new HashSet<Character>();
		
		for(int i=0;i<a.length;i++) {
			s.add(a[i]);
		}
		
	
		
		System.out.println(s);

	}

}
