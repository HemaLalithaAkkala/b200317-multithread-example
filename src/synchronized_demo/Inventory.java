package synchronized_demo;

public class Inventory {

	private Integer items = 0;

	public Integer getItems() {
		return items;
	}

	public synchronized void increment() {
		items++;
	}

	public synchronized void decrement() {
		items--;
	}

}
