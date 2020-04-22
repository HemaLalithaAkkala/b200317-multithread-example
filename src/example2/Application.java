package example2;

public class Application {
	
	public static void main(String[] args) {
		
		FileCopy copy1 = new FileCopy("E:/iodemo/demo.txt", "E:/iodemo/democopy1.txt");
		FileCopy copy2 = new FileCopy("E:/iodemo/demo.txt", "E:/iodemo/democopy2.txt");
		
		Thread thread1 = new Thread(copy1);
		Thread thread2 = new Thread(copy2);
		
		thread1.start();
		thread2.start();
		
		// no 
		thread1.run();
		
	}

}
