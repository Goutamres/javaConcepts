package revision;

public class extract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String b= "https://programs.programmingoneonone.com/23456hackerrank23456";
		
		String a = "https://programs.programmingoneonone.com/23456extractme23456";
		
		
		String ab[] = b.split(".com/");
		
		for(String i:ab) {
			System.out.println(i);
		}
		
		StringBuffer sb = new StringBuffer();
		
		int count=0;
		

		for(int i=0;i<ab[1].length();i++) {
			if((ab[1].charAt(i)>='a'&&ab[1].charAt(i)<='z')) {
				
				count=1;
				sb.append(ab[1].charAt(i));
			}
			
			else {
				if(count==1) {
					break;
				}
			}
			
			
			
		}
		
		System.out.println(sb);
	}

}
