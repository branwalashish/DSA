public class MyArrayList {

	private int array[];
	private int c;
	private int increment = 0;

	public MyArrayList() {
		array = new int[10];
	}

	public MyArrayList(int initial_Cap) {
		this.array = new int[initial_Cap];
	}

	public MyArrayList(int initial_Cap, int increment) {
		this.array = new int[initial_Cap];
		this.increment = increment;
	}

	public int capacity() {
		return array.length;
	}

	public int size() {
		return c;
	}

	public void display() {
		for (int i = 0; i < c; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public void add(int data) {

		if (c == array.length) {
			int[] newArray;
			if (increment == 0) {
				newArray = new int[(int) (array.length * 1.6f)];
			} else {
				newArray = new int[array.length + increment];

			}
			for (int i = 0; i < array.length; i++) {
				newArray[i] = array[i];
			}

			array = newArray;

		}
		array[c++] = data;
	}

	public void addFront(int data) {
		if (c == array.length) {
			int[] newArray;
			if (increment == 0) {
				newArray = new int[array.length + (int) (array.length * 0.6f)];
			} else {
				newArray = new int[array.length + increment];
			}
			for (int i = 0; i <= array.length - 1; i++) {
				newArray[i] = array[i];

			}
			array = newArray;
		}
		for (int i = c; i >= 1; i--) {
			array[i] = array[i - 1];
		}
		array[0] = data;
		c++;
	}

	public void add(int index, int data) {
		if (c == array.length) {
			int[] newArray;
			if (increment == 0) {
				newArray = new int[array.length + (int) (array.length * 0.6f)];
			} else {
				newArray = new int[array.length + increment];
			}
			for (int i = 0; i <= array.length - 1; i++) {
				newArray[i] = array[i];
			}
			array = newArray;
		}
		if (index < 0 || index > c) {
			throw new ArrayIndexOutOfBoundsException("Invalid index: " + index);
		}
		for (int i = c; i >= index + 1; i--) {
			array[i] = array[i - 1];
		}
		array[index] = data;
		c++;
	}

	public void remove() {
		if (size() == 0) {
			throw new IndexOutOfBoundsException("List is Empty");
		} else {
			c--;
		}
	}

	public void clear() {
		c = 0;
	}

	@Override
	public String toString() {
		if (c == 0) {
			return "[]";
		}
		String res = "[";
		for (int i = 0; i <= c - 1; i++) {
			res = res + array[i] + ", ";
		}
		res = res.substring(0, res.length() - 2) + "]";
		return res;
	}

	public int remove(int idx) {
		if (idx < 0 || idx >= c) {
			throw new IndexOutOfBoundsException("Invalid index: " + idx);
		}

		int itemToRemove = array[idx];

		for (int i = idx; i < c - 1; i++) {
			array[i] = array[i + 1];
		}

		c--;
		if (increment == 0) {
			if (c > 0 && c < array.length / 2) {
				int newCap = (int) (array.length / 1.6f);
				if (newCap < 10) {
					newCap = 10;
				}
				int[] newArray = new int[newCap];
				for (int i = 0; i < c; i++) {
					newArray[i] = array[i];
				}
				array = newArray;
			}
		} else {
			if (c > 0 && c < array.length / 2) {
				int newCap = (int) (array.length - increment);

				int[] newArray = new int[newCap];
				for (int i = 0; i < c; i++) {
					newArray[i] = array[i];
				}
				array = newArray;
			}

		}
		return itemToRemove;
	}

	public void removeFirst() {
		if (size() == 0) {
			System.out.println("List is Empty");
		} else {
			for (int i = 0; i < c - 1; i++) {
				array[i] = array[i + 1];
			}
			c--;
		}
	}

}
