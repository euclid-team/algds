public class MySearchTest {
	public static String mySearchTest(int size, long seed, int value, long maxNumOfComparisons, long maxNumOfReads, long maxNumOfAssignments, long maxNumOfChecks) {
		// TODO Auto-generated method stub
		boolean searching_correct = false;
		boolean complexity_ok = false;
		
		MyArray array = new MyArray(size, seed, true, 0, 100000);
		//MySort.mergeSort(array, 0,  size - 1);
		int index = MyClass.search(array, value);
	
		long numOfComparisons = array.getNumOfComparisons();
		long numOfReads = array.getNumOfReads();
		long numOfAssignments = array.getNumOfAssignments();
		long numOfChecks = array.getNumOfChecks();
		//long bound = (long) (3 * size * Math.log(size));
			
		complexity_ok = ((numOfComparisons <= maxNumOfComparisons)
				&& (numOfReads <= maxNumOfReads) && (numOfAssignments <= maxNumOfAssignments) && (numOfChecks <= maxNumOfChecks));
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
			if (numOfChecks > maxNumOfChecks) {
				complexityStr += " numOfChecks";
			}	

		}

		searching_correct = array.checkSearch(value, index);
		String searchingCorrectStr = null;
		if (searching_correct) {
			searchingCorrectStr = "OK";
		} else {
			searchingCorrectStr = "search result is not correct";
		}

		String result = "Searching: " + searchingCorrectStr + ", Complexity: " + complexityStr;
		
		return result;
	}

	public static void main(String[] args) {
		System.out.println(mySearchTest(100, 123, 28453, 7, 8, 0, 0));
		System.out.println(mySearchTest(100, 123, 59076, 7, 7, 0, 0));
		System.out.println(mySearchTest(1000, 123, 28453, 10, 9, 0, 0));
		System.out.println(mySearchTest(1000, 123, 59076, 10, 9, 0, 0));
	}
}
