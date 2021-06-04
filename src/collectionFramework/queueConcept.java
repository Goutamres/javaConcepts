package collectionFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class queueConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 0; i < 5; i++) {

			q.offer(i);
		}
		for (int i = 5; i < 10; i++) {

			q.add(i);
		}

		System.out.println(q);

		Iterator<Integer> it = q.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}

		while (!q.isEmpty()) {

			System.out.println(q.poll());
		}

		

	}

}
