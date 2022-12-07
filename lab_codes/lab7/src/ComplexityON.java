public class ComplexityON {

    static void comp_On(int arr[]){
        int max=0, i;
        //an O(n) complexity
        for (i = 1; i < arr.length; i++){
            System.out.println("Position: " + i);
        }
        //another O(n) algorithm
        for (i = 1; i < arr.length; i++){
            if (arr[i]> max) max=arr[i];
        }
        System.out.println("Max:" + max);
    }

    public static void main(String args[])
    {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        comp_On(arr);
    }
}
