
public class Loop {
	private String value;
	private int index;
	private Loop next;

	Loop() {
		this.value = null;
		this.index = 0;
		this.next = null;
	}

	private Loop(int index) {
		super();
		this.value = null;
		this.index = index;
		this.next = null;
	}

	public void add(String value) {
		String v = this.value;

		Loop l = this.next;

		int i2 = 0;
		for (int i = 0; i <= i2; i++) {
			if (v == null) {
				v = value;
				return;
			}
			if (l == null) {
				next = new Loop(index + 1);
				v = next.value;
				i2 = index + 1;
			}
			if (l != null && l.next == null) {
				l.next = new Loop(l.index + 1);
				v = l.next.value;
				i2++;
			}
		}
	}
}
