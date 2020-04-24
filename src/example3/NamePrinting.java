package example3;

// Thread implements Runnable
/*
 *  run(){
 *  }
 * 
 * */
public class NamePrinting extends Thread{
	
	
	private String name;
	
	public NamePrinting(String name) {
		this.name  = name;
	}
	
	@Override
	public void run() {
		print();
	}
	
	public void print() {
		for(int i =0; i< 100000; i++) {
			System.out.println(name);
		}
	}

}
