package programs;

public class samePositionCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x1=2,v1=1,x2=1,v2=2;
		
		System.out.println("answer"+(x1-x2)%(v2-v1));
		
		if(v1>v2&&((x1-x2)%(v2-v1)==0)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

	}

}
