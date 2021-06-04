package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class mergeTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3};
		
		String b[] = {"abc","def","ghi" };
		
		char c[] = {'a','b','c'};
		
		List<Object> l = new ArrayList<Object>();
		
		for(int i:a) {
			l.add(i);
		}
		
		for(String i:b) {
			l.add(i);
		}
		
		for(char i:c) {
			l.add(i);
		}
		
		for(Object i:l) {
			
			System.out.println(i);
			
		}

	}

}
