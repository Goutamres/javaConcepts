package interviewJavaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class mostRepeatedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,1,1,2,2,2,2,2,2,2,1,3,2,1,3,4,5,6};
		
		
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		
		for(int i=0;i<a.length;i++) {
			if(m.containsKey(a[i])) {
				m.put(a[i],m.get(a[i])+1);
			}
			
			else{
				m.put(a[i],1);
			}
		}
		
		
		int maxCount = -1, res = -1;
		
		for(Entry<Integer,Integer> v :m.entrySet()) {
			
			if(maxCount<v.getValue()) {
				maxCount = v.getValue();
				res = v.getKey();
			}			
			
		}
		
		
		System.out.println("Result "+res);
		
		
		//sortByValue
		
		
		

	}

}
