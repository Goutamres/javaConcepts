package programs;

import java.util.ArrayList;
import java.util.List;

public class subArrayDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			List<Integer> s = new ArrayList<Integer>();
			
//			int m=2,d=3;
			
			int m=1,d=4;
			
//			int a[] = {1,2,1,3,2};
			
			int a[] = {4};
			
			for(int i: a) {
				s.add(i);
			}
			
			
		   int count =0,c,sum,e;
	        for(int i=0;i<s.size()-1;i++){
	            e=0;
	            sum=0;
	            while(e<m&&i<=(s.size()-m)){
	            	
	                c=i+e;
	                sum=sum+s.get(c);
	                System.out.println("Sum1 = "+sum);
	                c++;  
	                e++;                    
	            }
	            System.out.println("Sum = "+sum);
	             if(sum==d){
	                    count++;
	                }
	        }  
	        
	        System.out.println(count);
	}

}
