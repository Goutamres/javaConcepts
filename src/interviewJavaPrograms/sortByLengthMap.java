package interviewJavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class sortByLengthMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] a = {"Hi","are" ,"Your","idgcigc"};
		
		Map<String,Integer> m = new HashMap<String,Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			m.put(a[i],a[i].length());
		}
		
		List<Entry<String,Integer>> entry = new ArrayList<>(m.entrySet());
		
		Collections.sort(entry,(c,b) -> c.getValue().compareTo(b.getValue()) );
		
		System.out.println(m);
		
		
		for(Entry<String,Integer> s:entry) {
			System.out.println(s.getKey()+" "+s.getValue());
		}
		
		Arrays.sort(a,(z,y) -> y.length() - z.length());
		
		for(String s:a) {
			System.out.println(s);
		}
		
	}

}
