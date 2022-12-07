public class ComplexityOlogN {

    static void comp_Ologn(int arr[]){
        //an O(logn) complexity
        for (int i = 1; i < arr.length; i = i * 2){
            System.out.println("Hey - I'm busy looking at:"+i);
        }
    }

    //binary search have O(logn) complexity
    static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static void main(String args[])
    {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        comp_Ologn(arr);
        int length=arr.length;
        binarySearch(arr, 0, length, 18);
    }
}
