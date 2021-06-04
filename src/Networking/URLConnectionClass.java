package Networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class URLConnectionClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		URL obj = new URL("http://www.google.com");
		
		URLConnection urC = obj.openConnection();
		
		System.out.println("Date:"+new Date(urC.getDate()));
		
		System.out.println("ContentType:"+urC.getContentType());
		
		System.out.println("expiryDate: "+urC.getExpiration());
		
		System.out.println("Last Modified: "+new Date(urC.getLastModified()));
		
		System.out.println("");
		int length = urC.getContentLength();
		
		if(length==0) {
			System.out.println("content not available");
		}
		else {
			int ch;
			InputStream in = urC.getInputStream();
			while((ch=in.read())!=-1)
				System.out.print((char)ch);
		}
		
		
		

	}

}
