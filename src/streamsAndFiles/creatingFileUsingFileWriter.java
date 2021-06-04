package streamsAndFiles;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class creatingFileUsingFileWriter {
	
	public static void main(String[] args) throws IOException {
		
		String str = "this is fileWriter Using file Writer";
		
		FileWriter fw = new FileWriter("first");
		
		for(int i=0;i<str.length();i++) {
			fw.write(str.charAt(i));
		}
		
		fw.close();
		
		int ch;
		
		
		//reading file using fileReader
		FileReader fr = new FileReader("first");
		
		while((ch=fr.read())!=-1)
			System.out.println((char)ch);
		
		fr.close();
	}

}
