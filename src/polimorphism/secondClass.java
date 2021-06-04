package polimorphism;

public class secondClass implements runtime{
	
	
	public secondClass() {
		// TODO Auto-generated constructor stub
		System.out.println("Conssss2");
	}
	
	
	public double area(int b,int h) {
		
		return 0.5*b*h;
	}


	@Override
	public int tri() {
		// TODO Auto-generated method stub
		
		System.out.println("Shoutout");
		
		
		return 0;
	}


	@Override
	public void area1() {
		// TODO Auto-generated method stub
		System.out.println("Welcome back....");
		
	}
	
	public void diff2() {
		System.out.println("different2....");
	}
	

}
