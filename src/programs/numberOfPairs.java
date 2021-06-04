package programs;

import java.util.HashSet;
import java.util.Set;

public class numberOfPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,1,2,3,3,1,2,2};
		
		System.out.println(numberOfPair(a));

	}

	
	public static int numberOfPair(int a[]) {
		
		int pair=0;
		
		
		Set<Integer> s = new HashSet<Integer>();
		
		
		
		
		for(int i: a) {
			if(!(s.contains(a[i]))) {
				s.add(a[i]);
			}
			else {
				s.remove(a[i]);
				pair++;
			}
		}
		
		
		return pair;
		
	}
}
