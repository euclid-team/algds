public class ShakerSort {
    public static void shakersort(int[] a) {
        int start = -1;
        int end = a.length - 2;
        boolean swapped;
        do {
            swapped = false;
            for (int i = ++start; i <= end; i++) {
                if (a[i] > a[i + 1]) {
                    swap(a, i, i + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            swapped = false;
            for (int i = --end; i >= start; i--) {
                if (a[i] > a[i + 1]) {
                    swap(a, i, i + 1);
                    swapped = true;
                }
            }
        } while (swapped);
    }

    private static void swap(int [] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void main(String[] args)
    {
        ShakerSort ob = new ShakerSort();
        int a[] = { 5, 1, 4, 2, 8, 0, 2 };
        ob.shakersort(a);
        System.out.println("Sorted array");
        int n = a.length;
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}
