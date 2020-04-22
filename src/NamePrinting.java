public class NamePrinting implements Runnable{
	
	
	private String name;
	
	public NamePrinting(String name) {
		this.name  = name;
	}
	
	
	public void run() {
		print();
	}
	
	public void print() {
		for(int i =0; i< 100; i++) {
			System.out.println(name);
		}
	}

}
