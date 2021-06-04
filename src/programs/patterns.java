package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the rows");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int r = 0;
		try {
			r = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		for(int i=0;i<r;i++) {
			
			int m = (2*i)+1;
			for(int j=0;j<(m);j++) {
				
				if(j==0||j==(m-1)) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();			
		}
	}

}
