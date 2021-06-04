package collectionFramework;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedHashSet {
	
	public static void main(String[] args) {
	LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
	
	
	hs.add(100);
	hs.add(200);
	System.out.println(hs);
	
	hs.add(300);
	System.out.println(hs);
	
	hs.remove(100);
	System.out.println(hs);
	
	
	//no duplication
	hs.add(200);
	hs.add(100);
	System.out.println(hs);
	
	//addAll to new Hashset
	
	LinkedHashSet<Integer> hs1 = new LinkedHashSet<Integer>();
	
	hs1.addAll(hs);
	
	System.out.println(hs1+" , "+hs);
	
	
	//clear
	
	hs1.clear();
	
	System.out.println(hs1+" ,"+hs);
	
	//contains
	
	if(hs.contains(200)) {
		
		System.out.println("true");
	}
	else {
		
		System.out.println("false");
		
	}
	
	//equals
	
	boolean a = hs.equals(hs1);
	System.out.println(a);
	
	
	System.out.println(hs.size());
	
	//object conversion
	
	Object[] a1 = hs.toArray();
	
	for(int i=0;i<a1.length;i++) {
		
		System.out.println(a1[i]);
		
	}
	
	LinkedHashSet<String> hs2 = new LinkedHashSet<String>();
	
	hs2.add("hi");
	hs2.add("How");
	hs2.add("you");
	hs2.add("?");
	
	Object[] in = hs2.toArray();
	
	for(int i=0;i<hs2.size();i++) {
		
		System.out.print(in[i]+" ");
		
	}
	System.out.println();
	
	//iterator
	
	Iterator<Integer> it= hs.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
		
	}
	
	//removeAll
			
	hs.removeAll(hs);
	
	System.out.println(hs+""+hs1);
	
	
	//String
	
	//conversion Array to hashset
	
	
	String[] array1 = {"hi","how","you","?"};
	
	LinkedHashSet<String> has = new LinkedHashSet<String>(Arrays.asList(array1));
	
	System.out.println(has);
	
	
	
	
	//hashset to Array
	
	
	
	String[] array2 = new String[has.size()];
	has.toArray(array2);
	
	for(int i=0;i<array2.length;i++) {
		System.out.println(array2[i]);
	}
	
	
	System.out.println(Arrays.toString(array2));
	
	
	//Integer
	
	
	//conversion Array to hashset
	
	
			int[] array3 = {10,20,30,40,50};
			
			LinkedHashSet<Integer> has1 = new LinkedHashSet<Integer>();
			
			for(int i=0;i<array3.length;i++) {
				
				has1.add(array3[i]);
			}
			
			
			
			System.out.println(has1);
			
			
			
			
			//hashset to Array
			
			
			
		
			Object[] array4 = has1.toArray();
			
			for(int i=0;i<has1.size();i++) {
				
				System.out.println(array4[i]);
				
				
			}

	
}	

}
