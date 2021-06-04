package collectionFramework;

public class MergeTwoArrayToOneArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5};
		
		int b[] = {6,7,8,9,10,11};
		
		int c[] = new int[a.length+b.length];
		
		
		for(int i=0;i<c.length;i++) {
			if(i<a.length) {
			c[i]= a[i];
			}
			else {
				c[i]= b[i-a.length];
			}
			System.out.println(c[i]);
		}

	}

}
