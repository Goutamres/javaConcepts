package immutableMutableObjectsExample;

public class immutableObjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		immutableObjects m = new immutableObjects("Goutam");

		System.out.println(m.getName());

		m.setName("Raju");
		System.out.println(m.getName());
	}

}
