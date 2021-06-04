package stringConcepts;

public class strinComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "hello";
		
		String s2 = new String("hello");
		
		
	String s3 = "hello";
	
	String s4 = new String("hello");
		
		if(s1==s2) {
			System.out.println("same");
		}
		else {
			System.out.println("not same");
		}
		if(s1==s3) {
			System.out.println("s1 and s3 are equal");
		}
		if(s1.equals(s2)) {
			System.out.println("s1 and s2 are equal");
		}
		
		if(s4==s2) {
			System.out.println("same");
		}
		else {
			System.out.println("not same");
		}
		
		
		

	}

}
