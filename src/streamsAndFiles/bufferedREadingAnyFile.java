package streamsAndFiles;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedREadingAnyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the filename: ");
		String f = br.readLine();
		
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File now found");
			return;
		}
		
		BufferedInputStream bin = new BufferedInputStream(fin);
		
		int ch;
		
		while((ch=bin.read())!=-1)
			System.out.println((char)ch);
		
		bin.close();

	}

}
