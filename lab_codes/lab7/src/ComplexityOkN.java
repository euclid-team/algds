public class ComplexityOkN {
    static void comp_Okn(int arr[]){
        //O(k^n) complexity
        for (int i = 1; i <= Math.pow(2, arr.length); i++){
            System.out.println("Position: " + i);
        }
    }

    public static void main(String args[])
    {
        int arr[] = {64, 34, 25, 12, 22, 32, 11, 90};
        comp_Okn(arr);
    }

}
