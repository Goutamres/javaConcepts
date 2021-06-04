package collectionFramework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Long> hs = new HashMap<String, Long>();
		
		hs.put("Goutam", (long) 1234);
		
		hs.put("Raja", (long) 20018072);
		
		System.out.println(hs);
		
		String name ="";
		Long id = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			System.out.println("1.Enter the choice");
			
			int  n = 0;
			try {
				n= Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			switch(n) {
			
			case 1:
				try {
					name = br.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					id = Long.parseLong(br.readLine());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				hs.put(name, id);
				break;
			case 2:
				try {
					name = br.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				name = name.trim();
				id = hs.get(name);
				System.out.println(id);
				break;
			case 3:
				Set<String> s = new HashSet<String>();
				
				s= hs.keySet();
				System.out.println(s);
				break;
			case 4:
				return;
				
			}
			
			
			
			
		}

	}

}
