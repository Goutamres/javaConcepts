package stringConcepts;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile("(a)(?!\\a)");
        
//        Pattern p = Pattern.compile("(a)(?=\\1)");
//        Pattern p = Pattern.compile("(?<=[aeiou])([13579])");
//        Pattern p = Pattern.compile("(?<![aeiou])([13579])");
//        Pattern p = Pattern.compile("(.)(?=\\1)");
        Matcher m = p.matcher(Test_String);
        
        System.out.println(m.matches());
        
        int Count = 0;
        while(m.find()){
        	System.out.println(m.toString());
            Count += 1;
        }
       
        System.out.println(Count);
		
		
		
		
		
     

	}

}
