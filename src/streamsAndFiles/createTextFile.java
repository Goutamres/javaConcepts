package streamsAndFiles;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class createTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		DataInputStream fis = new DataInputStream(System.in);
		
		FileOutputStream fout = new FileOutputStream("sample.txt",true); // true is for not get to lost previous data
		System.out.println("enter the text ");
		char ch;
		
		while((ch=(char) fis.read())!='@') 
			fout.write(ch);
			fout.close();

	}

}
