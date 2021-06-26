package interviewJavaPrograms;

public class sumOfDigitToSingleDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =192;
		
		int d=a;
		
		int s=0;
		
		while(d>0||s>9) {
			
			if(d==0) {
				d=s;
				s=0;
			}
			
			
			s+=d%10;
			d=d/10;
			
			
		}
		
		System.out.println(s);
		
		

	}

}
