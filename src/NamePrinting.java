
public class NamePrinting implements Runnable{
	
	
	private String name;
	private int i =0;
	public NamePrinting(String name) {
		this.name  = name;
		i=0;
	}
	
	
	public void run() {
		print();
	}
	
	public void print() {
		for(; i< 10000; i++) {
			System.out.println(name+" "+ Thread.currentThread().getName());
		}
	}

}
