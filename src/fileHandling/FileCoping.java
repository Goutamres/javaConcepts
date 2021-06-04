package fileHandling;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCoping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		copyFile();

	}
	
	public static void copyFile() {
		
		File file1 = new File("/Users/goutambalasubramanian/Downloads/sample.txt");
		
		File file2 = new File("/Users/goutambalasubramanian/Downloads/sample-copy.txt");
		
		FileInputStream fin= null;
		try {
			fin = new FileInputStream(file1);
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		BufferedInputStream bin = new BufferedInputStream(fin);
		
		FileOutputStream fout = null;
		
		try {
			fout = new FileOutputStream(file2);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		int i=0;
		
		try {
			System.out.println(fin.available());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			while((i = bin.read())!=-1) {
				System.out.print((char) i);
				fout.write(i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				file2.delete();
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
