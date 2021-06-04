package stringConcepts;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import collectionFramework.hashMap;

public class characterDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "jjava";
		
		
		
		
		
		
		//System.out.println(s.length());
		
		s=s.toLowerCase();
		
		int[] count = new int[256];
		
		for(int i=0;i<s.length();i++){
			count[s.charAt(i)]++;
		}
		
		for(int i=0;i<count.length;i++) {
			if(count[i]==1) {
			//System.out.println((char)i+" "+count[i]);
		
			}
		}
		
		Map<Character, Integer> hm = new HashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++) {
			//System.out.println(s.charAt(i)+" "+count[(int)s.charAt(i)]);
			//hm.put(s.charAt(i), count[s.charAt(i)]);
			if(count[s.charAt(i)]==1) {
				//System.out.println(s.charAt(i));
				break;
			}
			
		}
		
		//System.out.println(count['a']);
		
		//System.out.println(hm);
		
		
		
		//Using MAp
		Map<Character,Integer> m = new HashMap<Character, Integer>();
		
		
		for(int i=0;i<s.length();i++) {
			if(m.containsKey(s.charAt(i))) {
				m.put(s.charAt(i), m.get(s.charAt(i))+1);
			}
			else {
				m.put(s.charAt(i), 1);
			}
		}
		
		for(Map.Entry<Character, Integer> i: m.entrySet() ) {
			if(i.getValue()==2) {
				System.out.println(i.getKey());
			}
			
		}
		
		
		
		//System.out.println(m);

	}

}
