package javaConcepts.classObjectsConstructor;

public class constructorConceptMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructorConcept Raju = new constructorConcept();
		Raju.talk();
		constructorConcept Sita = new constructorConcept();
		Sita.talk();
		//Sita.name= "Sita";
		Sita.age= 45;
		Sita.talk();
		
		parameterizedConstructor ram = new parameterizedConstructor("variable",99);
		ram.talk();
		parameterizedConstructor sitaaa = new parameterizedConstructor();
		sitaaa.talk();
		
		
		
		constructorOverloading overload = new constructorOverloading();
		
		overload.talk();
		
		constructorOverloading overload1 = new constructorOverloading(4);
		
		overload1.talk();
		
		constructorOverloading overload2 = new constructorOverloading("change");
		
		overload2.talk();
		

	}

}
