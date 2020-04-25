package example6;

public class NamePrinting implements Runnable {

	private String name;
	private Thread thread;

	public NamePrinting(String name) {
		this.name = name;
	}

	public NamePrinting(String name, Thread thread) {
		this(name);
		this.thread = thread;
	}

	public void run() {

		if (Thread.currentThread().getName().equals("T2")) {
			Thread.yield();
		}
		print();
	}

	public void print() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(name + " " + Thread.currentThread().getName());
		}
	}

}
