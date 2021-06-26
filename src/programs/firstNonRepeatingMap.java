package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class countIndex{
	
	int index,count;
	
	
	public countIndex(int index) {
		this.count = 1;
		this.index = index;
		
	}
	
	public void incount() {
		this.count++;
	}
	
}


public class firstNonRepeatingMap {
	
	
	static Map<Character,countIndex> m = new HashMap<Character,countIndex>(256);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="abcdealzqwebdec";
		
		for(int i=0;i<str.length();i++) {
			if(m.containsKey(str.charAt(i))) {
				m.get(str.charAt(i)).incount();
			}
			else {
				m.put(str.charAt(i),new countIndex(i));
			}
		}
		
		int result = Integer.MAX_VALUE;
		
		for(Entry<Character,countIndex> z: m.entrySet() ) {
			if(z.getValue().count == 1 && z.getValue().index<result) {
				result = z.getValue().index;
			}
		}
		
		
		System.out.println(str.charAt(result));
		
		
		System.out.println(m);
		
		

	}

}



