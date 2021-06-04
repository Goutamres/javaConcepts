package stringConcepts;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="mayam";
		
		String o="";
		
		for(int i=s.length()-1;i>=0;i--) {
			o+=s.charAt(i)+"";
		}
		
		System.out.println(o);
		if(s.equals(o)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}

	}

}
