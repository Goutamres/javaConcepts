package Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class twoWayCommunicationServerSide {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		ServerSocket ss = new ServerSocket(777);
		
		Socket s = ss.accept();
		System.out.println("connection established");
		
		OutputStream ou = s.getOutputStream();
		
		PrintStream ps = new PrintStream(ou);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			String str,str2;
			
			while((str=br.readLine())!=null) {
				System.out.println(str);
				
				str2= brr.readLine();
				ps.println(str2);
			}
			
			
			ps.close();
			br.close();
			brr.close();
			s.close();
			ss.close();
			System.exit(0);
		}
		
		
		
		

	}

}
