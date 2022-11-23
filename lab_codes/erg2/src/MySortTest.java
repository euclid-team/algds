public class MySortTest {

	public static String mySortTest(int size, long maxNumOfComparisons, long maxNumOfReads, long maxNumOfAssignments, long seed) {
		boolean sorting_correct = false;
		boolean complexity_ok = false;
		
		MyArray array = new MyArray(size, seed);
		MyClass.sort(array);
		//MySort.mergeSort(array, 0,  size - 1);
		
		sorting_correct = array.inIncreasingOrder();
		String sortingCorrectStr = null;
		if (sorting_correct) {
			sortingCorrectStr = "OK";
		} else {
			sortingCorrectStr = "sorting is not correct";
		}

		long numOfComparisons = array.getNumOfComparisons();
		long numOfReads = array.getNumOfReads();
		long numOfAssignments = array.getNumOfAssignments();
		//long bound = (long) (3 * size * Math.log(size));

		complexity_ok = ((numOfComparisons <= maxNumOfComparisons)
				&& (numOfReads <= maxNumOfReads)
				&& (numOfAssignments <= maxNumOfAssignments));

		String complexityStr = null;
		if (complexity_ok) {
			complexityStr = "OK";
		} else {
			complexityStr = "bounds exceeded:";
			if (numOfComparisons > maxNumOfComparisons) {
				complexityStr += " numOfComparisons";
			}
			if (numOfReads > maxNumOfReads) {
				complexityStr += " numOfReads";
			}
			if (numOfAssignments > maxNumOfAssignments) {
				complexityStr += " numOfAssignments";
			}
		}
		
		String result = "Sorting: " + sortingCorrectStr + ", Complexity: " + complexityStr;
		
		return result;
	}

	public static void main(String[] args) {
		System.out.println(mySortTest(20, 90, 0, 0, 123));
	}
}
