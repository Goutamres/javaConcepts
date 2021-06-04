package collectionFramework;

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> v = new Vector<Integer>();
		int[] x = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < x.length; i++) {
			v.add(x[i]);
		}
		System.out.println(v);

		int[] xx = new int[v.size()];

		for (int i = 0; i < v.size(); i++) {

			xx[i] = v.get(i);
		}

		for (int i = 0; i < xx.length; i++) {

			System.out.print(xx[i] + " ");
		}

		ListIterator<Integer> it = v.listIterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}

		while (it.hasPrevious()) {

			System.out.println(it.previous());
		}

	}

}
