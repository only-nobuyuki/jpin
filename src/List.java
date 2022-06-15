
public class List {

	private String value;
	private int index;
	private List next;

	// フィールドを初期化する
	public List() {
		this.value = null;
		this.index = 0;
		this.next = null;
	}

	// indexに引数を渡してる。
	private List(int index) {
		this();
		this.index = index;
	}

	// valueを追加する
	public void add(String value) {
		// フィールドのvalueがnullなら受け取った引数のvalueを代入して返す
		if (this.value == null) {
			this.value = value;
			return;
		}
		// フィールドのnextがnullならフィールドのindexに+1したListインスタンスを生成してnextに代入して返す
		if (this.next == null) {
			this.next = new List(index + 1);
		}
		// valueもnextも初期値でない場合valueを引数にしてListのaddを実行
		this.next.add(value);
	}

	// indexを取得する
	public String get(int index) {
		// フィールドのindexが受け取ったindexと同じならvalueを返す。
		if (this.index == index) {
			return this.value;
		}
		// フィールドのnextがnullならnullを返す。
		if (this.next == null) {
			return null;
		}
		// フィールドがnullかつnextがnullじゃない場合indexを引数としてgetメソッドを呼ぶ
		return this.next.get(index);
	}

	// Listの要素数を返す。
	public int size() {
		 // フィールドのnextがnullならindex+1を返す。
		if (this.next == null) {
			return this.index + 1;
		}
		// フィールドのnextがnullでないならListサイズメソッドを実行して返す。
		return this.next.size();
	}
}
