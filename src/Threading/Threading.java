package Threading;
public class Threading {

	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(0);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hi"+Thread.currentThread().getPriority());
				try {
					Thread.sleep(0);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		t1.setName("Gtm");

		t2.setName("B");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		t1.start();
		t2.start();

		

		t1.join();
		t2.join();
		System.out.println(t1.isAlive());

		System.out.println("Bye");
	}

}
