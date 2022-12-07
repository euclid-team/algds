public class ComplexityONlogN {

    static void comp_Onlogn(int arr[]){
        //O(nlogn) complexity
        for (int i = 1; i <= arr.length; i++){
            for(int j = 1; j < arr.length; j = j * 2) {
                System.out.println("Position: " + i + " and " + j);
            }
        }
    }

    public static void main(String args[])
    {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        comp_Onlogn(arr);
    }
}
