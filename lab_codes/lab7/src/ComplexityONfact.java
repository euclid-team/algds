public class ComplexityONfact {

    static public long factorial(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorial(n - 1);
    }

    static void comp_Ofact(int arr[]){
        //O(n!) complexity
        for (int i = 1; i <= factorial(arr.length); i++){
            System.out.println("Position: " + i);
        }
    }

    public static void main(String args[])
    {
        int arr[] = {64, 34, 25, 12, 22, 32, 11, 90};
        comp_Ofact(arr);
    }

}
