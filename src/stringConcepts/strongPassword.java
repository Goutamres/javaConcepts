package stringConcepts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class strongPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String password = "Ab1%";
		
		int n = password.length();
		
		System.out.println(Pattern.matches("[a-z]+", "abc"));
		
		
		
		
int s=0;
        
     Pattern d = Pattern.compile("(\\d)");
     Pattern l = Pattern.compile("([a-z])");
     Pattern u = Pattern.compile("([A-Z])");
     Pattern sp = Pattern.compile("(\\W)");
     
     if(!d.matcher(password).find()) {
    	 s++;
     }
     if(!l.matcher(password).find()) {
    	 s++;
     }
     if(!u.matcher(password).find()) {
    	 s++;
     }
     if(!sp.matcher(password).find()) {
    	 s++;
     }
     
     if((n+s)<6) {
    	 s+=(6-n-s);
     }
     
     System.out.println(s);
     
     

	}

}
