package stringConcepts;

public class stringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hi";
		
		//matuoG si siht
		
//		for(int i=s.length()-1;i>=0;i--) {
//			System.out.print(s.charAt(i));
//		}
//		System.out.println();
//		
//		String a[] = s.split(" ");
//		
//		for(int i=a.length-1;i>=0;i--) {
//			System.out.print(a[i]+" ");
//		}
//		
//		System.out.println();
		
		rever(s);
		

	}
	
	public static void rever(String s) {
		
		if(s==null || s.length()<=1) {
			System.out.print(s);
		}
		else {
		System.out.print(s.charAt(s.length()-1));
		rever(s.substring(0,s.length()-1));
		
		}
		
	}

}
