public class MyClass {
    public static int search(MyArray array, int value) {

        // array.comp(i,  j): compares two items of the array
        // array.compToValue(i, value): compares an item of the array with a given value.
        // returns:
        // 1, if array[i] > array[j]
        // 0, if array[i] == array[j]
        // -1, if array[i] < array[j]

        // array.getNumberOfComparisons();

        // array.get(i);
        // returns the contents of position i
        //
        // The number of get operations:
        // array.getNumberOfReads();

        int length = array.length;

        // complete the code

        return -1; // -1 means that the value has not been found

    }

    public static void sort(MyArray array) {

        // array.comp(i, j):
        // 1, if array[i] > array[j]
        // 0, if array[i] == array[j]
        // -1, if array[i] < array[j]

        // array.isInIncreasingOrder();
        // array.getNumberOfComparisons();
        // array.getNumberOfSwaps();

        // Complete the sort function

        int length = array.length;
    }

    public static void main(String args[])
    {
        System.out.println(MySortTest.mySortTest(20, 230, 0, 0, 123));
        System.out.println(MySearchTest.mySearchTest(100, 123, 28453, 7, 0, 0, 0));
        //alternative you can create manual a MyArray object and run your test
        MyArray array = new MyArray(100, 150);

        boolean sorting_correct = array.inIncreasingOrder();
        boolean searching_correct=array.checkSearch(1, 15);
        long numOfComparisons = array.getNumOfComparisons();
        long numOfReads = array.getNumOfReads();
        long numOfAssignments = array.getNumOfAssignments();

    }


}