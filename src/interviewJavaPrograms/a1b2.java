package interviewJavaPrograms;

public class a1b2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//aabbcccd
		//a2b2c3d1
		
		String s = "z0a2b4c7";
		
		int n;
		
		for(int i=0;i<s.length();) {
			
			for(int j=0;j<Integer.parseInt(String.valueOf(s.charAt(i+1)));j++) {
				System.out.print(s.charAt(i));
			}
			i+=2;
		}

	}

}
