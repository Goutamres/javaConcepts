package Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class oneWayCommunicationServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ServerSocket ss = new ServerSocket(777);
		
		Socket s = ss.accept();
		
		System.out.println("connection Established");
		
		OutputStream obj = s.getOutputStream();
		
		PrintStream ps = new PrintStream(obj);
		System.out.println("Enter the message to send: ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String msg = br.readLine();
		
		ps.println(msg);
		
		
		
		ps.close();
		s.close();
		ss.close();

	}

}
