package interviewJavaPrograms;

public class largeNumberFormInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,23,12,5,9,8,0};
		
		String s1 ="",s2="";
		int temp;
		
		int c=0;
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				c++;
				s1 = String.valueOf(a[i])+String.valueOf(a[j]);
				s2 = String.valueOf(a[j])+String.valueOf(a[i]);
				System.out.println("s1 "+s1+" s2 "+s2);
				System.out.println(c);
				if(Integer.parseInt(s1)<Integer.parseInt(s2)) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		
		for(int i:a) {
			System.out.print(i);
		}

	}

}
