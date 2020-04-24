

public class Application {

	public static void main(String[] args) {

		/*
		 * NamePrinting namePrinting1 = new NamePrinting("Ashok"); NamePrinting
		 * namePrinting2 = new NamePrinting("Madhu");
		 * 
		 * // sequential(synchronous) execution - Single Threaded Execution
		 * namePrinting1.print(); namePrinting2.print();
		 * 
		 * //asynchronous - Multi Thread execution Thread thread1 = new
		 * Thread(namePrinting1); Thread thread2 = new Thread(namePrinting2);
		 * 
		 * thread1.start(); thread2.start();
		 */

		
		NamePrinting namePrinting = new NamePrinting("Ashok");
				
		// name,group
		Thread thread1 = new Thread(namePrinting);
		Thread thread2 = new Thread(namePrinting);
		
		thread1.setName("First Thread");
		thread2.setName("Second Thread");
		
		
		thread1.setPriority(Thread.MIN_PRIORITY);
		System.out.println(thread1);
		
//		thread1.start();
//		thread2.start();
		
	}

}
