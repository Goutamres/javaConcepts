package collectionFramework;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class linkedListRetrivingData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> lt = new LinkedList<Integer>();
		
		lt.add(100);
		lt.add(200);
		lt.add(300);
		//lt.removeFirstOccurrence(100);
		
		System.out.println(lt);
		
		Enumeration<Integer> en = Collections.enumeration(lt);
		
		while(en.hasMoreElements()) {
			
			System.out.println(en.nextElement());
		}
		
		Iterator<Integer> it = lt.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		
		
		ListIterator<Integer> Lt = lt.listIterator();
		
		while(Lt.hasNext()) {
			
			System.out.println(Lt.next());
			
		}
		//FIFO
		((LinkedList<Integer>) lt).pop();
		
		System.out.println(lt);
			
		
		
		

	}

}
