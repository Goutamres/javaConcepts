package Threading;

import java.util.concurrent.atomic.AtomicInteger;

class counter{
	AtomicInteger count = new AtomicInteger();   // Thread safety
	
	public void increment() {
		count.getAndIncrement();
	}
}

public class Synchronized {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		
		counter c = new counter();
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<1000;i++) {
					c.increment();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<1000;i++) {
					c.increment();
				}
			}
		});
		
		t1.start();
		
		
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println("Count "+ c.count);
		

	}

}
