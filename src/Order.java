
public class Order {
	private Item item;
	private int qty;

	Order(Item item, int qty) {
		super();
		this.item = item;
		this.qty = qty;
	}

	Item getItem() {
		return item;
	}

	int getQty() {
		return qty;
	}

	public int setTotal() {
		return item.getPrice();
	}
}
