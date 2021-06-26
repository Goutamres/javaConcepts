package interviewJavaPrograms;

public class sumOfDigitInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "ab234d2d4f3";
		
		String temp = "0";
		
		String str = "";
		
		int sum=0;
		
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))){
				temp+=s.charAt(i);
			}
			else {
				sum+= Integer.parseInt(temp);
				temp = "0";
			}
			
			if(Character.isAlphabetic(s.charAt(i))) {
				str+=s.charAt(i);
			}
			else {
				if(!str.equals(""))
				System.out.println(str);
				str = "";
			}
			
			
			
			
		}
		
		System.out.println(sum+Integer.parseInt(temp));

	}

}
