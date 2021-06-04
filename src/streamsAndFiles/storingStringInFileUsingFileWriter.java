package streamsAndFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class storingStringInFileUsingFileWriter {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		
		FileWriter fw = new FileWriter("first");
		
		System.out.println("enter the string: ");
		while(!(str=br.readLine()).equals("exit"))
			fw.write(str+"\n");
			fw.close();
			
			
			String str1;
			
			FileReader fr = new FileReader("first");
			
			BufferedReader br1 = new BufferedReader(fr);
			
			while((str1=br1.readLine())!=null)
				System.out.println(str1);
			
		fr.close();
	}

}
