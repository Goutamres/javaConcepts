package stringConcepts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class removeDuplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String b = "bananas";
		
		b.contains("[0-9]");
		
		char[] a = b.toCharArray();
		
		int index=0;
		
		for(int i=0;i<a.length;i++) {
			int j;
			for(j=0;j<=i;j++) {
				if(a[i]==a[j]) {
					break;
				}

			}
			if(i==j) {
				a[index++] = a[i];
			}
		}
		
		System.out.println(String.valueOf(Arrays.copyOf(a, index)));
		
		System.out.println(String.valueOf(Arrays.copyOf(a, a.length)));
		
		
	}

}
