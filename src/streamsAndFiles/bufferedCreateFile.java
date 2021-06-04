package streamsAndFiles;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class bufferedCreateFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		DataInputStream fis = new DataInputStream(System.in);

		FileOutputStream fout = new FileOutputStream("sample.txt", true);
		
		BufferedOutputStream bout = new BufferedOutputStream(fout,1024);
		System.out.println("enter the text ");
		char ch;

		while ((ch = (char) fis.read()) != '@')
			bout.write(ch);
		bout.close();

	}

}
