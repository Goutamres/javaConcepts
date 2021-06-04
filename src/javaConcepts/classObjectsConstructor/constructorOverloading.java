package javaConcepts.classObjectsConstructor;

public class constructorOverloading {
	
	String name1;
	
	
	constructorOverloading(){
		
		name1 ="Default";
	}
	constructorOverloading(String s){
		
		name1 = s;
	}
	
	
	constructorOverloading(int s){
		
		name1 = "int constructor";
	}
	
	void talk() {
		
		System.out.println("Name of the constructor : "+name1);
	}
	
	

}
