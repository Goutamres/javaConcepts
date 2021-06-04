package streamsAndFiles;

import java.io.FileInputStream;
import java.io.IOException;

public class ReaadingTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fin = new FileInputStream("sample.txt");
		
		int ch;
		
		while((ch=fin.read())!=-1)
			System.out.println((char)ch);

		fin.close();
	}

}
