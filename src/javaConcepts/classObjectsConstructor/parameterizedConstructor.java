package javaConcepts.classObjectsConstructor;

public class parameterizedConstructor {
	
	String name;
	int age;
	
	parameterizedConstructor()
	{
		name = "Goutam";
		age= 34;
	}
	parameterizedConstructor(String s, int i){
		
		
		name =s;
		age =i;
		
	}
	void talk() {
		
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);		
	}

}
