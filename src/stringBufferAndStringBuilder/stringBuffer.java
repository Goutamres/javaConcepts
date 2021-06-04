package stringBufferAndStringBuilder;

public class stringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer str = new StringBuffer();

		System.out.println(str.capacity());

		StringBuffer str1 = new StringBuffer(100);

		System.out.println(str1.capacity());

		StringBuffer str3 = new StringBuffer("Hello, This     is String Buffer");

		System.out.println(str3.capacity());
		System.out.println(str3);
		
		//appendFunctionality
		
		StringBuffer str4 = new StringBuffer("Uni");
		str4.append("versity");
		
		System.out.println(str4);
		
		
		//insertFunctions
		
		StringBuffer str5 = new StringBuffer("Intelligent People");
		
		str5.insert(12, "young ");
		
		System.out.println(str5);
		
		//otherFunction
		
		System.out.println(str5.indexOf("you"));
		
		System.out.println(str3.lastIndexOf("is"));
		
		System.out.println(str3.replace(7, 11, "Haii"));
		
		System.out.println(str3.substring(5));
		
		System.out.println(str3.substring(0, 5));

	}

}
