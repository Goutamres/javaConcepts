package inputAndOutputConcepts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputDifferentDatatypes {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("Enter a Char");
		//char ch = (char)rd.read();
		char ch = rd.readLine().charAt(0);
		
		
		System.out.println("Enter a string");
		String sh = rd.readLine();
		
		
		//parse
		System.out.println("Enter a int");
		int num = Integer.parseInt(rd.readLine());
		
		System.out.println("Enter a float");
		float n = Float.parseFloat(rd.readLine());
		
		System.out.println("Enter a Double");   //1.7976931348623157E308
		double numb = Double.parseDouble(rd.readLine());
		
		System.out.println("Enter a Byte");   //
		byte a = Byte.parseByte(rd.readLine());
		
		System.out.println("Enter a short");   //32767
		short b = Short.parseShort(rd.readLine());
		
		System.out.println("Enter a long");   //9223372036854775807
		long c = Long.parseLong(rd.readLine());
		
		System.out.println("enter a boolean");
		boolean d = Boolean.parseBoolean(rd.readLine());
		
		
		
		//parseOver
		
		
		System.out.println("Enter a string");
		String sh1 = (String)rd.readLine();
		
		
		System.out.println("String: "+sh);
		System.out.println("Char: "+ch);
		System.out.println("int: "+num);
		System.out.println("float: "+n);
		System.out.println("Double: "+numb);
		System.out.println("Byte: "+a);
		System.out.println("Short: "+b);
		System.out.println("Long: "+c);
		System.out.println("Boolean: "+d);
		System.out.println("string: "+sh1);
 
	}

}
