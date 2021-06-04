package Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class oneWayCommunicaionClientSide {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//192.168.43.53
		
		Socket s = new Socket("localhost",777);
		
		InputStream in = s.getInputStream();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		
		String str;
		
		while((str=br.readLine())!=null)
			System.out.println("Messages sent : "+str );

		br.close();
		s.close();
	}

}
