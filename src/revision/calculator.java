package revision;

import java.util.Scanner;

public class calculator {
	
	public static void main(String args[]) {
		Scanner sc  = new Scanner(System.in);
		
		double fnum,snum,result;
		
		System.out.println("Enter first num:");
		
		fnum = sc.nextDouble();
		
		System.out.println("Enter second num:");
		
		snum = sc.nextDouble();
		
		System.out.println(fnum + snum);
		
	}

}
