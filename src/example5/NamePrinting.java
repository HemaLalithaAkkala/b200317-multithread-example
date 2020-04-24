package example5;

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

		if (thread != null) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		print();
	}

	public void print() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(name + " " + Thread.currentThread().getName());
		}
	}

}
