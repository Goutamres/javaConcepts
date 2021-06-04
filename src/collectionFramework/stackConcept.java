package collectionFramework;

import java.util.Stack;

public class stackConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// elementAt

		Stack<Integer> st = new Stack<Integer>();
		st.add(100);
		st.add(45);
		st.add(125);
		System.out.println(st);

		System.out.println(st.elementAt(3 - 1));

		// st.clear();

		// empty check
		boolean a = st.isEmpty();
		System.out.println(a);

		// insertElement

		st.insertElementAt(100, 2);
		System.out.println(st);

		// peekValue

		System.out.println(st.peek());

		// string

		Stack<String> st1 = new Stack<String>();

		st1.add("hi");
		st1.add("How");
		st1.add("are");
		st1.add("you?");

		// stack pop and push
		//LIFO

		st.pop();
		st1.pop();
		System.out.println(st);
		System.out.println(st1);

		st.push(125);
		st1.push("you");

		System.out.println(st);
		System.out.println(st1);

		st.push(121);
		st1.push("?");

		System.out.println(st);
		System.out.println(st1);

		// search

		System.out.println(st.search(100));

		System.out.println(st1.search("?"));

	}

}
