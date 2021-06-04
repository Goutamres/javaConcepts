package inputAndOutputConcepts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inputsDifferentTypesInALine {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Input: ");
		String str = n.readLine();
		
		StringTokenizer str1 = new StringTokenizer(str,",");
		
		String s1 = str1.nextToken();
		String s2 = str1.nextToken();
		String s3 = str1.nextToken();
		
		
		String name = s1;
		String age = s2;
		String sal = s3;
		
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("sal: "+sal);
		
		
		

	}

}
