package collectionFramework;

import java.util.StringTokenizer;

public class stringTokeniserConcepts {
	
	public static void main(String arg[]) {
	
	String str = "Hi how are you";
	
	StringTokenizer s = new StringTokenizer(str," ");
	
	while(s.hasMoreTokens()) {
		System.out.println(s.nextToken());
	}
	}

}
