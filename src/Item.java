
public class Item {
	private String name;
	private int price;

	Item(String name) {
		super();
		this.name = name;
	}

	Item(int price,String name) {
		super();
		this.name = name;
		this.price = price;
	}

	Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	String getName() {
		return name;
	}

	int getPrice() {
		return price;
	}
}
