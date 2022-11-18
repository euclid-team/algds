public class InsertionsSort {
    void insertionSort(int array[]) {
        int size = array.length;

        for (int step = 1; step < size; step++) {
            int key = array[step];
            int j = step - 1;
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
    }

    // Driver code
    public static void main(String args[]) {
        int[] data = { 9, 5, 1, 4, 3 };
        InsertionsSort is = new InsertionsSort();
        is.insertionSort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        int n = data.length;
        for (int i = 0; i < n; i++)
            System.out.print(data[i] + " ");
    }
}
