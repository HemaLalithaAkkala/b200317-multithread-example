package synchronized_demo;

public class InventorySupplier extends Thread {

	private Inventory inventory;

	public InventorySupplier(Inventory inventory) {
		this.inventory = inventory;
	}
	
	public void run() {
		supplies();
	}

	public void supplies() {
		for (int i = 1; i <= 1000; i++) {
			inventory.increment();
		}
	}

}
