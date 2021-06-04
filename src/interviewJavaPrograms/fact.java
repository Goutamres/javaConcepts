package interviewJavaPrograms;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fact1(0));
		
		
		

	}
	
	
	public static int fact1(int n) {
		
		return n==0?1: n* fact1(n-1);
		
	}

}
