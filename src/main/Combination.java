package main;

public class Combination implements ICombinatorial {

	private final int items;
	private final int[] indexes;

	public Combination(int subItems, int items) {
		this.indexes = new int[subItems];
		this.items = items;
	}

	public long combinations() {
		return 0L;
	}

	public int size() {
		return 0;
	}

	public void clear() {
	}

	public int[] next(int[] items) {
		return null;
	}

	public boolean hasNext() {
		return false;
	}

}
