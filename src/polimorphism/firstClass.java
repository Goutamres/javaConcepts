package polimorphism;

public class firstClass extends secondClass implements runtime{
	
	
	firstClass() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Conssss1");
	}
	
	
	public void add() {
		
		System.out.println(23);
	}
	
	public int add(int a,int b) {
		
		return a+b;
		
	}
	
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	
	public double area(int l,int b) {
		return l*b;
	}
	
	public void diff() {
		System.out.println("different1....");
	}

	@Override
	public void area1() {
		// TODO Auto-generated method stub
		
		System.out.println("hi ");
		
	}

	@Override
	public int tri() {
		// TODO Auto-generated method stub
		System.out.println("How r u?");
		
		return 0;
	}

}
