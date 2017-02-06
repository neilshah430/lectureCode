public class Sort {
<<<<<<< HEAD
	/** Returns input strings in sorted order.
	 * Non-destructive. */
	public static void sort(String[] inputs) {
		sort(inputs, 0);
	}

	/** Sorts inputs starting at index k. */
	private static void sort(String[] inputs, int k) {
		if (k == inputs.length) {
			return;
		}

		int smallest = findSmallest(inputs, k);
		swap(inputs, k, smallest);
		sort(inputs, k + 1);
	}

	public static void swap(String[] inputs, int a, int b) {
		String oldA = inputs[a];
		inputs[a] = inputs[b];
		inputs[b] = oldA;
	}

	/** Returns the smallest item starting at index k. */
	public static int findSmallest(String[] inputs, int k) {
		int i = k;
		String smallest = inputs[k];
		int smallestLocation = k;
		while (i < inputs.length) {
			int cmp = inputs[i].compareTo(smallest);

			if (cmp < 0) {
				smallest = inputs[i];
				smallestLocation = i;
			}
			i = i + 1;
		}
		return smallestLocation;
	}

	/** Prints out all strings in inputs. */
	public static void print(String[] inputs) {
=======
	/** Sorts strings destructively. */
	public static void sort(String[] x) {
		sort(x, 0);
	}

	/** Sorts x starting at position k. */
	public static void sort(String[] x, int k) {
		// find the smallest item
		// swap it into the front position
		// sort the rest (recursion??)
		if (k == x.length) {
			return;
		}
		int smallest = findSmallest(x, k);
		swap(x, k, smallest);
		sort(x, k + 1);
	}


		/** Swaps x[a] and x[b] */
	public static void swap(String[] x, int a, int b) {
		String temp = x[a];
		x[a] = x[b];
		x[b] = temp;
	}

	/** Return the position of the smallest String starting at k. */
	public static int findSmallest(String[] x, int k) {
		int smallestIndex = k;
		int i = k;
		while (i < x.length) {
			int cmp = x[i].compareTo(x[smallestIndex]);

			if (cmp < 0) {
				smallestIndex = i;
			}
			i = i + 1;
		}
		return smallestIndex;
	}


	/** Prints out all strings in x. */
	public static void print(String[] x) {
>>>>>>> 5070ca8da2cd47b168ebbef8574047df39385c26
	}

	/** Outputs the command line arguments
	 * in alphabetical order. */
	public static void main(String[] args) {
	}
}