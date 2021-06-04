package stringConcepts;

public class stringSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "I am book reader";
		
		String ab = new String("I like books");
		
		char aarr[]= {'D','E','N','M','A','R','K'};
		
		String abc = new String(aarr);
		
		System.out.println("size "+a.length());
		
		boolean x = ab.startsWith("I");
		System.out.println("startsWith "+x);
		
		String p = abc.substring(0,7);
		
		String q = abc.substring(4);
		
		System.out.println("p="+p+""
				+ "q="+q+""
						+ "p+q"+(p+q));
		
		
		String str = "Hello, this ia book on java";
		
		char arr[] = new char[20];
		
		
		str.getChars(7, 15, arr, 0);
		System.out.println("finalcopy = "+arr );
		
		
		String splitter[];
		
		splitter = str.split(" ");
		
		for(int i=0;i<splitter.length;i++)
		{
			System.out.println(splitter[i]);
		}
		
		
		
		
		
		
		
	}

}
