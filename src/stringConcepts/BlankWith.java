package stringConcepts;

public class BlankWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "I am Goutam";
		
		System.out.println(s.replaceAll(" ", "%20"));
		
//		System.out.println(s.join("", b));
		//I%20am%20Goutam
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				
				sb.append("%20");
			}
			else {
				sb.append(s.charAt(i));
			}
		}
		
		System.out.println(sb);

	}

}
