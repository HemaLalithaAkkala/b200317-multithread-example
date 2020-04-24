package example4;

public class SleepMethodDemo {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {

			System.out.print(i + " ");
			if (i % 10 == 0) {
				System.out.println();
			}

			if (i == 50) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}

	}

}
