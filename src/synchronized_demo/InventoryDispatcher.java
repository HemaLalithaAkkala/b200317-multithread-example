package synchronized_demo;

public class InventoryDispatcher extends Thread {

	private Inventory inventory;

	public InventoryDispatcher(Inventory inventory) {
		this.inventory = inventory;
	}

	public void run() {
		dispatches();
	}

	public void dispatches() {
		for (int i = 1; i <= 1000; i++) {
			inventory.decrement();
		}
	}

}
