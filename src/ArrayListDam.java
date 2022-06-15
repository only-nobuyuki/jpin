
public class ArrayListDam {
	private String value;
	private int index;
	private ArrayListDam next;

	ArrayListDam(String value) {
		this.value = value;
		this.index = 0;
		this.next = null;
	}

	private ArrayListDam(int index) {
		super();
		this.value = null;
		this.index = index;
		this.next = null;
	}

	public void add(String value) {
		if (this.value == null) {
			this.value = value;
			return;
		}
		if (this.next == null) {
			this.next = new ArrayListDam(index + 1);
		}
		this.next.add(value);
	}

	public int size() {
		if (this.next == null) {
			return this.index;
		} else {
			return this.next.size();
		}
	}

	public String getValue(int index) {
		if (this.index == index) {
			return this.value;
		}
		if (this.next != null) {
			return this.next.getValue(index);
		} else {
			return null;
		}
	}
}
