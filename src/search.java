
public class search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {23,43,56,78,345,67};
		
		int b =78;
		
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==b) {
				System.out.println("Position "+i);
			}
		}
		
		int[] c = {23,43,56,78,345,467};
		
		
	int d = 467;
	
	int e = c[c.length/2];
	
	System.out.println(e);
	
	int p=-1;
	
	if(d<e) {
		
		for(int i=0;i<c.length/2;i++) {
			if(c[i]==d) {
				p=i;
				
			}
		}
	}
	else {
		for(int i=c.length/2;i<c.length;i++) {
			if(c[i]==d) {
				p=i;
				
			}
		}
	}
	 
	System.out.println("Position "+p);

	}

}
