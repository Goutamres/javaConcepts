package programs;

import java.util.ArrayList;

public class roundingOffMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {38,43,42,75,98};
		
		System.out.println(rounding(a));
		

	}

	private static ArrayList<Integer> rounding(int[] a) {
		// TODO Auto-generated method stub
		
ArrayList<Integer> ar = new ArrayList<Integer>();
		
		for(int i:a) {
			if(i<=38 || i%5<=2) {
				ar.add(i);
			}
			else if(i%5>2) {
				ar.add(i + 5 - (i%5));
			}
		}
		
		return ar;
		
	}

}
