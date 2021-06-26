package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class noDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner Input = new Scanner(System.in);
//        String Test_String = Input.nextLine();
//        Pattern p = Pattern.compile("^(?!.*(.).*\\1)\\d{10}");
//        
//        Matcher m = p.matcher(Test_String);
//        
//        System.out.println(m.matches());
        
        
//        Scanner Input = new Scanner(System.in);
//        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile("(\\w*)\\1+");
        
//        (a)(?!\\a
        
//        \b(\w+)\s+\1\b
        		
       // Pattern p = Pattern.compile("(\\w+)(?!\\\\w+)");		
        
        
//        Pattern p = Pattern.compile(".*([012]{1}[0-9]{0,1}[0-9]{0,1}.*)");
        
        Matcher m = p.matcher("aaabcccdeeffgggggiiiiii");
        System.out.println(m.matches());
        
        while(m.find()) {
        	    
        	System.out.println(m.group());

        }
        
        
        

	}

}
