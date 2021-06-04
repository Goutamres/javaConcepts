package Networking;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class twoWayCommunicationClientSide {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Socket s = new Socket("Localhost", 777);

		DataOutputStream dos = new DataOutputStream(s.getOutputStream());

		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

		BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));
		
		String str1,str2;
		while(!(str1 = brr.readLine()).equals("exit")) {
			
			dos.writeBytes(str1+"\n");
			str2= br.readLine();
			System.out.println(str2);
			
		}
		
		dos.close();
		br.close();
		brr.close();
		s.close();
		
		

	}

}
