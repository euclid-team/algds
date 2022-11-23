public class InsertMaxHeap {
    static void heapify(int arr[], int N, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < N && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < N && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, N, largest);
        }
    }

    static int insertNode(int[] arr, int n, int Key)
    {
        // Increase the size of Heap by 1
        n = n + 1;

        // Insert the element at end of Heap
        arr[n - 1] = Key;

        // Heapify the new node following a
        // Bottom-up approach
        heapify(arr, n, n - 1);

        // return new size of Heap
        return n;
    }
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[])
    {
        InsertMaxHeap ob = new InsertMaxHeap();
        int[] arr = new int[100];
        int N = 6;
        arr[0]= 90;
        arr[1]= 34;
        arr[2]=64;
        arr[3]=12;
        arr[4]=22;
        arr[5]=11;
        arr[6]=25;

        insertNode(arr, N, 30);
        System.out.println("New Max Heap");
        ob.printArray(arr);
    }

}
