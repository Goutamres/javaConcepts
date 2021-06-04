package streamsAndFiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class Unzipping {
	
	public static void main(String[] arg) throws IOException {
		
		FileInputStream fin = new FileInputStream("zipped");
		
		FileOutputStream fout = new FileOutputStream("Unzipped");
		
		InflaterInputStream inf = new InflaterInputStream(fin);
		
		int str;
		
		while((str=inf.read())!=-1)
			fout.write((char)str);
		
		inf.close();
		fout.close();
		
		
		
	}

}
