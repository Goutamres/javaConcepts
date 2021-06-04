package fileHandling;

import java.io.File;
import java.util.Arrays;

public class ListFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("/Users/goutambalasubramanian/Downloads");
		
		File Down[] = file.listFiles();
		
		Arrays.sort(Down);
		
		for(File i : Down) {
			if(i.isFile()) {
				System.out.println("File :"+ i.getName()+" "+ i.getTotalSpace());
			}
			else if(i.isDirectory()) {
				System.out.println("Directory:"+ i.getName()+" "+i.getTotalSpace());
			}
			else if(i.isHidden()) {
				System.out.println("Hidden: "+ i.getName());
			}
			else {
				System.out.println("Other files "+i.getName()+" "+i.getTotalSpace());
			}
		}

	}

}
