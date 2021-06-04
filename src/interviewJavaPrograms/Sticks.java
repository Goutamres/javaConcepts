package interviewJavaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sticks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arr = new ArrayList<>();
		
		arr.add(5);
		arr.add(4);
		arr.add(4);
		arr.add(2);
		arr.add(2);
		arr.add(8);
		
		
		Collections.sort(arr);
	    
	    
	    List<Integer> l = new ArrayList<Integer>();
	    

	    for(int i=0;i<arr.size();){
	        int j=i;
	        
	        while(j<arr.size()&& arr.get(i)==arr.get(j)){
	            j++;
	            System.out.println("i "+i+"j "+j);
	        }
	        
	        System.out.println(arr.size()-i);
	        l.add(arr.size()-i);
	        i=j;
	        
	        
	    }
	    
	    for(int i:l) {
//	    	System.out.println(i);
	    }
	}

}
