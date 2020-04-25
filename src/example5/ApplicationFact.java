package example5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApplicationFact {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(30, 50, 10, 5, 5000000, 100000, 250000, 2000, 3500, 780, 300);

		List<Thread> threadList = new ArrayList<Thread>();

		for (int num : nums) {
			Factorial factorial = new Factorial(num);
			threadList.add(factorial);
		}

		for (Thread thread : threadList) {
			thread.start();
		}

		for (Thread thread : threadList) {
			try {
				thread.join(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		for (Thread thread : threadList) {
			Factorial fact = (Factorial) thread;
			System.out.println(fact.getNum() + "   " + fact.getResult());
		}

	}

}
