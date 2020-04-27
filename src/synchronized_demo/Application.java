package synchronized_demo;

public class Application {

	public static void main(String[] args) throws InterruptedException {

		Inventory inventory = new Inventory();

		InventorySupplier inventorySupplier = new InventorySupplier(inventory);

		InventoryDispatcher inventoryDispatcher = new InventoryDispatcher(inventory);

		inventorySupplier.start();
		inventoryDispatcher.start();

		inventorySupplier.join();
		inventoryDispatcher.join();

		System.out.println(inventory.getItems());

	}

}
