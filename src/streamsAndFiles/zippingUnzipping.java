package streamsAndFiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class zippingUnzipping {
	
	public static void main(String[] arg) throws IOException {
		
		
		FileInputStream fin = new FileInputStream("sample");
		
		FileOutputStream fout = new FileOutputStream("zipped");
		
		DeflaterOutputStream de = new DeflaterOutputStream(fout);
		
		int data;
		
		while((data = fin.read())!=-1)
			de.write(data);
		
		fin.close();
		de.close();

	}

}
