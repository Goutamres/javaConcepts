package programs;

import java.util.ArrayList;
import java.util.List;

public class breakingTheRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = { 10, 5, 20, 20, 4, 5, 2, 25, 1	};
		
		List<Integer> ar = new ArrayList<Integer>();
		
	for(int i: a) {
		ar.add(i);
	}
	
	int l= ar.get(0);
	
	int h = ar.get(0);
	
	int c1=0,c2=0;
	
	for(int i: ar) {
		if(i<l) {
			l=i;
			c2++;
		}
		if(i>h) {
			h=i;
			c1++;
		}
		
	}
	
	System.out.println(c1+" "+c2);
	
	
	}

}
