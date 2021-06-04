package interviewJavaPrograms;

public class integerPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isIntPalindrome(234565432));

	}

	private static String isIntPalindrome(int i) {
		// TODO Auto-generated method stub
		int pa = i;
		
		int re = 0,rem;
		
		while(pa!=0) {
		rem = pa %10;
		pa = pa /10;
		re = re*10 + rem;
		}
		
		if(re == i) {
			return "Palindrome";
		}
		
		
		
		return "Not palindrome";
	}

}
