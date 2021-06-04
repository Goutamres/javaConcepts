package interviewJavaPrograms;

public class stringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(ispalindrome("bwcrob"));
		
		System.out.println(isdiffpalindrome("boob"));
		

	}

	private static String isdiffpalindrome(String input) {
		// TODO Auto-generated method stub
		for (int i = 0; i < input.length() / 2; i++)
			if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
			return "Not a Palindrome";
			}
			return "Palindrome";

				}

	private static String ispalindrome(String string) {
		// TODO Auto-generated method stub
		
		String reverse = reverse(string);
		if(string.equals(reverse)) {
			return "Palidrome";
		}
		return "Not a palindrome";
		
	}

	private static String reverse(String string) {
		// TODO Auto-generated method stub
		if(string == null || string.length() == 0) {
			return string;
		}
		
		
		return string.charAt(string.length()-1)+reverse(string.substring(0, string.length()-1));
	}

}
