package interviewJavaPrograms;

public class primeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(prime(131));

	}

	private static String prime(int i) {
		// TODO Auto-generated method stub
		if(i==0||i==1) {
			return "Neither prime or composite";
		}
		
		if(i==2||i==3) {
			return "Prime Number";
		}
		
		if(i%2==0) {
			return "Not prime number";
		}
		
			int sqrt = (int) Math.sqrt(i) +1;
			for(int j=3;j<sqrt;j+=2) {
				if(i%j==0) {
					return "Not Prime Number";
				}
				
			}

		return "Prime Number";
		
		
	}

}
