public class ComplexityO1 {

    static void comp_O1(int arr[]){
        //an O(1) complexity
        int n = 7;
        System.out.println("The input is: " + n);
        //also O(1) complexity
        System.out.println("The input is: " + arr[3]);
    }


    public static void main(String args[])
    {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        comp_O1(arr);
    }
}
