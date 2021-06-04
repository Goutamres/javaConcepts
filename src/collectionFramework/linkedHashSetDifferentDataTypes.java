package collectionFramework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedHashSetDifferentDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedHashSet hsh = new LinkedHashSet();
		
		hsh.add(100);
		hsh.add("hi");
		
		HashSet hsh1 = new HashSet();
		
		hsh1.add(1001);
		hsh1.add("hiiii");
		
		
		System.out.println(hsh);
		
		System.out.println(hsh1);
		
		hsh.clear();
		
		hsh.addAll(hsh1);
		
		System.out.println(hsh);
		
		

	}

}
