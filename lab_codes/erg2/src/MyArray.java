import java.util.Random;
import java.util.Arrays;

public class MyArray {
	public final int length;

	private int[] A;
	private long numOfComparisons;
	private long numOfSwaps;
	private long numOfCopies;
	private long numOfReads;
	private long numOfAssignments;
	private long numOfChecks;
	long seed;

	public MyArray(int size, long seed) {
		this(size, seed, false, 0, 100000);
	}

	public MyArray(int size, long seed, boolean sorted, int low, int high) {
		length = size;
		numOfComparisons = 0;
		numOfSwaps = 0;
		numOfCopies = 0;
		numOfReads = 0;
		numOfAssignments = 0;
		numOfChecks = 0;

		this.seed = seed;

		Random random = new Random(seed);
		A = random.ints(size, low, high).toArray();

		if (sorted) {
			Arrays.sort(A);
		}
		// A = new int[size];
	}

	private boolean checkIndex(int pos) {
		return (pos >= 0 && pos < length);
	}

	public int compToValue(int pos, int value) {
		numOfComparisons++;
		int result = 0;
		if (checkIndex(pos)) {
			if (A[pos] > value) {
				result = 1;
			} else if (A[pos] < value) {
				result = -1;
			} else {
				result = 0;
			}
		} else {
			result = -2; // invalid index error
		}
		return result;
	}

	public int comp(int pos1, int pos2) {
		numOfComparisons++;
		int result = 0;
		if (checkIndex(pos1) && checkIndex(pos2)) {
			if (A[pos1] > A[pos2]) {
				result = 1;
			} else if (A[pos1] < A[pos2]) {
				result = -1;
			} else {
				result = 0;
			}
		} else {
			result = -2; // invalid index error
		}
		return result;
	}

	public void swap(int pos1, int pos2) {
		numOfSwaps++;
		if (checkIndex(pos1) && checkIndex(pos2)) {
			int temp = A[pos1];
			A[pos1] = A[pos2];
			A[pos2] = temp;
		}
	}

	public void copyTo(int pos1, int pos2) {
		numOfCopies++;
		if (checkIndex(pos1) && checkIndex(pos2)) {
			A[pos2] = A[pos1];
		}
	}

	public int get(int pos) {
		numOfReads++;
		if (checkIndex(pos)) {
			return A[pos];
		} else {
			return -1;
		}
	}

	public void set(int pos, int value) {
		numOfAssignments++;
		if (checkIndex(pos)) {
			A[pos] = value;
		}
	}

	public boolean inIncreasingOrder() {
		numOfChecks++;
		boolean result = true;
		for (int i = 0; i < length - 1; i++) {
			if (A[i] > A[i + 1]) {
				result = false;
				break;
			}
		}
		return result;
	}

	public boolean inDecreasingOrder() {
		numOfChecks++;
		boolean result = true;
		for (int i = 0; i < length - 1; i++) {
			if (A[i] < A[i + 1]) {
				result = false;
				break;
			}
		}
		return result;
	}

	public boolean isPartitioned(int low, int high, int pivot) {
		boolean result = true;
		for (int i = low; i < pivot; i++) {
			if (A[i] > A[pivot]) {
				result = false;
				break;
			}
		}
		for (int i = pivot + 1; i <= high; i++) {
			if (A[i] < A[pivot]) {
				result = false;
				break;
			}
		}
		return result;
	}

	public boolean checkSearch(int value, int index) {
		numOfChecks++;
		boolean isCorrect = false;

		if (index >= 0) {
			if (A[index] == value) {
				isCorrect = true;
			} else {
				isCorrect = false;
			}
		} else {
			int correctIndex = Arrays.binarySearch(A, value);
			if (correctIndex < 0 || A[correctIndex] != value) {
				isCorrect = true;
			} else {
				isCorrect = false;
			}
		}
		return isCorrect;
	}

	public long getNumOfComparisons() {
		return numOfComparisons;
	}

	public long getNumOfSwaps() {
		return numOfSwaps;
	}

	public long getNumOfCopies() {
		return numOfCopies;
	}

	public long getNumOfReads() {
		return numOfReads;
	}

	public long getNumOfAssignments() {
		return numOfAssignments;
	}

	public long getNumOfChecks() {
		return numOfChecks;
	}

}
