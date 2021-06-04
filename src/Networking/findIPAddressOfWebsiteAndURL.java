package Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;

public class findIPAddressOfWebsiteAndURL {
	
	public static void main(String[] arg) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the website:");
		String site = br.readLine();
		InetAddress ip = InetAddress.getByName(site);
		System.out.println("Ip:"+ip);
		
		System.out.println("enter web:");
		String site2 = br.readLine();
		
		URL obj = new URL(site2);
		System.out.println("Protocol:"+obj.getProtocol());
		System.out.println(obj.getHost()+" "+obj.getFile()+" "+obj.getPort()+" "+obj.getPath()+" "+obj.toExternalForm());
		
	}

}
