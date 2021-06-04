package polimorphism;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//complile time polymorphism
		
		firstClass f = new firstClass();
		
//		f.add();
		
//		System.out.println(f.add(3, 4));
		
//		f.add(1, 2, 3);
		
		
		
		
		
		//runtime Polymorphism
		
		secondClass s = new secondClass();
		
		firstClass w = new firstClass();
		
//		System.out.println(f.area(3, 4));
		
//		System.out.println(	s.area(2, 3));
		
//		w.diff2();
		
		
		runtime sm = new firstClass();
		
		
//		sm.area1();
//		sm.tri();
		
		runtime sm1 = new secondClass();
		
//		sm1.area1();
//		sm1.tri();
		
		

	}

}
