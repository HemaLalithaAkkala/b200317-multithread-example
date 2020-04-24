package example5;

public class Application {

	
	public static void main(String[] args) {
		
		Thread ashokThread = new Thread(new NamePrinting("Ashok"));
		Thread madhuThread = new Thread(new NamePrinting("Madhu"));
		Thread manojThread = new Thread(new NamePrinting("Manoj", madhuThread));
		Thread geethaThread = new Thread(new NamePrinting("Geetha"));
		
		
		ashokThread.start();
		madhuThread.start();
		manojThread.start();
		geethaThread.start();
	}
	
}
