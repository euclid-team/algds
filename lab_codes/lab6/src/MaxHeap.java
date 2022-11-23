public class MaxHeap {
    private static boolean isMaxHeap(int[] arr) {
        for (int i = arr.length-1; i > 0; --i)
        {
            int parent = (i-1)/2;
            if (arr[i] > arr[parent]) return false;
        }
        return true;
    }

    public static void main(String... args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println(isMaxHeap(arr));
    }
}
