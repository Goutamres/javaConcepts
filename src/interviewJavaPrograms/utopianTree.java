
package interviewJavaPrograms;

public class utopianTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(utopianTreeMethod(4));

	}
	
	public static int utopianTreeMethod(int n) {
	    // Write your code here
	        int sum=1;
	        if(n==0){
	            sum=1;
	        }
	        else if(n==1){
	            sum+=1;
	        }
	        else{
	        	sum=2;
	        for(int i=2;i<=n;i++){
	            
	            if(i%2==0){
	                sum=sum+1;
	                System.out.println(i+" "+sum);
	            }
	            else{
	                sum=sum*2;
	                System.out.println(i+" "+sum);
	            }
	        }
	        }       
	        return sum;
	        
	    }

}
