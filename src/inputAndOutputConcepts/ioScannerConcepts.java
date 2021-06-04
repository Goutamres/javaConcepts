package inputAndOutputConcepts;

import java.util.Scanner;

public class ioScannerConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the input");
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		int age = sc.nextInt();
		float sal = sc.nextFloat();
		
		
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("sal: "+sal);
	}

}
