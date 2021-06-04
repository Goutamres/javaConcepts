package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> a = new ArrayList<String>();

		a.add("Apple");
		a.add("Mango");
		a.add("Banana");
		a.add("Apple");
		a.add("Guava");
		a.add("Grapes");

		System.out.println(a);

		a.remove(1);
		a.add("Mango");

		System.out.println(a);
		Iterator<String> i = a.iterator();
		while (i.hasNext()) {

			System.out.println(i.next());
		}

		String[] ar = new String[a.size()];

		for (int it = 0; it < a.size(); it++) {

			ar[it] = a.get(it);
		}

		for (int it = 0; it < a.size(); it++) {

			System.out.println(ar[it]);
		}
		ArrayList<String> n = new ArrayList<String>();
		for(int in=0;in<ar.length;in++) {
			
			n.add(ar[in]);
		}
		System.out.println(n);

	}

}
