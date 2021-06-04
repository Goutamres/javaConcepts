package programs;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = {20,19,18,17,16,15,14,13,12,11};
		
		String b[] = {"abcd"};
		int c[] = {10,9,8,7,6,5,4,3,2,1,0};
		
		ArrayList<Object> ab = new ArrayList<>();
				
		for(int e : a) {
			ab.add(e);
		}
		
		for(String d : b) {
			ab.add(d);
		}
				
		for(int i=0;i<ab.size();i++) {
			System.out.print(ab.get(i));
			
		}
		System.out.println();
				
		int length = a.length  + c.length;
		
		int d[] = new int[length];
		
		
		int k=0;
		
		for(int i=0;i<d.length;i++) {
			if(i<a.length) {
				d[i]=a[i];
			}
			else {
				if(k<c.length) {
				d[i]= c[k];
				k++;
				}
			}
		}
		
		Arrays.sort(d);
		
		for(int i:d) {
			System.out.println(i);
		}
		
		
		
		
		
		

	}

}
