package programs;

public class AppleOrangeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s=7,t=11;
		int a=5,b=15;
		int m=3,n=2;
		
		int ab[] = {-2,2,1};
		int ba[] = {5,-6};
		
		int count1=0,count2=0;
		
		for(int i : ab) {
			i+=a;
			if(i>=7&&i<=11) {
				count1++;
			}
		}
		
		for(int i : ba) {
			i+=b;
			if(i>=7&&i<=11) {
				count2++;
			}
		}
		
		System.out.println(count1);
		System.out.println(count2);

	}

}
