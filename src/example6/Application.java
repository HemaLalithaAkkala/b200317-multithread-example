package example6;

public class Application {

	public static void main(String[] args) {
		NamePrinting namePrinting1 = new NamePrinting("Ebinezer");
		NamePrinting namePrinting2 = new NamePrinting("Rakesh");
		NamePrinting namePrinting3 = new NamePrinting("Sandhya");
		NamePrinting namePrinting4 = new NamePrinting("Krishna");

		Thread t1 = new Thread(namePrinting1);
		Thread t2 = new Thread(namePrinting2);
		Thread t3 = new Thread(namePrinting3);
		Thread t4 = new Thread(namePrinting4);

		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.setName("T2");

		t3.setPriority(Thread.MAX_PRIORITY);
		t3.setName("T3");
		t4.setPriority(Thread.NORM_PRIORITY);

		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
