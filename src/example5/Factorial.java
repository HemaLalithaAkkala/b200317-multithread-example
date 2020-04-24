package example5;

import java.math.BigInteger;

public class Factorial extends Thread {

	private BigInteger result;
	private int num;

	public int getNum() {
		return num;
	}

	public Factorial(int num) {
		this.num = num;
	}

	public BigInteger getResult() {
		return result;
	}

	public void run() {
		getFactorial();
	}

	public void getFactorial() {
		BigInteger fact = BigInteger.ONE;
		int temp = num;
		while (temp > 0) {
			fact = fact.multiply(BigInteger.valueOf(temp));
			temp--;
		}
		result = fact;
	}

}
