public class InsertMaxHeap {
    static void heapify(int arr[], int n, int i)
    {
        int parent = (i - 1) / 2;

        if (arr[parent] > 0) {
            // For Max-Heap
            // If current node is greater than its parent
            // Swap both of them and call heapify again
            // for the parent
            if (arr[i] > arr[parent]) {

                // swap arr[i] and arr[parent]
                int temp = arr[i];
                arr[i] = arr[parent];
                arr[parent] = temp;

                // Recursively heapify the parent node
                heapify(arr, n, parent);
            }
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
        heapify(arr, n, n- 1);

        // return new size of Heap
        return n;
    }
    void printArray(int arr[], int N)
    {
        for (int i=0; i<N; ++i)
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

        N=insertNode(arr, N, 30);
        N=insertNode(arr, N, 35);

        System.out.println("New Max Heap");
        ob.printArray(arr, N);
    }

}
