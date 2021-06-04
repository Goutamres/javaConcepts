import java.util.ArrayList;
import java.util.List;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			StringBuilder b = new StringBuilder();
		
		  String s = "I am Goutam Balasubramanian";
	        
	        List<Integer> a = new ArrayList<Integer>();
	        
	        for(int i=s.length()-1;i>=0;i--){
		
		        System.out.print(s.charAt(i));
		        if(s.charAt(i)!=' ')
		        b.append(s.charAt(i));
		        if(s.charAt(i) == ' '){
			            a.add(i);
		}
		        
	        }
	        System.out.println();
	        
	        
	        for(int i=0;i<b.length();i++) {
	        	for(int j:a) {
	        		if(i==j) {
	        			System.out.print(" ");
	        		}
	        	}
	        	
	        System.out.print(b.charAt(i));
	        }


//		for(int i:a){
//			System.out.println(i);
//		}

	}

}
